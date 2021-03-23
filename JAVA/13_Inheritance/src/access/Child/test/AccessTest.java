package access.Child.test;

import access.parent.*;

class Child extends Parent{;
	public void accessTest() {
		System.out.println(publicTest);
		System.out.println(protectedTest);//가능
		//System.out.println(defaultTest);
		//System.out.println(privateTest);
	}
	
	@Override
	public void access() {
		super.access();
		System.out.println("상속 받은 필드 : "+ publicTest);
		System.out.println("상속 받은 필드 : "+ protectedTest);
	}
}
public class AccessTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.accessTest();
		System.out.println("===================");
		c.access();

	}

}
