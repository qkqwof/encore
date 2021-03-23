package com.encore.cons.test;

import com.encore.cons.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		//객체 생성
		Shirt longT = new Shirt("나이키",120.0f,true); //메서드와 동일하게 쓸 수 있음
		Shirt halfT = new Shirt("아디다스",130.0f,true);
		
		System.out.println(longT.getDetails());
		System.out.println(halfT.getDetails());
	}

}
