package com.encore.child;

/*
 * 부모 클래스 Employee로부터 모든 것을 물려받고
 * 자기 자신만의 멤버를 추가하는 자식클래스....
 * 
 * 생성자 호출 ---> 객체 생성
 */
import com.encore.parent.Employee;
import com.encore.util.Mydate;

public class Manager extends Employee{

	//자식만의 멤버를 추가
	private String dept;
	
	/*
	 * 자식생성자...객체 생성알고리즘
	 * 자식 생성자{첫라인에서 무조건 부모기본 생성자 호출이 일어난다
	 */
	public Manager(String name, Mydate birthDay, double salary,String dept) {//자식이 생성되려할 때...
		//부모기본생성자호출...(무조건)..super();
		super(name, birthDay, salary);
		this.dept = dept;
	}
	
	//Method Overriding
	/*
	 * 상속관계에서만 일어난다.
	 * 1step : 부모가 가진 기능을 물려받는다....호출한다
	 * 2step : 그걸 자신에 맞게 고쳐쓴다.
	 * 
	 * Overriding의 Rule
	 * 0.상속관계의 두 클래스 사이에서 일어난다.
	 * 1.메서드 선언부는 모두 일치
	 * 2.구현부는 반드시 달라야 한다.
	 * --->부모 메소드와 자식 메소드는 이름은 같지만 하는 일이 달라졌음으로 새로운 메소드가 만들어짐
	 * 	   (메소드 재정의)
	 */
	
	public String getDetails() {
		return super.getDetails() +  "," + dept; //구현부 고쳐서 씀
	}
}
