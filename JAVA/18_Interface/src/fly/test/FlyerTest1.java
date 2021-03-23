package fly.test;

import fly.child.*;
import fly.parent.*;

public class FlyerTest1 {

	public static void main(String[] args) {
		//1. 폴리몰피즘 방식으로 자식 객체를 3개 생성....bird, superman, airplane
		//인터페이스는 객체생성의 대상이 아니고 객체를 생성하기 위한 타입으로서만 존재!!! 
		//Flyer flyer = new Flyer();
		Flyer bird = new Bird();
		Flyer superman = new SuperMan();
		Flyer airplane = new Airplane();
		//2. for, instanceof 이용해서 각각 자식클래스의 기능을 전부다 호출...
		Flyer[] flyers = {bird, superman, airplane};
		
		for(Flyer f: flyers) {
			if(f instanceof Bird) System.out.println(((Bird) f).layEggs());
			if(f instanceof SuperMan) System.out.println(((SuperMan) f).stop_bullet());
			f.fly();
			f.land();
			f.take_off();
			System.out.println("=======================");
		}//for
		
	}//main

}//class
