package sample;

/*
 * 1) �ʵ�
 * 	  �̸�, ����, �ּҿ� �ش��ϴ� ���� �� �� �ֵ���
 * 	  �ʵ� 3���� ����
 * 
 * 2) �޼���
 * 	  3���� �ʵ� �������� �ܼ�â�� ��µ� �� �ֵ��� ����� ����
 */

public class MyStudent {
	//�ʵ� ���� 3
	public String name;
	public int age;
	public String address;
	
	//�޼��� ���� 1
	public void printInfo() { // worker
		System.out.println(name + "," + age + "," + address); // calling
	}
}
