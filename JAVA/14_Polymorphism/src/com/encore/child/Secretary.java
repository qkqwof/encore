package com.encore.child;

import com.encore.util.Mydate;
import com.encore.parent.*;

public class Secretary extends Employee{
	private String bossOfName;
	
	
	public Secretary(String name, Mydate birthDay, double salary,String bossOfName) {//자식이 생성되려할 때...
		//부모기본생성자호출...(무조건)..super();
		super(name, birthDay, salary);
		this.bossOfName = bossOfName;
	}
		public String getDetails() {
			return super.getDetails() +  "," + bossOfName; //구현부 고쳐서 씀
		}
		public void changeBossOfName(String bossOfName) {
			this.bossOfName = bossOfName;
		}
		
		
	}

