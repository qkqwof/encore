package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		
		//1.scanner�� ���ؼ� month, day ���� ����
				/*
				 * md.month = 12; 
				 * md.day = 31;
				 */
				
				
				//�޼���� �����ؾ� ��
				//md.setMonth(13);
				//md.setDay(13);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �Է��ϼ���..��,�ϼ�>>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		System.out.println(md);
		
		md.setMonth(month);//calling (calling�� ������ ��) -->�ʵ� �ʱ�ȭ�� �ȵǾ ����� 0�� ����
		md.setDay(day);//calling --> �ʵ� �ʱ�ȭ�� �ȵǾ ����� 0�� ����
		
//		if(md.getMonth() !=0 && md.getDay() !=0) {   ==> ���� ���ƿ� �ʿ� ����
		System.out.println("������ " + md.getMonth()+"��"+md.getDay()+"�� �Դϴ�.");
//		}
	}

}
