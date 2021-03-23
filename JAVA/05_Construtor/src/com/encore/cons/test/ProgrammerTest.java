package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.Mydate;

public class ProgrammerTest {

	public static void main(String[] args) {//모든 프로그램들은 메인에서 시작함
		//1.객체 생성... -> Programmer의 식구들을 메모리에 올린다.
		
		//step1
		/*
		 * Programmer pg = new Programmer(); Programmer pg1 = new Programmer();
		 * 
		 * 
		 * Mydate md = new Mydate(); md.setDate(1980, 1, 1); //2.메소드 호출
		 * 
		 * pg.setProgrammer("박재영", md , 1000.0f, 100);//필드에 값을 주입
		 * pg1.setProgrammer("Prter", md , 40000.0f, 200); pg=pg1; //3.개발자의 정보가 콘솔창에
		 * 출력되도록 작성 //birthday의 정보가 1980-1-1 //pg.getProgrammer();//주입된 값을 받아옴 //현재는
		 * 데이터만 리턴 //결과 확인하려면 System.out.println(pg.getProgrammer());
		 * System.out.println(pg1.getProgrammer());
		 */
		
		//step2
		/*
		 * 1.pro1, pro2 객체 생성...
		 * 
		 * 2.생성자를 이용해서 필드에 직접 값 할당
		 * 3.필드 정보 콘솔창에 출력
		 * 4. Peter의 연봉은 450000.0달러 입니다. 
		 * 
		 * - 이러헤 출력이 되도록 로직을 완성하세요.
		 * 
		 *
		 */
		
		//Mydate md = new Mydate();
		//md.setDate(1980, 1, 1);
		Programmer pro1 = new Programmer("Peter",new Mydate(1980,1,1),450000.0f,10000);
		Programmer pro2 = new Programmer("James",new Mydate(1980,1,1),400000.0f,20000);
		
		/*
		 * Mydate md = new Mydate(); 
		 * md.setDate(1980, 1, 1); 
		 * Programmer pro1 = new Programmer("Peter",md,450000.0f,10000); 
		 * Programmer pro2 = new Programmer("James",md,400000.0f,20000);
		 */
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer());
		
		System.out.println(pro1.getPeter());
		System.out.println(pro1.getName() + "님의 연봉은 " +
							pro1.getAnnualSalary() + "달러입니다.");
	}

}
