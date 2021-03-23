package com.encore.cons;
//개발자 정보를 담고 있는 클래스...

import com.encore.util.Mydate;

public class Programmer {
	
	//1.필드 선언...
	public String name;   //API(라이브러리)
	public Mydate birthday;   //user definition
	public float salary;
	public int bonus;
	//클래스를 만들 떄, 제일 중요한 것은 필드(멤버변수) 선언!!
	
	//2. 값을 어떻게 필드에 주입, 할당, 저장? 
	/*
	 * public void setProgrammer(String name, Mydate birthday,float salary, int
	 * bonus) { this.name = name; this.birthday = birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	//생성자 추가
	public Programmer() {}//기본 생성자....필드 초기화 안한다.
	public Programmer(String name,Mydate birthday,float salary,int bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	/*public Programmer(String name, Mydate birthday, float salary, int bonus) {
	 * //명시적 생성자...필드 초기화
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}*/
	
	//추가...개발자의 연봉을 리턴하는 기능을 정의
	public float getAnnualSalary() {
		return salary * 12 + bonus;
	}
	
	//3.필드값 받아오기
	
	public String getProgrammer() {
		return name + "," + birthday.getDate() + "," + salary + "," + bonus;
	//어디로 리턴 될까? 호출한 곳으로!!(test의 pg.getProgrammer())
	}
	
	//기능 추가
	public String getPeter() {
		return name + "의 연봉은 " + salary +"달러 입니다.";
	}
	
	public String getName() {
		return name;
	}
	
	
}
