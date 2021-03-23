package com.encore.datatype;

/*
 * 1. 필드
 * 	  int 사이즈, char 컬러, float 가격, String 제조회사, String 재질 
 *    스크래치 여부를 알 수 있는 필드를 추가
 * 
 * 2. 메서드
 * 	  2개 정의
 * 	  - 필드값을 Test 클래스에서 받아서 필드에 입력하는 기능
 * 	  - 필드에 입려된 , 저장된 값을 콘솔창으로 출력하는 기능
 * -> 문제/

	/*1. 변수는 사용되는 '위치'에 따라서 Field와 Local variable로 구분
	 *필드 --> 클래스 선언 바로 밑, 메서드 블락 바깥
	 *Local variable(지역변수) --> 메서드 안에서 선언
	 *
	 *2. 
	 *로컬변수의 이름도 필드와 동일하게 직관적으로 작성한다.
	 *이름을 구분할 때는 필드 앞에 this를 붙이면 된다.
	 */
public class WhiteBoard {
	//클래스 전체에서 사용(Field)
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch) {//local V
		//이 해당 부분에서만 사용되는 변수
		//필드와 로컬변수의 이름이 같을 때, 구분하기 위해서 this를 필드 앞에 붙임
		//this는 해당클래스 자기자식...쯤으로 일단 해석
		this.size = size;           
		this.color = color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch;
	}
	
	public void printInfo() {
		System.out.println(size + "\t" + color + "\t" + price + "\t" + company + "\t" + material + "\t" + scratch);
	}
}
