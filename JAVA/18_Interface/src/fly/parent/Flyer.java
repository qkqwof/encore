package fly.parent;

//������ �Ͱ� ���õ� �߻����� ��Ƴ��� �������̽�

/*
 * �������̽��� �������
 * 1. static final ���
 * 2. public abstract �޼ҵ�
 */

public interface Flyer {
	//�������̽��� �ʵ尡 ����...but ����� ����
	public static final int SIZE = 100;
	
	public abstract void fly();//abstract method...����θ� �ְ� ������({//})�� ���� �޼ҵ�
	void land();//�������̽� �ȿ��� ������ �޼ҵ� ����Ÿ�� �տ� public abstract�� �����ȴ�.
	public abstract void take_off();
	
}

