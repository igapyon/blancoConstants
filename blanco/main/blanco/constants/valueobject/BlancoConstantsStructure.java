/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.constants.valueobject;

import java.util.List;

/**
 * BlancoConstants�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoConstantsStructure {
    /**
     * �t�B�[���h [name]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     */
    private String fName;

    /**
     * �t�B�[���h [package]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     */
    private String fPackage;

    /**
     * �t�B�[���h [description]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���̃o�����[�I�u�W�F�N�g�̐������L�ڂ��܂��B
     */
    private String fDescription;

    /**
     * �t�B�[���h [suffix]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̃T�t�B�b�N�X���w�肵�܂��B
     */
    private String fSuffix;

    /**
     * �t�B�[���h [access]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   ["public"]<br>
     * �N���X�̃A�N�Z�X�B�ʏ�� public�B
     */
    private String fAccess = "public";

    /**
     * �t�B�[���h [abstract]
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [false]<br>
     * ���ۃN���X���ǂ����B�ʏ�� false�B
     */
    private boolean fAbstract = false;

    /**
     * �t�B�[���h [adjustConstValue]
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [true]<br>
     * �萔�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B
     */
    private boolean fAdjustConstValue = true;

    /**
     * �t�B�[���h [extends]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p������N���X���w�肵�܂��B
     */
    private String fExtends;

    /**
     * �t�B�[���h [fieldList]
     *
     * ���ڂ̌^ [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * �K��l   [new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>()]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     */
    private List<blanco.constants.valueobject.BlancoConstantsFieldStructure> fFieldList = new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>();

    /**
     * �t�B�[���h [name]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     *
     * @param argName �t�B�[���h[name]�Ɋi�[�������l
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h[name]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     *
     * @return �t�B�[���h[name]�Ɋi�[����Ă���l
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [package]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * @param argPackage �t�B�[���h[package]�Ɋi�[�������l
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h[package]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * @return �t�B�[���h[package]�Ɋi�[����Ă���l
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���̃o�����[�I�u�W�F�N�g�̐������L�ڂ��܂��B
     *
     * @param argDescription �t�B�[���h[description]�Ɋi�[�������l
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h[description]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���̃o�����[�I�u�W�F�N�g�̐������L�ڂ��܂��B
     *
     * @return �t�B�[���h[description]�Ɋi�[����Ă���l
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [suffix]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̃T�t�B�b�N�X���w�肵�܂��B
     *
     * @param argSuffix �t�B�[���h[suffix]�Ɋi�[�������l
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * �t�B�[���h[suffix]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X���̃T�t�B�b�N�X���w�肵�܂��B
     *
     * @return �t�B�[���h[suffix]�Ɋi�[����Ă���l
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * �t�B�[���h [access]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �N���X�̃A�N�Z�X�B�ʏ�� public�B
     *
     * @param argAccess �t�B�[���h[access]�Ɋi�[�������l
     */
    public void setAccess(final String argAccess) {
        fAccess = argAccess;
    }

    /**
     * �t�B�[���h[access]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �K��l   ["public"]<br>
     * �N���X�̃A�N�Z�X�B�ʏ�� public�B
     *
     * @return �t�B�[���h[access]�Ɋi�[����Ă���l
     */
    public String getAccess() {
        return fAccess;
    }

    /**
     * �t�B�[���h [abstract]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * ���ۃN���X���ǂ����B�ʏ�� false�B
     *
     * @param argAbstract �t�B�[���h[abstract]�Ɋi�[�������l
     */
    public void setAbstract(final boolean argAbstract) {
        fAbstract = argAbstract;
    }

    /**
     * �t�B�[���h[abstract]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [false]<br>
     * ���ۃN���X���ǂ����B�ʏ�� false�B
     *
     * @return �t�B�[���h[abstract]�Ɋi�[����Ă���l
     */
    public boolean getAbstract() {
        return fAbstract;
    }

    /**
     * �t�B�[���h [adjustConstValue]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * �萔�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B
     *
     * @param argAdjustConstValue �t�B�[���h[adjustConstValue]�Ɋi�[�������l
     */
    public void setAdjustConstValue(final boolean argAdjustConstValue) {
        fAdjustConstValue = argAdjustConstValue;
    }

    /**
     * �t�B�[���h[adjustConstValue]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [boolean]<br>
     * �K��l   [true]<br>
     * �萔�l�̕ό`�������Ȃ����ǂ����B���Ȃ�ׂ��ό`�𗘗p���Ȃ����Ƃ𐄏��������B���v���O����API�Ƃ��Đ�������ۂɂ́A���̃t�B�[���h�𖾎��I�ɐݒ肵�Ă��������B
     *
     * @return �t�B�[���h[adjustConstValue]�Ɋi�[����Ă���l
     */
    public boolean getAdjustConstValue() {
        return fAdjustConstValue;
    }

    /**
     * �t�B�[���h [extends]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p������N���X���w�肵�܂��B
     *
     * @param argExtends �t�B�[���h[extends]�Ɋi�[�������l
     */
    public void setExtends(final String argExtends) {
        fExtends = argExtends;
    }

    /**
     * �t�B�[���h[extends]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �p������N���X���w�肵�܂��B
     *
     * @return �t�B�[���h[extends]�Ɋi�[����Ă���l
     */
    public String getExtends() {
        return fExtends;
    }

    /**
     * �t�B�[���h [fieldList]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     *
     * @param argFieldList �t�B�[���h[fieldList]�Ɋi�[�������l
     */
    public void setFieldList(final List<blanco.constants.valueobject.BlancoConstantsFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * �t�B�[���h[fieldList]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.util.List<blanco.constants.valueobject.BlancoConstantsFieldStructure>]<br>
     * �K��l   [new java.util.ArrayList<blanco.constants.valueobject.BlancoConstantsFieldStructure>()]<br>
     * �t�B�[���h��ێ����郊�X�g�B
     *
     * @return �t�B�[���h[fieldList]�Ɋi�[����Ă���l
     */
    public List<blanco.constants.valueobject.BlancoConstantsFieldStructure> getFieldList() {
        return fFieldList;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * �I�u�W�F�N�g�̃V�����[�͈͂ł���toString����Ȃ��_�ɒ��ӂ��ė��p���Ă��������B
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.constants.valueobject.BlancoConstantsStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",access=" + fAccess);
        buf.append(",abstract=" + fAbstract);
        buf.append(",adjustConstValue=" + fAdjustConstValue);
        buf.append(",extends=" + fExtends);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
