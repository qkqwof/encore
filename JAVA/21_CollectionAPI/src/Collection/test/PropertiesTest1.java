package Collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System ���� ž��� VM ���� ȯ�溯���� ���� �ַܼ� ����ϴ� ������ �ۼ�.
 */
public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties p = System.getProperties();//1.
		Enumeration e = p.propertyNames();//2.
		while(e.hasMoreElements()) {//3.
			String name = (String)e.nextElement();
			String value = p.getProperty(name);//4.
			System.out.println(name + "=============" + value);
		}
	}

}
