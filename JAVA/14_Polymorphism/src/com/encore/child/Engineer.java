package com.encore.child;

import com.encore.util.Mydate;
import com.encore.parent.*;

public class Engineer extends Employee{
	private String tech;
	private int bonus;
	
	public Engineer(String name, Mydate birthDay, double salary,String tech,int bonus) {//자식이 생성되려할 때...
		//부모기본생성자호출...(무조건)..super();
		super(name, birthDay, salary);
		this.tech = tech;
		this.bonus = bonus;
	}
		public String getDetails() {
			return super.getDetails() +  "," + tech; //구현부 고쳐서 씀
		}
		
	//기능
		public void changeTech(String tech) {
			this.tech = tech;
		}
		public int getBonus() {
			return bonus;
		}
		
		
		
	}

