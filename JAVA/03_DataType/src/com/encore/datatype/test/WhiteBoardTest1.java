package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

/*
 * WhiteBoardTest1...Test, ���� Ŭ������ �θ�
 * 
 * Test, ���� Ŭ������ �ϴ� ��
 * 1) ��ü�� �����Ѵ�. == �������(�ı�)�� �޸𸮿� �ø���.
 * 2) �ı��� ����
 * 		�ʵ� ----   ���Ҵ� ---- �������� �ϵ��ڵ��Ǹ� �װ��� ���α׷��� �ƴϴ�... �ϸ� �ȵ�
 * 		�޼ҵ� ----  Calling 
 */

public class WhiteBoardTest1 {

	public static void main(String[] args) {
		/*
		 * WhiteBoard ��ü�� wb��� �̸����� �ϳ� ����
		 * �ʵ忡 ���� �Է�
		 * �Էµ� ���� ���
		 */

		WhiteBoard wb = new WhiteBoard();    //float(32), double(64)
		
		wb.setInfo(100,'B',120.0f,"Encore" ,"Plastic",true);    //64->32(ū ������ ���� ������ ���� ������ ��)
		wb.printInfo();
	}

}
