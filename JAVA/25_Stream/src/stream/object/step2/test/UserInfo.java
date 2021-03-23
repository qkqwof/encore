package stream.object.step2.test;

import java.io.Serializable;

public class UserInfo implements Serializable{
	public static final String DEFAULT_NAME = "ȫ�浿";
	public static final int DEFAULT_AGE = 19;
	private String name;
	private int age;
	/*
	 * password ���� ���� ���� ���� �߿��� �����Ű�� ������ ������ �ش�
	 * �̷� ������ �������� ���� �����Ű�� �ʰ� �⺻������ �����Ų��.
	 * transient Ű���带 �ʵ� �տ� ����
	 */
	transient String passward;
	
	public UserInfo(String name, int age, String passward) {
		super();
		this.name = name;
		this.age = age;
		this.passward = passward;
	}
	
	UserInfo() {
		this(DEFAULT_NAME,DEFAULT_AGE,"1234");
	}

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

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", passward=" + passward + "]";
	}
	
	
}
