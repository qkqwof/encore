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
		
		//Robert�� �μ��� �ٲ۴�....IT --> Marketing 
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
		
		//1.��������� �ּҰ����� ��µȴ�...�ذ�: MyDate���ٰ� getDate()�� �߰�
		//2.Manager�� �μ��� ��µ��� �ʴ´�...
		
		//Polymorphism...
		//�迭...CRUD
	
		///////////////Polymorphism//////////////
		//�θ�Ÿ������ �ڽ��� �����Ѵ�.
		System.out.println("\n==============Polymorphism==============\n");
		Employee e1 = new Manager("Robert",new Mydate(1981,4,6),33000.0,"IT");
		Employee e2 = new Engineer("Gosling", new Mydate(1978,1,1),33000.0,"JAVA",200);
		Employee e3 = new Secretary("Gosling", new Mydate(1978,1,1),33000.0,"JAVA");
		
		//2. Object Casting ��� �ʿ�...�θ�� ã���� �ȵǰ� �ڽĺ����� ã�ƾ� �Ѵ�..�ڽĸ��� ����̱� ������
		((Manager) e1).chageDept("Marketing");
		//Manager m1 = (Manager)e1;//�ڽ����� �ҷ��� ��. (�ڽ�)�θ�;
		//m1.chageDept("Marketing");
		
		/* 1.
		 * Virtual Method(������ �ڽ��� �޼ҵ�) Invocation ����
		 * ��Ӱ����� 2���� Ŭ��������
		 * �޼ҵ� ��������� ���� �� �߻��ϴ� ����
		 * 
		 * Compile Type Time �޼ҵ� - �θ��� �޼ҵ尡 ȣ��
		 * Runtime Type �޼ҵ� - �ڽ��� �޼ҵ� ȣ��
		 */
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
	}

}
