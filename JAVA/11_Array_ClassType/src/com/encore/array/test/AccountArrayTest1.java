package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		//1.Account type의 배열을 생성....사이즈는 3
		Account[] acc = new Account[3];
		for(int i = 0;i<acc.length;i++) System.out.println(acc[i]);
		System.out.println("주소값: "+ acc);
		//2.각각의 칸에 신한,국민,우리은행 통장을 생성
		acc[0] = new Account(1000.0,"신한은행");
		acc[1] = new Account(30000.0,"국민은행");
		acc[2] = new Account(40000.0,"우리은행");
		//3. FOR문을 사용해서 각각의 Account정보를 콘솔로 출력
		for(int i = 0;i<acc.length;i++) {
			System.out.println(acc[i]);//주소값
			System.out.println(acc[i].getDetail());
		}

	}

}
