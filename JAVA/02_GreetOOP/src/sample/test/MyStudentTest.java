package sample.test;   //OOP �ƴ�

import sample.MyStudent;

/*
 * 1. MyStudent ��ü ����....ms
 * 2. MyStudent �޼ҵ��� ����
 */

public class MyStudentTest {

	public static void main(String[] args) {
		// 1. ��ü����(4��) == ������ҵ��� �޸𸮿� �ø���. - �� �Ҵ�
		MyStudent ms = new MyStudent();  
		// 2. �޼��� ���� - ȣ��
		// �� �ڵ�� '���뼺'�� ������ - ���� ���� �ϵ� �ڵ��Ǹ� ���α׷��̶�� �� �� ����
		ms.name = "���翵";
		ms.age = 28;
		ms.address = "����";
		ms.printInfo();  // ms�� �ִ� printInfo�� ȣ��
	}
}