package com.encore.test1;

import java.util.*;

/*
 * Scanner ��ü�� ���ؼ�
 * 10~99 ������ ������ �ϳ� �Է¹޴´�.(2�ڸ����� ����)
 * 
 * 3,6,9... �� 3�� ������� ���ԵǾ� �ִ����� �������� �����ϴ� �˰���.
 * �ϳ� ������ --> @
 * �ΰ� ������ --> @@
 * ������     --> ����
 * 
 * ���� �� 
 * 31 --> @
 * 11 --> 11
 * 98 --> @
 * 29 --> @
 * 96 --> @@
 * 
 * ��Ʈ 
 * 2�ڸ���...
 * ���ڸ� --- /
 * ���ڸ� --- %
 * 
 * ��� �����ϱ�
 */

public class Pattern369Test {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("10~99 ������ ������ �Է����ּ���>>");
	int num = sc.nextInt();
	int digit10 = num/10;
	int digit1 = num%10;
	
	int clapCnt = 0; // �ڼ� Ƚ��
	
	if(digit1%3 == 0 && digit1 != 0 ) {
		clapCnt++;
	} else if(digit10%3 == 0 && digit10 !=0) {
		clapCnt++;
	}
	
	if(clapCnt == 2) {
		System.out.println("@@");
	}else if(clapCnt == 1) {
		System.out.println("@");
	}
}
}