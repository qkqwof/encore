package com.encore.cons;
//������ ������ ��� �ִ� Ŭ����...

import com.encore.util.Mydate;

public class Programmer {
	
	//1.�ʵ� ����...
	public String name;   //API(���̺귯��)
	public Mydate birthday;   //user definition
	public float salary;
	public int bonus;
	//Ŭ������ ���� ��, ���� �߿��� ���� �ʵ�(�������) ����!!
	
	//2. ���� ��� �ʵ忡 ����, �Ҵ�, ����? 
	/*
	 * public void setProgrammer(String name, Mydate birthday,float salary, int
	 * bonus) { this.name = name; this.birthday = birthday; this.salary = salary;
	 * this.bonus = bonus; }
	 */
	
	//������ �߰�
	public Programmer() {}//�⺻ ������....�ʵ� �ʱ�ȭ ���Ѵ�.
	public Programmer(String name,Mydate birthday,float salary,int bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	/*public Programmer(String name, Mydate birthday, float salary, int bonus) {
	 * //����� ������...�ʵ� �ʱ�ȭ
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}*/
	
	//�߰�...�������� ������ �����ϴ� ����� ����
	public float getAnnualSalary() {
		return salary * 12 + bonus;
	}
	
	//3.�ʵ尪 �޾ƿ���
	
	public String getProgrammer() {
		return name + "," + birthday.getDate() + "," + salary + "," + bonus;
	//���� ���� �ɱ�? ȣ���� ������!!(test�� pg.getProgrammer())
	}
	
	//��� �߰�
	public String getPeter() {
		return name + "�� ������ " + salary +"�޷� �Դϴ�.";
	}
	
	public String getName() {
		return name;
	}
	
	
}
