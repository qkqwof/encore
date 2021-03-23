package com.encore.child;

import com.encore.util.Mydate;
import com.encore.parent.*;

public class Secretary extends Employee{
	private String bossOfName;
	
	
	public Secretary(String name, Mydate birthDay, double salary,String bossOfName) {//�ڽ��� �����Ƿ��� ��...
		//�θ�⺻������ȣ��...(������)..super();
		super(name, birthDay, salary);
		this.bossOfName = bossOfName;
	}
		public String getDetails() {
			return super.getDetails() +  "," + bossOfName; //������ ���ļ� ��
		}
		public void changeBossOfName(String bossOfName) {
			this.bossOfName = bossOfName;
		}
		
		
	}

