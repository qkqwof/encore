 package com.encore.parent;

import com.encore.util.Mydate;

/*
 * 자식들의 공통적인 성질을 
 * 일반적인 성질로 가지고 있는 부모 클래스...
 */

public class Employee {
	//상수값 지정
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private Mydate birthDay;
	private double salary;
	
	public Employee() {}//기본 생성자
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
