package com.encore.util;
//Programmer�� ��������� ������ ��� �ִ� Ŭ����
public class Mydate {
	//1.�ʵ� ����...
	public int year;
	public int month;
	public int day;
	
	//2.���� �ʵ忡 ��� ���������� ����...setXxx()
	
	  public void setDate(int year, int month, int day) { //�ʵ� �ʱ�ȭ!!!! 
		  this.year =
	  year; this.month = month; this.day = day; }
	 
	//setter ������ ��.
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//3.�ʵ尪 �޾ƿ���..
	public String getDate() {
		return year+"-"+month+"-"+day; //Non String + String => String���� Convert
	}
}
