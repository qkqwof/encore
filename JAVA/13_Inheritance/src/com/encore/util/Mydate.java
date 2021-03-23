package com.encore.util;

public class Mydate {
	private int year;
	private int month;
	private int day;
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//1step  Object가 가지고 있는 기능을 물려받았다.
	//2step  그걸 자신에게 맞게 고쳐쓴다.
	@Override
	public String toString() {
		return "(" + year + "," + month + "," + day + ")";
	}
	
//	public String getdate() {
//		return year + "-" + month + "-" + day;
//	}
	
	
}
