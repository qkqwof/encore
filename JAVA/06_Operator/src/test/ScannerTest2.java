package test;

import java.util.Scanner;

/*
 * Scanner Ŭ������
 * ���� ��(������ �ð� �ƴ�) Ű����� �Էµ� ���� �Է¹޵��� ���ִ� ����� ������ �ִ� Ŭ���� 
 */

public class ScannerTest2 {
	public static void main(String[] args) {
		//��ü ����
		System.out.println("Ű����� ���� 2���� �̸��� �Է��ϼ���>>");
		Scanner sc = new Scanner(System.in); // System.in -> Ű���� �Է°� 	
		int i = sc.nextInt(); //������ �������� �����͸� ��ȯ�Ѵ�.
		int j = sc.nextInt();
		//String name = sc.nextLine();
		sc.nextLine();  // �� ������ �������� �����͸� ��ȯ
		String name = sc.next(); // ������ �������� �����͸� ��ȯ
		
		System.out.println("���ڰ� i: "+i+",j: "+j);
		System.out.println(name);
		
	}

}
