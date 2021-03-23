package thread.step3.test;

import java.awt.Toolkit;

/*Thread
 * 1)main ������...���� ������...0
 * 2)�۾�������...X
 * 
 * 
 * �ش� �ڵ忡����
 * ������� �︮�� �۾��� 
 * ���ÿ� ������� ����ϴ� �۾��� 
 * �����ؼ� ó���ϵ��� ������ �ۼ�
 * --->
 * �ذ� ���
 * ������� ����ϴ� �۾��� ������� ������ �Ѵ�.
 * BeepPrintThread�� �ϳ� �ۼ�
 * BeepPrintTest2���� ���� �۾��� �� �� �ֵ��� ������ �ϼ�...
 */

class BeepPrintThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}//for
	}
}
public class BeepPrintTest2 {

	public static void main(String[] args) {
		BeepPrintThread beep = new BeepPrintThread();
		beep.start();//���������� ��ó�� �Ǵ� ����
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		//������� 5�� �︮�� �۾�...
		for(int i=0;i<5;i++) {
			tool.beep();	
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}//for
		
	
		

	}

}
