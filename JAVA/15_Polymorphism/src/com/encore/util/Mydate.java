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
	
	//1step  Object�� ������ �ִ� ����� �����޾Ҵ�.
	//2step  �װ� �ڽſ��� �°� ���ľ���.
	@Override
	public String toString() {
		return "(" + year + "," + month + "," + day + ")";
	}
	
//	public String getdate() {
//		return year + "-" + month + "-" + day;
//	}
	
	
}
