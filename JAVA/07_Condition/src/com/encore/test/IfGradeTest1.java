package com.encore.test;

import java.util.Scanner;

/*
 * ���
 * ������ ������ ���� ������ �����ϵ��� �����ϴ� ����.
 * 1)if / if~else / else
 * 	 if(���ǽ�=>������ ������ ����� true�� false�� ���;� ��) {
 * 		//code block1
 * 		}else if(i==1) {
 * 		//code block2
 * 		}else if(i==2) {
 * 		//code block2
 *  	}else {
 *  	//code block3
 *  	}
 * 
 * 2)switch
 * �ش��ϴ� Case�� ������ �����ϵ��� ����
 * 
 * 	switch(���ϴ� ���� ���� ��� grade){
 * 		case 90:
 * 		case 95:
 * 			System.out.println("A grade...");
 * 		break;
 * 		
 * 		case 80:
 * 		case 85:
 * 			System.out.println("A grade...");
 * 		break;
 * 
 * 		default://(if������ else�� �ش�)
 * 		System.out.println("Try");
 */

public class IfGradeTest1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("����� ���� ������ �Է��ϼ���.>>");
	int score = sc.nextInt();
	
	if(score<100 && score>=90) {//90~100
		System.out.println("A grade...");
	} else if(score<90 && score>=80) {
		System.out.println("B grade...");
	}else if(score<80 && score>=70) {
		System.out.println("C grade...");
	} else if(score<70 && score>=60) {
		System.out.println("D grade...");
	} else {
		System.out.println("Try Again...!!!");
		}
	}

}
