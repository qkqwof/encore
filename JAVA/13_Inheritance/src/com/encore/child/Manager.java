package com.encore.child;

/*
 * �θ� Ŭ���� Employee�κ��� ��� ���� �����ް�
 * �ڱ� �ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����....
 * 
 * ������ ȣ�� ---> ��ü ����
 */
import com.encore.parent.Employee;
import com.encore.util.Mydate;

public class Manager extends Employee{

	//�ڽĸ��� ����� �߰�
	private String dept;
	
	/*
	 * �ڽĻ�����...��ü �����˰���
	 * �ڽ� ������{ù���ο��� ������ �θ�⺻ ������ ȣ���� �Ͼ��
	 */
	public Manager(String name, Mydate birthDay, double salary,String dept) {//�ڽ��� �����Ƿ��� ��...
		//�θ�⺻������ȣ��...(������)..super();
		super(name, birthDay, salary);
		this.dept = dept;
	}
	
	//Method Overriding
	/*
	 * ��Ӱ��迡���� �Ͼ��.
	 * 1step : �θ� ���� ����� �����޴´�....ȣ���Ѵ�
	 * 2step : �װ� �ڽſ� �°� ���ľ���.
	 * 
	 * Overriding�� Rule
	 * 0.��Ӱ����� �� Ŭ���� ���̿��� �Ͼ��.
	 * 1.�޼��� ����δ� ��� ��ġ
	 * 2.�����δ� �ݵ�� �޶�� �Ѵ�.
	 * --->�θ� �޼ҵ�� �ڽ� �޼ҵ�� �̸��� ������ �ϴ� ���� �޶��������� ���ο� �޼ҵ尡 �������
	 * 	   (�޼ҵ� ������)
	 */
	
	public String getDetails() {
		return super.getDetails() +  "," + dept; //������ ���ļ� ��
	}
}
