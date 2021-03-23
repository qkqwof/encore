package exception.user.test;

import java.util.Scanner;



class AmountInputException extends Exception{
	AmountInputException(){
		this("�Ա��� ���� �ʽ��ϴ�.");
	}
	AmountInputException(String message){
		super(message);
	}
}


class InvalidAmountException extends Exception{
	InvalidAmountException(){
		this("����� �� �����ϴ�.");
	}
	InvalidAmountException(String message){
		super(message);
	}
}

class Account{
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;	
	}

	public int getBalance() {
		return balance;
	}
	

	public void deposit(int amt) throws AmountInputException{
		//�Ա��ϴ� ����
		//�Աݾ��� 10000���� �ȵǸ� AmountInputException�� �߻�
		if(amt<10000)
			throw new AmountInputException();
		//�������� �Ա��̸� �ܾ׿� �ݾ��� �߰��ϰ� �� �ԱݵǾ��� �ܾ��� ������ ����Ѵ�.
		else
			balance += amt;
		System.out.println(amt + "�� �Ա� �Ϸ�!!");
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�!!!");
	}
	
	public void withdraw(int amt) throws InvalidAmountException{
		//����ϴ� ����
		//���� �ܾ׺��� �� ���� �ݾ��� ����Ϸ��� ��� InvalidAmountException�� �߻�
		if(balance<amt)
			throw new InvalidAmountException();
		//��ݾ��� �ܾ׺��� �۰ų� ���ٸ� �ܾ׿��� ��ݾ��� ����...�� ����ߴ����� �����ִ� �ܾ��� ���
		else
			balance -=amt;
		System.out.println(amt + "�� ��ݿϷ�!!!");
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
}

public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		/*
		 * ��ü ����
		 * �޼ҵ� ����ȣ��....���ܸ� ���⼭ ����ش�.
		 */
		Account acc = new Account(10000);
		try {
			acc.deposit(20000);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.deposit(200);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(5000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(500000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}

}
