package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		//1.Account type�� �迭�� ����....������� 3
		Account[] acc = new Account[3];
		for(int i = 0;i<acc.length;i++) System.out.println(acc[i]);
		System.out.println("�ּҰ�: "+ acc);
		//2.������ ĭ�� ����,����,�츮���� ������ ����
		acc[0] = new Account(1000.0,"��������");
		acc[1] = new Account(30000.0,"��������");
		acc[2] = new Account(40000.0,"�츮����");
		//3. FOR���� ����ؼ� ������ Account������ �ַܼ� ���
		for(int i = 0;i<acc.length;i++) {
			System.out.println(acc[i]);//�ּҰ�
			System.out.println(acc[i].getDetail());
		}

	}

}
