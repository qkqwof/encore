package fly.child;

import fly.parent.*;

/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������ 
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带 
 * �� �����ؾ� �Ѵ�.
 */
public class Bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("SuperMan...fly..");
		
	}

	@Override
	public void land() {
		System.out.println("SuperMan...land..");
		
	}

	@Override
	public void take_off() {
		System.out.println("SuperMan...take_off..");
		
	}
	
	//�ڽĸ��� �޼ҵ�...
	public String layEggs() {
		return "���� ���� ���.";
	}
}
