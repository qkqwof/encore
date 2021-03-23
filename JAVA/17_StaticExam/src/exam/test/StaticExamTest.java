    package exam.test;

/*
 * static한 키워드 성질
 * 1. 객체생성 과정 없이 메모리에 올라간다.
 * 2. 객체생성 과정 훨씬 이전에...Class File Loader과정에서...이때 메모리 올라간다.
 * 	  JVM(STACK | HEAP ---> new 키워드로 생성된 객체만| ....Class Area[static한 성질들의 멤버])
 * 3. static한 성질의 필드는 생성된 객체들에서 서로 공유한다.!!!
 * 
 * 4. static은 static끼리 통한다.
 * 5. static 블락 안에서는 this사용 못한다.
 * 6. static과 final은 성질상 종종 함께 사용한다.
 *    ex) 상수값 선언  static final int BASIC_SALARY=1000;
 * 7. static intitializtion block
 * 8. 싱글톤 패턴
 */

class Member{
	//필드 레벨에 static 변수를 선언(local level로는 사용할 수 없다.)
	static String  name = "홍길동";
	static int age = 22;
	int count = 1;//필드
	
	//staticblock
	public static void getMember() {//static block
		System.out.println("우/유/빛/깔/ " + name);//static variable
		//System.out.println("우/유/빛/깔/ " + count);
	}
	
	//non-static block
	public void getMember2() {//static block
		System.out.println("우/유/빛/깔/ " + name);//static variable
		
	}
	
}
public class StaticExamTest {

	public static void main(String[] args) {
		//static한 성질의 기능은 바로 접근해서 사용할 수 있다...Class이름.static메소드
		Member.getMember();
		
		//
		Member m = new Member();
		m.getMember();
		m.getMember2();

	}

}
