package sample.test;   //OOP �ƴ�

import sample.MyStudent2;

/*
 * MystudentTest.java�� ������
 * �л����� �þ ������
 * ������ �ʵ忡 �ش��ϴ� ���� ���� �־���� �ϴ� ���ŷο��� ����.
 * 
 * ���α׷��� �ۼ��� �������� �ϵ��ڵ� �Ǿ����� �׷��� �ȵ�.
 * �ذ�å?
 * 1) �ʵ忡 ���� ���� ������ �ȵȴ�.
 * 2) ���� �ʵ忡 �ԷµǴ� ����� ���Ӱ� �ϳ� ����
 */

public class MyStudentTest2 {

	public static void main(String[] args) {
		/*
		 * 1. MyStudent2 ��ü 3�� ����...m1,m2,m3 �̸�����
		 * 2. ���� ��ü�� ���� �Ҵ�...�ʵ� �ʱ�ȭ
		 * 3. ���� ��ü�� ������ �ܼ�â���� ���
		 * 
		 * ==>�� �κ� �ݵ�� �ذ�
		 */
		
		//��ü����
		MyStudent2 m1 = new MyStudent2(); 
		MyStudent2 m2 = new MyStudent2();
		
		m1.setField("AAA", 27, "Texas");
		m2.setField("BBB", 29, "LA");
		
		m1.printInfo();
		m2.printInfo();
		
	}
}