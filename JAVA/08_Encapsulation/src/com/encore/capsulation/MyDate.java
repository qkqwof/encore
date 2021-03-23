package com.encore.capsulation;

/*
 * Encapsulation Pattern
 * 1. 다른 클래스에서 직접적으로 접근 할 수 없ㄷ록
 *  필드 앞에 ---->private 지정
 * 2. 클래스의 필드의 접근은 setter()/getter()로 한다
 * 	그리고 얘네들이 다른 클래스에서도 서로 접근할 수 있도록 public
 * 	public void setXxx(o)
 * 	public int getXxx(x)
 * 3. setXxx() {
 *		//첫라인에서(필드 초기화 되기 직전)에 타당한 값만 받을 수 있도록 로직을 제어
 *    }
 *    
 *    setDay()
 *    1,3,5,7,8,10,12월 --> 1~31
 *    2월 ---> 28일까지
 *    4,6,9,11 ----> 30일까지
 *    switch, if
 *    
 *    ::
 *    출력결과에 
 *    0이 안나오도록 해야 함...
 */		

public class MyDate {
	//private 지정하면 같은 클래스에서만 접근을 허용
	private int month;// setMonth가 동작할 때,1~12 사이의 값 할당
	private int day;
	
	/*public MyDate(int month, int day) {
		this.month = month;
		this.day = day;
	}*/
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		//2. 제어문 1~12월에 해당하는 값만 처리...나머지 메시지...
		if(month>=1 && month<=12) {
			this.month = month;
		} else { //1~12월의 값이 아닌 경우는...
			System.out.println("해당 월이 아닙니다.");
			//return;//다시 월을 입력하도록 함.
			//month가 잘 못 되었는데 day로 넘어갈 이유가 없음
			//프로그램을 빠져나온다.
			System.exit(0);
		}
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//setDay()
		//    1,3,5,7,8,10,12월 --> 1~31
		//    2월 ---> 28일까지
		//    4,6,9,11 ----> 30일까지
		switch(month) {
		case 2:
			if(day>=1 && day<=28) {
				this.day = day;
			} else {
				System.out.println("일을 잘못 입력");
				//return;
				//month가 잘 못 되었는데 day로 넘어갈 이유가 없음
				//프로그램을 빠져나온다.
				System.exit(0);
			}
		break;	
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>=1 && day<=30) {
				this.day = day;
			} else {
				System.out.println("일을 잘못 입력");
				//return;
				//month가 잘 못 되었는데 day로 넘어갈 이유가 없음
				//프로그램을 빠져나온다.
				System.exit(0);
			}
		break;	
		default:
			if(day>=1 && day<=31) {
				this.day = day;
			} else {
				System.out.println("일을 잘못 입력");
				//return;
				//month가 잘 못 되었는데 day로 넘어갈 이유가 없음
				//프로그램을 빠져나온다.
				System.exit(0);
			}
		break;	
		}//switch
		
		
		
	}//setDay
	
	
}//class
