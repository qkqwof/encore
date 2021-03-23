package thread.step1.test;

/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ������.
 * Thread�� 2���� �����Ѵ�.
 * GoThread, ComeThread
 */


class GoThread extends Thread{
	//�����尡 �۵��ϴ� �κ�....run() ��� �ȿ��� �ش� �����尡 �����ϴ� ���� Ȯ���� �� �ִ�.
	public void run() {
		int i = 0;
		while(true) {
			System.out.println("Go......"+i);
			i++;
			if(i==20) break;
		}
	}
}

class ComeThread extends Thread{//������
	//�����尡 �۵��ϴ� �κ�....run() ��� �ȿ��� �ش� �����尡 �����ϴ� ���� Ȯ���� �� �ִ�.
	public void run() {
		int i = 0;
		while(true) {
			System.out.println("Come......"+i);
			i++;
			if(i==20) break;
		}
	}
}

public class GoComeThread {//���μ���

	public static void main(String[] args) {//���� �޼ҵ�(���� ������)
		//GoComeThread��� ���μ��� �ȿ��� 2���� �����带 ���۽��Ѻ����� ����
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start();//run�� ȣ���ϴ°� �ƴ� start�� ȣ���ؾ� ��.
		t2.start();

	}

}
