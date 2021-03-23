package Collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String,Customer> map = new HashMap<String,Customer>();
		
		map.put("111", new Customer("Kang","강호동",48));
		map.put("222", new Customer("Lee","이수근",44));
		map.put("333", new Customer("Seo","서장훈",42));
		map.put("444", new Customer("Kim","김희철",37));
		
		//1.key값이 222인 사람의 정보를 출력
		System.out.println(map.get("222"));
		
		//2.id가 Lee인 사람을 찾아서 그 사람의 이름을 출력
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			Customer c = map.get(it.next());
			if(c.getId().equals("Lee")) System.out.println(c.getName());
		}
		//3.Map에 저장된 데이터의 모든 key값들을 출력
		System.out.println(map.keySet());
		//4.Map에 저장된 사람들 나이의 총합과 평균연령을 출력
		Set<String> keys = map.keySet();
		int totalAge = 0;
		for(String s:keys) {
			totalAge += map.get(s).getAge();
		}
		System.out.println("연령의 총합 " + totalAge);
		System.out.println("평균 연령 " + totalAge/map.size());
		
	}

}
