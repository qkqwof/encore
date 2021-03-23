package greet; //패키지 선언 부분 -> 소스코드 맨 처음에 옴
			   //				 패키지 이름은 전부 소문자

public class MyGreet /* MyGreet -> 내가 만든거(=사용자 정의 클래스)user definition */{

	public static void main(String[] args)  {
		System.out.println("Hello Java");                                            // 문법은 자바지만 자바가 아님
																					 // 객체지향형(자바의 특성)이 아니기 때문
		
	} //main 메서드(기능-무슨 일을 하는지 기술)
} //class

// 클래스 이름은 무조건 대문자
// 이름을 변결할 때 -> 마우스 오른쪽 버튼 후 refactor -> rename
// 이클립스 툴에서 주황색으로 나오는 애들 -> 키워드(예약어)
// 키워드들의 공통점 -> 전부 다 소문자
// String, System -> 라이브러리(API)

// 클래스 -> 1. user definition class
//		   2. API(다른 이가 만들어서 실행 파일로 제공)

/*
 * 01 프로젝트의 문제점
 * Hello Java라는 인사말만 출력하는 코드가 생산된다.
 * 다른 인사말을 출력하려면 다시 코드를 수정해야 한다.
 * --> 유지보수성, 재사용성이 낮은 코드
 */
