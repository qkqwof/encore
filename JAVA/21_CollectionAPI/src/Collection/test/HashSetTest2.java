package Collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set�� �ڽ� Ŭ����...HashSet
 * 1.�ߺ� ��� ����
 * 2.������ ������ �ʴ´�.
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("��ȣ��");
		set.add("�̼���");
		set.add("��ȣ��");//�ߺ�
		set.add("������");
		set.add("����ö");
		
		System.out.println(set.size());//4
		//Collection API�� ��ü������ tostring()�� �������̵� �Ǿ��� �ִ�... ���� ������ ���
		System.out.println(set.toString());
		boolean flag = set.contains("�̻��");
		System.out.println("�̻���� ���ԵǾ��� �ֳ���?" + flag);//false
		System.out.println("set Collection�� �����Ͱ� ����� �ֳ���?" + set.isEmpty());//false
		
		//�������� ����
		set.remove("������");
		//��� set������ ���
		System.out.println(set);
		//��� ������ ����
		set.clear();
		//��� set�����͸� ���
		System.out.println(set);
		System.out.println(set.isEmpty());//true
	}

}
