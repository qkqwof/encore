package exam.test;

//static initialization block...

public class StaticExamTest3 {
	static int i = 0;
	
	public static void main(String[] args) {
		//실질적으로 이 부분이 가장 먼저 실행된다...여기에다가 초기화 알고리즘 넣는다..
		//객체생성...();...생성자 호출..필드초기화
		
		System.out.println("1. main method static block"+i);
	}//main
	
	static {
		i = 300;
		System.out.println("2. static initialization"+i);
	}

}
