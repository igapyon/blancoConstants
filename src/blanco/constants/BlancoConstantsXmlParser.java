/*
 * blanco Framework
 * Copyright (C) 2004-2007 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.constants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import blanco.commons.util.BlancoStringUtil;
import blanco.constants.message.BlancoConstantsMessage;
import blanco.constants.valueobject.BlancoConstantsFieldStructure;
import blanco.constants.valueobject.BlancoConstantsStructure;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * blancoConstants�� ����XML�t�@�C���`�����p�[�X(�ǂݏ���)����N���X�B
 * 
 * @author IGA Tosiki
 */
public class BlancoConstantsXmlParser {
    /**
     * ���b�Z�[�W�B
     */
    private final BlancoConstantsMessage fMsg = new BlancoConstantsMessage();

    /**
     * ����XML�t�@�C����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ����XML�t�@�C���B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoConstantsStructure[] parse(final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);

    }

    /**
     * ����XML�t�@�C���`����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argXmlDocument
     *            ����XML�t�@�C����XML�h�L�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoConstantsStructure[] parse(
            final BlancoXmlDocument argXmlDocument) {
        final List<BlancoConstantsStructure> listStructure = new ArrayList<BlancoConstantsStructure>();

        // ���[�g�G�������g���擾���܂��B
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // ���[�g�G�������g�������ꍇ�ɂ͏������f���܂��B
            return null;
        }

        // sheet(Excel�V�[�g)�̃��X�g���擾���܂��B
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");

        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoConstantsStructure objClassStructure = parseElementSheet(elementSheet);
            if (objClassStructure != null) {
                // ����ꂽ�����L�����܂��B
                listStructure.add(objClassStructure);
            }
        }

        final BlancoConstantsStructure[] result = new BlancoConstantsStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * ����XML�t�@�C���`���́usheet�vXML�G�������g���p�[�X���āA�o�����[�I�u�W�F�N�g�����擾���܂��B
     * 
     * @param argElementSheet
     *            ����XML�t�@�C���́usheet�vXML�G�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���B�uname�v��������Ȃ������ꍇ�ɂ� null��߂��܂��B
     */
    public BlancoConstantsStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoConstantsStructure objClassStructure = new BlancoConstantsStructure();
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoconstants-common");
        if (listCommon == null || listCommon.size() == 0) {
            // common�������ꍇ�ɂ̓X�L�b�v���܂��B
            return null;
        }
        final BlancoXmlElement elementCommon = listCommon.get(0);
        objClassStructure.setName(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "name"));
        objClassStructure.setPackage(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "package"));
        objClassStructure.setDescription(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "description"));
        objClassStructure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "suffix"));
        objClassStructure.setAccess(BlancoXmlBindingUtil.getTextContent(
                elementCommon, "access"));
        objClassStructure.setAbstract("true".equals(BlancoXmlBindingUtil
                .getTextContent(elementCommon, "abstract")));
        objClassStructure.setAdjustConstValue("true"
                .equals(BlancoXmlBindingUtil.getTextContent(elementCommon,
                        "adjustConstValue")));
        objClassStructure
                .setFieldList(new ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>());

        if (BlancoStringUtil.null2Blank(objClassStructure.getName()).trim()
                .length() == 0) {
            // ���O���������̂̓X�L�b�v���܂��B
            return null;
        }

        if (objClassStructure.getPackage() == null) {
            throw new IllegalArgumentException(fMsg
                    .getMbctji01(objClassStructure.getName()));
        }

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> extendsList = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet,
                        "blancoconstants-extends");
        if (extendsList != null && extendsList.size() != 0) {
            final BlancoXmlElement elementExtendsRoot = extendsList.get(0);
            objClassStructure.setExtends(BlancoXmlBindingUtil.getTextContent(
                    elementExtendsRoot, "name"));
        }

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listList = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoconstants-list");
        if (listList != null && listList.size() != 0) {
            final BlancoXmlElement elementListRoot = (BlancoXmlElement) listList
                    .get(0);
            final List<blanco.xml.bind.valueobject.BlancoXmlElement> listChildNodes = BlancoXmlBindingUtil
                    .getElementsByTagName(elementListRoot, "field");
            for (int index = 0; index < listChildNodes.size(); index++) {
                if (listChildNodes.get(index) instanceof BlancoXmlElement == false) {
                    continue;
                }
                final BlancoXmlElement elementList = (BlancoXmlElement) listChildNodes
                        .get(index);
                final BlancoConstantsFieldStructure fieldStructure = new BlancoConstantsFieldStructure();

                fieldStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                        elementList, "no"));
                fieldStructure.setName(BlancoXmlBindingUtil.getTextContent(
                        elementList, "name"));
                if (fieldStructure.getName() == null
                        || fieldStructure.getName().trim().length() == 0) {
                    continue;
                }

                fieldStructure.setType(BlancoXmlBindingUtil.getTextContent(
                        elementList, "type"));
                fieldStructure.setValue(BlancoXmlBindingUtil.getTextContent(
                        elementList, "value"));
                fieldStructure.setDescription(BlancoXmlBindingUtil
                        .getTextContent(elementList, "description"));

                if (fieldStructure.getType() == null
                        || fieldStructure.getType().trim().length() == 0) {
                    throw new IllegalArgumentException(fMsg.getMbctji02(
                            objClassStructure.getName(), fieldStructure
                                    .getName()));
                }

                if (fieldStructure.getValue() == null
                        || fieldStructure.getValue().trim().length() == 0) {
                    throw new IllegalArgumentException(fMsg.getMbctji03(
                            objClassStructure.getName(), fieldStructure
                                    .getName()));
                }

                objClassStructure.getFieldList().add(fieldStructure);
            }
        }

        return objClassStructure;
    }
}
