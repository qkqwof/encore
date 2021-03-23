package thread.step6.test;

/*
 * Ư���� ���� �����ϴ� ������ Ŭ����
 * MegaBox���� �¼��� �����ϴ� ���� �����Ѵ�.
 * reserve()...��� ����� ����..
 */

public class MagaboxUser implements Runnable{
	private boolean seat = false;//�¼� ���Ű� �������� true�� �ٲ۴�.

	@Override
	public void run() {//�������� ȣ�⿡ ���� �Ͼ�� ������ try~catch �ۿ� �ȵ�...
		
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//�޼��� ȣ��
	}//run
	
	//�¼��� �����ϴ� ���...
	public synchronized void reserve() throws InterruptedException{
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "��, ��ȭ �����Ϸ� ���̽��ϴ�.!!!");
		if(seat == false) {//�¼��� ����ٸ�..���� ����
			Thread.sleep(1000);
			System.out.println(tName + "��, �¼� ���� ����!!");
			seat = true;//�ݵ�� �־���� �Ѵ�.
		} else {//�¼��� �̹� ���Ű� �Ǿ��ٸ� ���� �Ұ���
			System.out.println(tName + "��, �ش� �¼��� �̹� �Ϸ�� �����Դϴ�!!!");
		}
	}
	
	
}
