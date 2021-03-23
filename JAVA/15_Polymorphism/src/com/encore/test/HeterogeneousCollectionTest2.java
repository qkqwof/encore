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

public class HeterogeneousCollectionTest2 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("James",new Mydate(1982,3,2),23000.0),
				new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT"),
				new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200),
				new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA")
		};
		
		
		for(Employee e:emps) {
			System.out.println(e.getDetails());
		}
		
		System.out.println("=====모든 고용인들의 연봉을 출력합니다.=======\n");
		int total = 0;
		for(Employee e:emps) {
			if(e instanceof Engineer) {
				System.out.println("Inforamtion :" + e.getDetails());
				System.out.println("AnnualSalary :"+ (e.getSalary() * 12 + ((Engineer) e).getBonus()));
			} else {
			System.out.println("Inforamtion :" + e.getDetails());
			System.out.println("AnnualSalary :"+ e.getSalary() * 12);
			System.out.println("=============================");
		}
	}

	}
}
