 package com.encore.parent;

import com.encore.util.Mydate;

/*
 * �ڽĵ��� �������� ������ 
 * �Ϲ����� ������ ������ �ִ� �θ� Ŭ����...
 */

public class Employee {
	//����� ����
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private Mydate birthDay;
	private double salary;
	
	public Employee() {}//�⺻ ������
	public Employee(String name, Mydate birthDay) {
		this(name, birthDay,BASIC_SALARY);
	}
	
	public Employee(String name, Mydate birthDay, double salary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	public String getDetails() {
		return name + "," + birthDay + "," + salary;
	}
	public double getSalary() {
		return salary;
	}
	public static double getBasicSalary() {
		return BASIC_SALARY;
	}
	public String getName() {
		return name;
	}
	public Mydate getBirthDay() {
		return birthDay;
	}
	
	
	
}
