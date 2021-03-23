package stream.object.step1.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ===========Serialization(����ȭ)::Data UnPack============
 * Person��ü�� ������(�ʵ尪) �ٸ���(Sink::person.obj)���� ������ ������ �ۼ�
 * 1. Stream ��ü�� ���� - - - ObjectOutputStream | FileOutputStream
 * 2. ������...�Ѹ���...����Ѵ� - - - ObjectOutputStream�� ����� ���(writeObject(object))
 */

public class PersonObjectoutputTest1 {

	public static void main(String[] args) throws IOException{
		File f = new File("c:" + File.separator + "objfile" + File.separator +"person.obj");
		f.getParentFile().mkdirs();
		
		//1.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		
		//2.
		Person p = new Person("�迬��",30,"2233","���ǵ�");
		oos.writeObject(p);//sink������ �������� ���ư�...��µ�..
		
		//3.
		oos.close();//���ƻ� ����� �ڿ��� �ݾ��ش�.
		System.out.println("person.obj ������ ����...Ȯ��");
		System.out.println("������ ��Ȯ�ϰ� ��µǾ������� ... ���Ŀ� ������ȭ�ؼ� ������ Ȯ��");
	}

}
