 package greet.test;

import greet.MyGreet;

/*
 * MyGreet 클래스의 메서드를 동작시키는 실행 클래스... Test클래스, 실행 클래스
 * 
 * 1. 클래스 객체를 생성 == 식구(구성요소)들이 메모리에 올라간다.
 * 2. 접근(사용)
 * 		1) 필드에 접근 --- 값할당
 * 		2) 메서드에 접근 --- 호출(calling)
 */		

public class MyGreetTest {

	public static void main(String[] args) {// 메인에서 시작
		//객체를 생성
		/*
		 * 메모리에 mg라는 이름으로 객체가 올라감..
		 * 클래스의 구성요소들이 올라감
		 * MyGreet에 메모리 2개 올라감 -> 필드, 메소드
		 * 
		 * 메모리 올리는 이유(객체 생성하는 이유)??
		 * 메모리 올라간 애들만 접근해서 사용할 수 있음.
		 */
		MyGreet mg = new MyGreet();       
		mg.sayHello("박재영"); // calling 
	}
}// 결국에는 테스트에서 끝남.

