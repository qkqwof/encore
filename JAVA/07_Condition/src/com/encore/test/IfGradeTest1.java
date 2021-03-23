package com.encore.test;

import java.util.Scanner;

/*
 * 제어문
 * 조건을 만족할 때만 문장을 수행하도록 제어하는 문장.
 * 1)if / if~else / else
 * 	 if(조건식=>연산을 수행한 결과로 true나 false가 나와야 함) {
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
 * 해당하는 Case의 문장을 실행하도록 제어
 * 
 * 	switch(변하는 변수 예를 들어 grade){
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
 * 		default://(if문에서 else에 해당)
 * 		System.out.println("Try");
 */

public class IfGradeTest1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("당신의 시험 성적을 입력하세요.>>");
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
