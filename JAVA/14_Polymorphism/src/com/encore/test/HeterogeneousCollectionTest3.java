package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.Mydate;

/*
 * Collection
 * 1. Homogenous Collection(동종간의 집합체)
 * 2. Heterogeneous Collection(이기종 간의 집합체)
 */

public class HeterogeneousCollectionTest3 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("James",new Mydate(1982,3,2),23000.0),
				new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT"),
				new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200),
				new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA")
		};
		
		/*
		 * for문과 instanceof를 사용해서
		 * Robert 부서를 IT ---> Marketing
		 * Gosling tech JAVA ----> Python
		 * Peter bossOfName Robert ----> Gosling 각각 변경하세요.
		 */
		for(Employee e:emps) {
			if(e instanceof Manager) {
				((Manager) e).chageDept("Marketing");
			}if(e instanceof Engineer){
				((Engineer) e).changeTech("Python");
			}if(e instanceof Secretary) {
				((Secretary) e).changeBossOfName("Gosling");
			}
			System.out.println(e.getDetails());
		}//for
		
		
	}//main
}//class


/* Polymorphism
 * 
 * 1. Hetero..Collection
 * 2. Virtual Method Invocation
 * 3. Object Casting
 * 4. 부모타입으로 동일하게 묶여져 있지만...각각 실질적으로 생성된 객체타입을 알아내기 위한 키워드
 *    if(e instanceof 자식클래스명)
 */
