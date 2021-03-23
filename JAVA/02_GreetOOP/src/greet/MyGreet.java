  package greet;

//
/* 
 * MyGreet클래스는 
 * 인사말을 콘솔창으로 출력하는 기능을 가지고 있는 클래스...
 */
public class MyGreet {
	public String message = "안녕하세요^^";        //field 선언 및 초기화    //변수(필드) - 값이 저장되는 공간
	                                            
	public void sayHello(String name) {         //method 정의 = 메서드 선언부 + 메서드 구현부  // *method worker
		System.out.println(message + ", " + name);//메서드는 calling 해야지만 working  // *calling
	}  // test로 다시 돌아감 	
}
// 메인 메서드가 없어서 컴파일만 됨
// sayH실행시키는 것 -> 메서드 동작 시키는 것 -> 다른 클래스에서 해야 됌
// worker의 순서는 안중요하고 calling의 순서대로 출력됨.