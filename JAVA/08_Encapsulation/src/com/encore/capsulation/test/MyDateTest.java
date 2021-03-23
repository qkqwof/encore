package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		
		//1.scanner를 통해서 month, day 값을 받음
				/*
				 * md.month = 12; 
				 * md.day = 31;
				 */
				
				
				//메서드로 접근해야 됌
				//md.setMonth(13);
				//md.setDay(13);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세요..월,일순>>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		System.out.println(md);
		
		md.setMonth(month);//calling (calling이 수행이 됨) -->필드 초기화가 안되어서 결과에 0이 생성
		md.setDay(day);//calling --> 필드 초기화가 안되어서 결과에 0이 생성
		
//		if(md.getMonth() !=0 && md.getDay() !=0) {   ==> 굳이 돌아올 필요 없음
		System.out.println("오늘은 " + md.getMonth()+"월"+md.getDay()+"일 입니다.");
//		}
	}

}
