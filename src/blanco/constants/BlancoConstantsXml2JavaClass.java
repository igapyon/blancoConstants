/*
 * blanco Framework
 * Copyright (C) 2004-2005 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.constants;

import java.io.File;
import java.io.IOException;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.resourcebundle.BlancoConstantsResourceBundle;
import blanco.constants.valueobject.BlancoConstantsFieldStructure;
import blanco.constants.valueobject.BlancoConstantsStructure;

/**
 * ����XML�t�@�C������Java�\�[�X�R�[�h��������������N���X�ł��B
 * 
 * �萔��`��(XLS)����\�[�X�R�[�h��������������v���W�F�N�g�̈ꕔ�ł��B
 * 
 * @author IGA Tosiki
 */
public class BlancoConstantsXml2JavaClass {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoConstantsMessage fMsg = new BlancoConstantsMessage();

    /**
     * ���\�[�X�o���h���ւ̃A�N�Z�T�N���X�̃I�u�W�F�N�g�B
     */
    private final BlancoConstantsResourceBundle fBundle = new BlancoConstantsResourceBundle();

    /**
     * �����I�ɗ��p����blancoCg�p�t�@�N�g���B
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * �����I�ɗ��p����blancoCg�p�\�[�X�t�@�C�����B
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * �����I�ɗ��p����blancoCg�p�N���X���B
     */
    private BlancoCgClass fCgClass = null;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * ����XML�t�@�C������Java�\�[�X�R�[�h�������������܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ValueObject�Ɋւ��郁�^��񂪊܂܂�Ă���XML�t�@�C��
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h������f�B���N�g��
     * @throws IOException
     *             ���o�͗�O�����������ꍇ
     */
    public void process(final File argMetaXmlSourceFile,
            final File argDirectoryTarget) throws IOException {
        final BlancoConstantsStructure[] structures = new BlancoConstantsXmlParser()
                .parse(argMetaXmlSourceFile);
        for (int index = 0; index < structures.length; index++) {
            // ����ꂽ��񂩂�Java�\�[�X�R�[�h�𐶐����܂��B
            structure2Source(structures[index], argDirectoryTarget);
        }
    }

    /**
     * ���W���ꂽ�������ɁAJava�\�[�X�R�[�h���o�͂��܂��B
     * 
     * @param processStructure
     *            �����\��
     * @param directoryTarget
     *            �o�͐�t�H���_�B
     */
    public void structure2Source(
            final BlancoConstantsStructure processStructure,
            final File directoryTarget) {

        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getPackage(), null);
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(processStructure.getName()
                + BlancoStringUtil.null2Blank(processStructure.getSuffix()),
                BlancoStringUtil.null2Blank(processStructure.getDescription()));
        fCgSourceFile.getClassList().add(fCgClass);

        // �N���X�̃A�N�Z�X��ݒ�B
        fCgClass.setAccess(processStructure.getAccess());
        // ���ۃN���X���ǂ����B
        fCgClass.setAbstract(processStructure.getAbstract());

        // �p��
        if (BlancoStringUtil.null2Blank(processStructure.getExtends()).length() > 0) {
            fCgClass.getExtendClassList().add(
                    fCgFactory.createType(processStructure.getExtends()));
        }

        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            BlancoConstantsFieldStructure fieldLook = (BlancoConstantsFieldStructure) processStructure
                    .getFieldList().get(indexField);
            final BlancoCgField field = fCgFactory.createField(fieldLook
                    .getName(), fieldLook.getType(), "");
            fCgClass.getFieldList().add(field);

            field.setAccess("public");
            field.setFinal(true);
            field.setStatic(true);

            if (fieldLook.getNo() != null) {
                field.getLangDoc().getDescriptionList().add(
                        fBundle.getXml2javaclassFieldNo(fieldLook.getNo()));
            }
            if (fieldLook.getDescription() != null) {
                field.getLangDoc().getDescriptionList().add(
                        fieldLook.getDescription());
            }

            if (processStructure.getAdjustConstValue() == false) {
                // ���̂܂ܑ�����܂��B
                field.setDefault(fieldLook.getValue());
            } else {
                // �^�ɂ���ăf�t�H���g�l�����������܂��B
                // �Ή����Ȃ��^���^����ꂽ�ꍇ�ɂ͗�O�𔭐����܂��B
                if (fieldLook.getType().equals("java.lang.String")) {
                    field.setDefault("\""
                            + BlancoJavaSourceUtil
                                    .escapeStringAsJavaSource(fieldLook
                                            .getValue()) + "\"");
                } else if (fieldLook.getType().equals("boolean")
                        || fieldLook.getType().equals("short")
                        || fieldLook.getType().equals("int")
                        || fieldLook.getType().equals("long")) {
                    field.setDefault(fieldLook.getValue());
                } else if (fieldLook.getType().equals("java.lang.Boolean")
                        || fieldLook.getType().equals("java.lang.Integer")
                        || fieldLook.getType().equals("java.lang.Long")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(fieldLook
                                    .getType()) + "(" + fieldLook.getValue()
                            + ")");
                } else if (fieldLook.getType().equals("java.lang.Short")) {
                    field.setDefault("new "
                            + BlancoNameUtil.trimJavaPackage(fieldLook
                                    .getType()) + "((short) "
                            + fieldLook.getValue() + ")");
                } else if (fieldLook.getType().equals("java.math.BigDecimal")) {
                    fCgSourceFile.getImportList().add("java.math.BigDecimal");
                    field.setDefault("new BigDecimal(\"" + fieldLook.getValue()
                            + "\")");
                } else if (fieldLook.getType().equals("java.util.ArrayList")) {
                    // ArrayList�̏ꍇ�ɂ́A�^����ꂽ���������̂܂܍̗p���܂��B
                    fCgSourceFile.getImportList().add("java.util.ArrayList");
                    field.setDefault(fieldLook.getValue());
                } else {
                    throw new IllegalArgumentException(fMsg.getMbctji04(
                            processStructure.getName(), fieldLook.getName(),
                            fieldLook.getValue(), fieldLook.getType()));
                }
            }
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }
}
