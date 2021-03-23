package Collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String,Customer> map = new HashMap<String,Customer>();
		
		map.put("111", new Customer("Kang","��ȣ��",48));
		map.put("222", new Customer("Lee","�̼���",44));
		map.put("333", new Customer("Seo","������",42));
		map.put("444", new Customer("Kim","����ö",37));
		
		//1.key���� 222�� ����� ������ ���
		System.out.println(map.get("222"));
		
		//2.id�� Lee�� ����� ã�Ƽ� �� ����� �̸��� ���
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			Customer c = map.get(it.next());
			if(c.getId().equals("Lee")) System.out.println(c.getName());
		}
		//3.Map�� ����� �������� ��� key������ ���
		System.out.println(map.keySet());
		//4.Map�� ����� ����� ������ ���հ� ��տ����� ���
		Set<String> keys = map.keySet();
		int totalAge = 0;
		for(String s:keys) {
			totalAge += map.get(s).getAge();
		}
		System.out.println("������ ���� " + totalAge);
		System.out.println("��� ���� " + totalAge/map.size());
		
	}

}
