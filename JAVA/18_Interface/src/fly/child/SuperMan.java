package fly.child;

import fly.parent.*;

/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������ 
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带 
 * �� �����ؾ� �Ѵ�.
 */
public class SuperMan implements Flyer{

	@Override
	public void fly() {
		System.out.println("Bird...fly..");
		
	}

	@Override
	public void land() {
		System.out.println("Bird...land..");
		
	}

	@Override
	public void take_off() {
		System.out.println("Bird...take_off..");
		
	}
	
	//�ڽĸ��� �޼ҵ�...
	public String stop_bullet() {
		return "�Ѿ��� ����.";
	}
}
