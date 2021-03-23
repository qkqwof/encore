package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.service.EmployeeService;
import com.encore.util.Mydate;

/*
 * Collection
 * 1. Homogenous Collection(�������� ����ü)
 * 2. Heterogeneous Collection(�̱��� ���� ����ü)
 */

public class PolymorphismTest_sample {

	public static void main(String[] args) {
		//1. �θ�Ÿ������ �ڽĻ���...
		Employee e1 = new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT");
		Employee e2 = new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200);
		Employee e3 = new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA");
		Employee e4 = new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT");
		
		//2.�θ�Ÿ���� �迭�� �ʱ�ȭ
		Employee[] emps = {e1,e2,e3,e4}; 
				 
		//3.���� Ŭ���� ����
		EmployeeService service = new EmployeeService();
		
		service.manageEmployee(e4);
		service.manageEmployee(e2);
		
		service.printAllEmployee(emps);
		
	}//main
}//class



