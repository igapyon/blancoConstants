/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.constants.task;

import java.io.IOException;

import blanco.constants.task.valueobject.BlancoConstantsProcessInput;

/**
 * ���� [BlancoConstantsProcess]�C���^�t�F�[�X�B
 *
 * ���̃C���^�t�F�[�X���p������ [blanco.constants.task]�p�b�P�[�W��[BlancoConstantsProcess]�N���X���쐬���Ď��ۂ̃o�b�`�������������Ă��������B<br>
 *
 */
interface BlancoConstantsProcess {
    /**
     * �N���X���C���X�^���X�����ď��������s����ۂ̃G���g���|�C���g�ł��B
     *
     * @param input �����̓��̓p�����[�^�B
     * @return �����̎��s���ʁB
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    int execute(final BlancoConstantsProcessInput input) throws IOException, IllegalArgumentException;
}
