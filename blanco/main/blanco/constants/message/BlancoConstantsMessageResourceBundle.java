/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 * ���\�[�X�o���h����`������쐬���ꂽ���\�[�X�o���h���N���X�B
 */
package blanco.constants.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * ���\�[�X�o���h����`[BlancoConstantsMessage/���b�Z�[�W��`[BlancoConstants]�������I�ɗ��p���郊�\�[�X�o���h���N���X�B]�̃��\�[�X�o���h���N���X�B
 *
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 */
class BlancoConstantsMessageResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoConstantsMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoConstantsMessage]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoConstantsMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoConstantsMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoConstantsMessage]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoConstantsMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoConstantsMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoConstantsMessage]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoConstantsMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/constants/message/BlancoConstantsMessage", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI01]
     *
     * [�萔��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBCTJI01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbctji01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�萔��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI02]
     *
     * [�萔��`ID[{0}]�̃t�B�[���h[{1}]�̌^���w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBCTJI02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbctji02(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�萔��`ID[{0}]�̃t�B�[���h[{1}]�̌^���w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI03]
     *
     * [�萔��`ID[{0}]�̃t�B�[���h[{1}]�̒l���w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBCTJI03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbctji03(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�萔��`ID[{0}]�̃t�B�[���h[{1}]�̒l���w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI03");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJI04]
     *
     * [�萔��`ID[{0}]�̃t�B�[���h[{1}]�́u�l({2})�v���Z�b�g����Ă��܂��B�������u{3}�v�̓T�|�[�g���܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBCTJI04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbctji04(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�萔��`ID[{0}]�̃t�B�[���h[{1}]�́u�l({2})�v���Z�b�g����Ă��܂��B�������u{3}�v�̓T�|�[�g���܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJI04");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoConstantsMessage], key[MBCTJA01]
     *
     * [���^�f�B���N�g��[{0}]�����݂��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MBCTJA01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMbctja01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���^�f�B���N�g��[{0}]�����݂��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBCTJA01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
