package com.encore.child;

import com.encore.util.Mydate;
import com.encore.parent.*;

public class Engineer extends Employee{
	private String tech;
	
	public Engineer(String name, Mydate birthDay, double salary,String tech) {//�ڽ��� �����Ƿ��� ��...
		//�θ�⺻������ȣ��...(������)..super();
		super(name, birthDay, salary);
		this.tech = tech;
	}
		public String getDetails() {
			return super.getDetails() +  "," + tech; //������ ���ļ� ��
		}
	}

