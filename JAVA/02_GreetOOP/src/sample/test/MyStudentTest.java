package sample.test;   //OOP 아님

import sample.MyStudent;

/*
 * 1. MyStudent 객체 생성....ms
 * 2. MyStudent 메소드의 동작
 */

public class MyStudentTest {

	public static void main(String[] args) {
		// 1. 객체생성(4개) == 구성요소들을 메모리에 올린다. - 값 할당
		MyStudent ms = new MyStudent();  
		// 2. 메서드 접근 - 호출
		// 이 코드는 '재사용성'이 떨어짐 - 실제 값이 하드 코딩되면 프로그램이라고 할 수 없음
		ms.name = "박재영";
		ms.age = 28;
		ms.address = "제주";
		ms.printInfo();  // ms에 있는 printInfo를 호출
	}
}