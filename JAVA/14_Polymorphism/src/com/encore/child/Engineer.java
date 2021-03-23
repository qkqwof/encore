package com.encore.child;

import com.encore.util.Mydate;
import com.encore.parent.*;

public class Engineer extends Employee{
	private String tech;
	private int bonus;
	
	public Engineer(String name, Mydate birthDay, double salary,String tech,int bonus) {//�ڽ��� �����Ƿ��� ��...
		//�θ�⺻������ȣ��...(������)..super();
		super(name, birthDay, salary);
		this.tech = tech;
		this.bonus = bonus;
	}
		public String getDetails() {
			return super.getDetails() +  "," + tech; //������ ���ļ� ��
		}
		
	//���
		public void changeTech(String tech) {
			this.tech = tech;
		}
		public int getBonus() {
			return bonus;
		}
		
		
		
	}

