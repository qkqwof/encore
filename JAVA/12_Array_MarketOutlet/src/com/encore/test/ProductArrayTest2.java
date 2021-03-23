package com.encore.test;

import com.encore.vo.Product;
//��ɵ��� �߰��غ��ڽ��ϴ�.
public class ProductArrayTest2 {

	public static void main(String[] args) {
		//1.Product Type�� �迭�� 3�� ����
		Product[] pros = {
				new Product("���Ӹ���Ǫ",23000,2,"LG"),
				new Product("��ټ�",2000,7,"HP"),
				new Product("�Ŷ��",1200,10,"SAMSUNG"),
				new Product("ĹŸ��",340000,1,"LG")
		};
		//2.product�� 3�� ����
		//1,2�� �ѹ��� �ϱ�
		
		//����߰� 1. ��ǰ���� ����Ŀ ���
		System.out.println("=====��ǰ���� ����Ŀ�� ����մϴ�.=====");
		//3.for���� �̿��ؼ� Product ������ ���
		for(Product p:pros) {
			System.out.println(p.getMaker());
		}
		
		//����߰� 2. Ư������ �̻��� ��ǰ�� ���
		System.out.println("====10���� �̻��ϴ� ��ǰ���� ����մϴ�.====");
		for(Product p:pros) {
			if(p.getPrice()>=100000)
			System.out.println(p.getPrice());
		}
		
		//����߰� 3. ������ ���ǵ��� �Ѱ���
		System.out.println("====�ѱ��԰����� ����մϴ�.====");
		int total = 0;
		for(Product p:pros) {
			total += p.getPrice() + p.getQuantity();
		}
		System.out.println("Total Price: " + total + "��");
	}

}
