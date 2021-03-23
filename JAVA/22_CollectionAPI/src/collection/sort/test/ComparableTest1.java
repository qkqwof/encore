package collection.sort.test;
/*
 * �迭�� �̰� ���� ---> Arrays.sort(Xxx[])�� comparable�� ���ؼ� ���ĵ� ���̴�.
 * ����Ʈ�� �̰� �Ұ��� ---> Arrays.sort(arraylist)�� �ȵ��ư���.
 * ����Ʈ�� Collections.sort()�� �ϸ� �ȴ�.
 * �̹� ���������� comparable�� ����ؼ� ArrayList �ȿ� ����ִ� ��ü���� Ư���� ���� ���ؼ� �����غ��ڴ�.
 * 
 * 1.comparable�� ���� ��� �޾Ƽ� �����ϴ� ���...compareTo�� �����ϰ��� �ʵ�(���̼�, �̸���)�� ���缭 ����
 * 2.comparator�� sort �Լ� �ȿ��� ���� �����ϴ� ���
 */

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person p) {//�̸������� ����
		return -(new Integer(age).compareTo(p.getAge()));//���������� �տ� -�� ���̸� �ȴ�.
	}

//	@Override
//	public int compareTo(Person p) {//�̸������� ����
//		return -name.compareTo(p.getName());//���������� �տ� -�� ���̸� �ȴ�.
//	}
	
	
}

public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ȣ��",48));
		list.add(new Person("�̼���",45));
		list.add(new Person("������",38));

		Collections.sort(list);//comparable�� ���� ������ �Ǿ� ����
		System.out.println(list);
	}

}
