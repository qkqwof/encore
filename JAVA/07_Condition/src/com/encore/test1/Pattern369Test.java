package com.encore.test1;

import java.util.*;

/*
 * Scanner 객체를 통해서
 * 10~99 사이의 정수를 하나 입력받는다.(2자리수의 숫자)
 * 
 * 3,6,9... 즉 3의 배수값이 포함되어 있는지를 패턴으로 적용하는 알고리즘.
 * 하나 있으면 --> @
 * 두개 있으면 --> @@
 * 없으면     --> 숫자
 * 
 * 예를 들어서 
 * 31 --> @
 * 11 --> 11
 * 98 --> @
 * 29 --> @
 * 96 --> @@
 * 
 * 힌트 
 * 2자리수...
 * 앞자리 --- /
 * 끝자리 --- %
 * 
 * 제어문 연습하기
 */

public class Pattern369Test {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("10~99 사이의 정수를 입력해주세요>>");
	int num = sc.nextInt();
	int digit10 = num/10;
	int digit1 = num%10;
	
	int clapCnt = 0; // 박수 횟수
	
	if(digit1%3 == 0 && digit1 != 0 ) {
		clapCnt++;
	} else if(digit10%3 == 0 && digit10 !=0) {
		clapCnt++;
	}
	
	if(clapCnt == 2) {
		System.out.println("@@");
	}else if(clapCnt == 1) {
		System.out.println("@");
	}
}
}