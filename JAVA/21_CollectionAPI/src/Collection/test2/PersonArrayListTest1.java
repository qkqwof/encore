package Collection.test2;

import java.util.ArrayList;

import Collection.vo.Person;

/*
 * List�ȿ� �������� ����� �߰��ϴ� ������ �ۼ�
 * �߰��� ����� ������ �ڵ鸵�ϴ� ����� �������� �ۼ�
 */

public class PersonArrayListTest1 {

	public static void main(Person[] args) {
		ArrayList<Person> list = new ArrayList<Person>();//�������� Array�� ���������...������ List

		
		list.add(new Person("��ȣ��","���ʵ�",45));
		list.add(new Person("�̼���","��赿",42));
		list.add(new Person("��ȣ��","���ǵ�",33));
		list.add(new Person("������","��â��",40));
		list.add(new Person("����ö","���ʵ�",36));
		
		System.out.println(list);
		
		//1.����Ʈ�� ����ִ� ����� ������� ���
		System.out.println(list.size());
		//2.����Ʈ�� ����� ����� ��� ������ ���
		int total = 0;
		for(Person p:list) {
			total += p.getAge();}
			System.out.println(total/list.size());
		
		//3.����� ����� �߿��� ���ʵ��� ��� ����� ���
		for(Person p:list) {
			if(p.getAddr().equals("���ʵ�")) System.out.println(p);
		}
	}

}
