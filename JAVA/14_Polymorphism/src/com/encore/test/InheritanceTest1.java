package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.*;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Employee emp = new Employee("James",new Mydate(1982,3,2),23000.0);
		Manager m = new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT");
		Engineer eg = new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200);
		Secretary sc = new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA");
		
		//Robert가 부서를 바꾼다....IT --> Marketing 
		m.chageDept("Marketing");
		
		System.out.println(emp);
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		
		System.out.println(m);
		System.out.println(m.toString());
		
		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(sc.getDetails());
		
		//1.생년월일이 주소값으로 출력된다...해결: MyDate에다가 getDate()를 추가
		//2.Manager의 부서가 출력되지 않는다...
		
		//Polymorphism...
		//배열...CRUD
	
		///////////////Polymorphism//////////////
		//부모타입으로 자식을 생성한다.
		System.out.println("\n==============Polymorphism==============\n");
		Employee e1 = new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT");
		Employee e2 = new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200);
		Employee e3 = new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA");
		
		//2. Object Casting 기법 필요...부모로 찾으면 안되고 자식변수로 찾아야 한다..자식만의 기능이기 때문에
		((Manager) e1).chageDept("Marketing");
		//Manager m1 = (Manager)e1;//자식으로 불러야 함. (자식)부모;
		//m1.chageDept("Marketing");
		
		/* 1.
		 * Virtual Method(생성된 자식의 메소드) Invocation 원리
		 * 상속관계의 2개의 클래스에서
		 * 메소드 오버라딩을 했을 떄 발생하는 원리
		 * 
		 * Compile Type Time 메소드 - 부모의 메소드가 호출
		 * Runtime Type 메소드 - 자식의 메소드 호출
		 */
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
	}

}
