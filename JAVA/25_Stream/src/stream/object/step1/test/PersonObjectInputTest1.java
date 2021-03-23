package stream.object.step1.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ������ȭ �ڵ�
 * ������ person.obj������ ������ �о�ͼ�
 * �ַܼ� ������ ���...
 */

public class PersonObjectInputTest1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File f = new File("c:" + File.separator + "objfile" + File.separator + "person.obj");
		//1.��Ʈ�� ����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("objectInputStream...Creating...");
		
		//2.
		Person p = (Person)ois.readObject();
		System.out.println(p);
	}

}
