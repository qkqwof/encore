package fly.child;

import fly.parent.*;

/*
 * 인터페이스를 부모로 둔 자식 클래스는 
 * 반드시 부모 인터페이스가 가지고 있는 모든 추상메소드를 
 * 다 구현해야 한다.
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
	
	//자식만의 메소드...
	public String layEggs() {
		return "새가 알을 까다.";
	}
}
