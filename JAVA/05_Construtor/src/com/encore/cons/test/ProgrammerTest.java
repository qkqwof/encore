package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.Mydate;

public class ProgrammerTest {

	public static void main(String[] args) {//��� ���α׷����� ���ο��� ������
		//1.��ü ����... -> Programmer�� �ı����� �޸𸮿� �ø���.
		
		//step1
		/*
		 * Programmer pg = new Programmer(); Programmer pg1 = new Programmer();
		 * 
		 * 
		 * Mydate md = new Mydate(); md.setDate(1980, 1, 1); //2.�޼ҵ� ȣ��
		 * 
		 * pg.setProgrammer("���翵", md , 1000.0f, 100);//�ʵ忡 ���� ����
		 * pg1.setProgrammer("Prter", md , 40000.0f, 200); pg=pg1; //3.�������� ������ �ܼ�â��
		 * ��µǵ��� �ۼ� //birthday�� ������ 1980-1-1 //pg.getProgrammer();//���Ե� ���� �޾ƿ� //�����
		 * �����͸� ���� //��� Ȯ���Ϸ��� System.out.println(pg.getProgrammer());
		 * System.out.println(pg1.getProgrammer());
		 */
		
		//step2
		/*
		 * 1.pro1, pro2 ��ü ����...
		 * 
		 * 2.�����ڸ� �̿��ؼ� �ʵ忡 ���� �� �Ҵ�
		 * 3.�ʵ� ���� �ܼ�â�� ���
		 * 4. Peter�� ������ 450000.0�޷� �Դϴ�. 
		 * 
		 * - �̷��� ����� �ǵ��� ������ �ϼ��ϼ���.
		 * 
		 *
		 */
		
		//Mydate md = new Mydate();
		//md.setDate(1980, 1, 1);
		Programmer pro1 = new Programmer("Peter",new Mydate(1980,1,1),450000.0f,10000);
		Programmer pro2 = new Programmer("James",new Mydate(1980,1,1),400000.0f,20000);
		
		/*
		 * Mydate md = new Mydate(); 
		 * md.setDate(1980, 1, 1); 
		 * Programmer pro1 = new Programmer("Peter",md,450000.0f,10000); 
		 * Programmer pro2 = new Programmer("James",md,400000.0f,20000);
		 */
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer());
		
		System.out.println(pro1.getPeter());
		System.out.println(pro1.getName() + "���� ������ " +
							pro1.getAnnualSalary() + "�޷��Դϴ�.");
	}

}
