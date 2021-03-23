package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		//Account Type�� �迭 ����, ����, �ʱ�ȭ
		Account[] acc = {
				new Account(1000.0,"��������"),
				new Account(30000.0,"��������"),
				new Account(40000.0,"�츮����")
		};
		
		//1.Customer ��ü�� ����
		Customer cust = new Customer("James",12345);
		//2.James��� ���� ���� 3���� Hasing �ϵ��� �Ѵ�./
		cust.setAccounts(acc);
		//3.James�� ������ ������� �޾ƿ´�.
		Account[] returnAcc =cust.getAccounts();
		//4.James�� ����� �߿��� �������� ���忡�� 5������ �Ա��Ѵ�.
		for(Account a: returnAcc) {
			if(a.getBankName().equals("��������")) {
				a.deposit(50000.0);
			}
		}
		//5.�� ������� �ܰ� Ȯ���Ѵ�.
		System.out.println("==========������ �ܰ� Ȯ���մϴ�.===========");
		//�ʿ��� ����� �ִٸ� �˾Ƽ� �߰��ϱ�
		for(Account account: returnAcc) {
			System.out.println(account.getDetail());
		}
		

	}

}
