package com.encore.javadoc;

//Single Comment
//

//Multi Line Comment
/*
 * 
 */

/**
 * 
 * @author Park Jae Young(�̸� �ޱ�)
 * @since JDK 1.8.0_241(�ۼ��� �ڵ��� ���� �ޱ�)
 * @version [�ҽ��ڵ� ���� ����]... Source Code Version Level1
 * 
 */

public class JavaComment {
	/**
	 * ���ھ� ��ī���̿��� �����ϴ� �л��� �̸�
	 * 
	 */
	public String name;
	/**
	 * ���ھ� ��ī���̿��� �����ϴ� �л��� ���̵�
	 */
	public int stuId;
	
	//void �ƴ� ��, return Ű���� ���;� ��
	/**
	 * 
	 * @param java test score
	 * @param python test score
	 * @return �ڹٿ� ���̽� ������ �ջ����� �л��� ���������� ��ȯ
	 */
	public int scoreSum(int java, int python) {
		return java + python;
		
	}
}
//�ּ��� �׽�Ʈ Ŭ������ �ٴ� �� �ƴ�.

//(�ѱ� ���ڵ�) -> -encoding euc-kr -charset euc-kr -docencoing euc-kr
//�ڱⰡ § �ڵ带 �����ῡ�� �����.(���� ���������� ���� ���� ���� ���� �־...)
