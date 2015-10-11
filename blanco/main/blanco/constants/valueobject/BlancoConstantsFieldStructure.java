/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.constants.valueobject;

/**
 * BlancoConstants�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoConstantsFieldStructure {
    /**
     * �t�B�[���h [no]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���ڔԍ�
     */
    private String fNo;

    /**
     * �t�B�[���h [name]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h�����w�肵�܂��B�K�{���ڂł��B
     */
    private String fName;

    /**
     * �t�B�[���h [type]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B
     */
    private String fType;

    /**
     * �t�B�[���h [value]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �l���w�肵�܂��B
     */
    private String fValue;

    /**
     * �t�B�[���h [description]
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h��JavaDoc���w�肵�܂��B
     */
    private String fDescription;

    /**
     * �t�B�[���h [no]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���ڔԍ�
     *
     * @param argNo �t�B�[���h[no]�Ɋi�[�������l
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * �t�B�[���h[no]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * ���ڔԍ�
     *
     * @return �t�B�[���h[no]�Ɋi�[����Ă���l
     */
    public String getNo() {
        return fNo;
    }

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
     * �t�B�[���h [type]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B
     *
     * @param argType �t�B�[���h[type]�Ɋi�[�������l
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * �t�B�[���h[type]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �^�����p�b�P�[�W���̃t���C���t�Ŏw�肵�܂��B�K�{���ڂł��B
     *
     * @return �t�B�[���h[type]�Ɋi�[����Ă���l
     */
    public String getType() {
        return fType;
    }

    /**
     * �t�B�[���h [value]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �l���w�肵�܂��B
     *
     * @param argValue �t�B�[���h[value]�Ɋi�[�������l
     */
    public void setValue(final String argValue) {
        fValue = argValue;
    }

    /**
     * �t�B�[���h[value]�̃Q�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �l���w�肵�܂��B
     *
     * @return �t�B�[���h[value]�Ɋi�[����Ă���l
     */
    public String getValue() {
        return fValue;
    }

    /**
     * �t�B�[���h [description]�̃Z�b�^�[���\�b�h
     *
     * ���ڂ̌^ [java.lang.String]<br>
     * �t�B�[���h��JavaDoc���w�肵�܂��B
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
     * �t�B�[���h��JavaDoc���w�肵�܂��B
     *
     * @return �t�B�[���h[description]�Ɋi�[����Ă���l
     */
    public String getDescription() {
        return fDescription;
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
        buf.append("blanco.constants.valueobject.BlancoConstantsFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",value=" + fValue);
        buf.append(",description=" + fDescription);
        buf.append("]");
        return buf.toString();
    }
}
