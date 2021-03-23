package sample;

/*
 * 필드에 값을 입력하는 기능을 추가....
 * 
 * 메서드 이름 지을 때
 * simple | detail(0)!!
 * 
 * setInfo()   //값을 집어넣을 떄 set을 씀
 * inputField()
 */

public class MyStudent2 {
	//필드 선언 3
	public String name;
	public int age;
	public String address;
	
	public void setField(String n, int a, String add) {
		name = n;
		age = a;
		address = add;
	}
	public void printInfo() { // worker
		System.out.println(name + "," + age + "," + address); // calling
	}
}
