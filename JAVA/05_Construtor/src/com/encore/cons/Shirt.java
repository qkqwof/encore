package com.encore.cons;

/*
 * 1. ������
 * ��ü�� ������ *������* ����(ȣ��)�Ǵ� ��
 * 
 * 2. �⺻ ������
 * ���ڰ� ���� {} �ȿ��� �ƹ��� ���۵� ���� �ʴ� ������.
 */

public class Shirt {
	//1.�ʵ� ����
	public String brandName;
	public double price;
	public boolean longSleeved;
    public Shirt() { } //�⺻������(������ ����) : �޼���� �����ϰ� �� �� ����
    public Shirt(String barandName,double price,boolean longSleeved) { 
    	//�ʵ� �ʱ�ȭ
    	this.brandName =brandName;
    	this.price = price;
    	this.longSleeved = longSleeved;
}	
	public String getDetails() {
		return brandName + "," + price + "," + longSleeved;
	}
}
