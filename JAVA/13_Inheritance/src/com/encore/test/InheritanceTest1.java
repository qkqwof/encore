package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.Mydate;

public class InheritanceTest1 {
	public static void main(String[] args) {
		Employee emp = new Employee("James", new Mydate(1982,3,2), 23000.0);
		Manager m = new Manager("Robert", new Mydate(1981,4,2), 33000.0, "IT");
		Engineer eg = new Engineer("Gosling", new Mydate(1978,1,2), 33000.0, "Java");
		Secretary ss = new Secretary("Peter", new Mydate(1988,1,2), 34000.0, "Robert");
		
		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());		
		System.out.println(eg.getDetails());
		System.out.println(ss.getDetails());
		
		// Polymorphism...
		//배열....CRUD 작성...Workshop
	}
}
