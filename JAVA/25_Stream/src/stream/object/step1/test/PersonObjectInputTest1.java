package stream.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 역직렬화 코드
 * 생성된 person.obj파일의 내용을 읽어와서
 * 콘솔로 정보를 출력...
 */

public class PersonObjectInputTest1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File f = new File("c:" + File.separator + "objfile" + File.separator + "person.obj");
		//1.스트림 생성
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("objectInputStream...Creating...");
		
		//2.
		Person p = (Person)ois.readObject();
		System.out.println(p);
	}

}
