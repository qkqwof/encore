package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

/*
 * WhiteBoardTest1...Test, 실행 클래스라 부름
 * 
 * Test, 실행 클래스가 하는 일
 * 1) 객체를 생성한다. == 구성요소(식구)를 메모리에 올린다.
 * 2) 식구에 접근
 * 		필드 ----   값할당 ---- 실제값이 하드코딩되면 그것은 프로그램이 아니다... 하면 안됨
 * 		메소드 ----  Calling 
 */

public class WhiteBoardTest1 {

	public static void main(String[] args) {
		/*
		 * WhiteBoard 객체를 wb라는 이름으로 하나 생성
		 * 필드에 값을 입력
		 * 입력된 값을 출력
		 */

		WhiteBoard wb = new WhiteBoard();    //float(32), double(64)
		
		wb.setInfo(100,'B',120.0f,"Encore" ,"Plastic",true);    //64->32(큰 곳에서 작은 곳으로 가면 에러가 남)
		wb.printInfo();
	}

}
