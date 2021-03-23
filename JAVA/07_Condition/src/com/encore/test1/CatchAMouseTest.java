package com.encore.test1;

import java.util.Scanner;

/*
 * ����� ����� �˰����� �����ϰ� �ٷﺸ��....
 */

public class CatchAMouseTest {

	//�˰��� Ǫ�� �޼ҵ�� ���� static
	private static String algoSolv1(int cata, int catb, int mouse) {
		//if,else if, else ������ Math.abs()�� �̿��ؼ� �˰��� �����ϼ���...
		if(Math.abs(cata-mouse) > Math.abs(catb-mouse)) {
			return "cata will catch the mouse!!";
		} else if(Math.abs(cata-mouse) < Math.abs(catb-mouse)){
			return "catb will catch the mouse!!";
		} else {
			return "Mouse Escape!!";
		}
	}
	
	public static void main(String[] args) {
	//1. ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		//������� 3���� ���� �Է� �޴´�...
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();

		String result = algoSolv1(cata, catb, mouse);
		System.out.println("Result :: " + result);
		
	}

}

