package com.encore.cons.test;

import com.encore.cons.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		//��ü ����
		Shirt longT = new Shirt("����Ű",120.0f,true); //�޼���� �����ϰ� �� �� ����
		Shirt halfT = new Shirt("�Ƶ�ٽ�",130.0f,true);
		
		System.out.println(longT.getDetails());
		System.out.println(halfT.getDetails());
	}

}
