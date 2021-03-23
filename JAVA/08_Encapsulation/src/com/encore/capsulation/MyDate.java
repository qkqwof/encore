package com.encore.capsulation;

/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ�������� ���������� ���� �� �� ������
 *  �ʵ� �տ� ---->private ����
 * 2. Ŭ������ �ʵ��� ������ setter()/getter()�� �Ѵ�
 * 	�׸��� ��׵��� �ٸ� Ŭ���������� ���� ������ �� �ֵ��� public
 * 	public void setXxx(o)
 * 	public int getXxx(x)
 * 3. setXxx() {
 *		//ù���ο���(�ʵ� �ʱ�ȭ �Ǳ� ����)�� Ÿ���� ���� ���� �� �ֵ��� ������ ����
 *    }
 *    
 *    setDay()
 *    1,3,5,7,8,10,12�� --> 1~31
 *    2�� ---> 28�ϱ���
 *    4,6,9,11 ----> 30�ϱ���
 *    switch, if
 *    
 *    ::
 *    ��°���� 
 *    0�� �ȳ������� �ؾ� ��...
 */		

public class MyDate {
	//private �����ϸ� ���� Ŭ���������� ������ ���
	private int month;// setMonth�� ������ ��,1~12 ������ �� �Ҵ�
	private int day;
	
	/*public MyDate(int month, int day) {
		this.month = month;
		this.day = day;
	}*/
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		//2. ��� 1~12���� �ش��ϴ� ���� ó��...������ �޽���...
		if(month>=1 && month<=12) {
			this.month = month;
		} else { //1~12���� ���� �ƴ� ����...
			System.out.println("�ش� ���� �ƴմϴ�.");
			//return;//�ٽ� ���� �Է��ϵ��� ��.
			//month�� �� �� �Ǿ��µ� day�� �Ѿ ������ ����
			//���α׷��� �������´�.
			System.exit(0);
		}
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//setDay()
		//    1,3,5,7,8,10,12�� --> 1~31
		//    2�� ---> 28�ϱ���
		//    4,6,9,11 ----> 30�ϱ���
		switch(month) {
		case 2:
			if(day>=1 && day<=28) {
				this.day = day;
			} else {
				System.out.println("���� �߸� �Է�");
				//return;
				//month�� �� �� �Ǿ��µ� day�� �Ѿ ������ ����
				//���α׷��� �������´�.
				System.exit(0);
			}
		break;	
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>=1 && day<=30) {
				this.day = day;
			} else {
				System.out.println("���� �߸� �Է�");
				//return;
				//month�� �� �� �Ǿ��µ� day�� �Ѿ ������ ����
				//���α׷��� �������´�.
				System.exit(0);
			}
		break;	
		default:
			if(day>=1 && day<=31) {
				this.day = day;
			} else {
				System.out.println("���� �߸� �Է�");
				//return;
				//month�� �� �� �Ǿ��µ� day�� �Ѿ ������ ����
				//���α׷��� �������´�.
				System.exit(0);
			}
		break;	
		}//switch
		
		
		
	}//setDay
	
	
}//class
