package com.encore.datatype;

/*
 * 1. �ʵ�
 * 	  int ������, char �÷�, float ����, String ����ȸ��, String ���� 
 *    ��ũ��ġ ���θ� �� �� �ִ� �ʵ带 �߰�
 * 
 * 2. �޼���
 * 	  2�� ����
 * 	  - �ʵ尪�� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 * 	  - �ʵ忡 �Է��� , ����� ���� �ܼ�â���� ����ϴ� ���
 * -> ����/

	/*1. ������ ���Ǵ� '��ġ'�� ���� Field�� Local variable�� ����
	 *�ʵ� --> Ŭ���� ���� �ٷ� ��, �޼��� ��� �ٱ�
	 *Local variable(��������) --> �޼��� �ȿ��� ����
	 *
	 *2. 
	 *���ú����� �̸��� �ʵ�� �����ϰ� ���������� �ۼ��Ѵ�.
	 *�̸��� ������ ���� �ʵ� �տ� this�� ���̸� �ȴ�.
	 */
public class WhiteBoard {
	//Ŭ���� ��ü���� ���(Field)
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch) {//local V
		//�� �ش� �κп����� ���Ǵ� ����
		//�ʵ�� ���ú����� �̸��� ���� ��, �����ϱ� ���ؼ� this�� �ʵ� �տ� ����
		//this�� �ش�Ŭ���� �ڱ��ڽ�...������ �ϴ� �ؼ�
		this.size = size;           
		this.color = color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch;
	}
	
	public void printInfo() {
		System.out.println(size + "\t" + color + "\t" + price + "\t" + company + "\t" + material + "\t" + scratch);
	}
}
