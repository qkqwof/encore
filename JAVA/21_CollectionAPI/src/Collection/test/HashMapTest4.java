package Collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�� �ڽ� Ŭ����...HashMap
 * key-value�� ������ �����ؼ� �����͸� �����ϴ� Ư¡�� ������.
 * key�� �ߺ��� ������� �ʰ� value�� �ߺ� ����
 * ������ ����
 */

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<String, Integer>();//������ Ÿ���� �;� �Ǵµ� �⺻�� ����(wrapper class-character/Integer)
		map.put("��ȣ��",90);
		map.put("�̼���",95);
		map.put("������",99);
		map.put("����ö",80);
		
		//1.Ű�� �޾ƿ´�.
		Set<String> set = map.keySet();
		System.out.println(set);
		//2.Ű���� ���鼭
		Iterator<String> it = set.iterator();
		int total = 0;
		while(it.hasNext()) {//hasMoreElements()
			String name = it.next();//hasNext()
			int score = map.get(name);
			total += score;
		}
		//3.Ű���� �̰�
		//4.Ű���� �ش��ϴ� �����̰�
		//5.���������� ��� ������ �հ� ��հ��� ����Ѵ�.
		System.out.println("��� ����� ������ ������ " + total);
		System.out.println("��� ������ ����� " + total/map.size());
		
		System.out.println("=========entrySet()==========");
		System.out.println("=========values()==========");
		Collection<Integer> col = map.values();//90,95,99,80
		Iterator<Integer> it2 = col.iterator();
		int sum = 0;
		while(it2.hasNext()) {
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("��� ����� ������ ������ " + sum);
		System.out.println("��� ������ ����� " + sum/map.size());
		
		System.out.println("�ְ� ������ " + Collections.max(col));
		System.out.println("���� ������ " + Collections.min(col));
		
	}

}
