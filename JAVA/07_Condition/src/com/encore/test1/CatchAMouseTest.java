package com.encore.test1;

import java.util.Scanner;

/*
 * 제어문을 사용한 알고리즘을 간단하게 다뤄보자....
 */

public class CatchAMouseTest {

	//알고리즘 푸는 메소드는 거의 static
	private static String algoSolv1(int cata, int catb, int mouse) {
		//if,else if, else 구문과 Math.abs()를 이용해서 알고리즘 구현하세요...
		if(Math.abs(cata-mouse) > Math.abs(catb-mouse)) {
			return "cata will catch the mouse!!";
		} else if(Math.abs(cata-mouse) < Math.abs(catb-mouse)){
			return "catb will catch the mouse!!";
		} else {
			return "Mouse Escape!!";
		}
	}
	
	public static void main(String[] args) {
	//1. 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		//순서대로 3개의 값을 입력 받는다...
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();

		String result = algoSolv1(cata, catb, mouse);
		System.out.println("Result :: " + result);
		
	}

}

