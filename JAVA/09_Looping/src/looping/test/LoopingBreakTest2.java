package looping.test;

/*
 * for���� �̿��ؼ� 1~100������ ������ ���ϴ� ������ �ۼ�
 * ������ �ϳ� �� �߰��Ѵ�.
 * 	- ������ 500�� �Ѿ�� �ݺ��� �ߴ��ϰ�...break
 * 	  �� ���� ���հ� i���� ���
 */

public class LoopingBreakTest2 {

	public static void main(String[] args) {
		int sum = 0;//local ����...�⺻���� ���� ������ �ݵ�� �ʱ�ȭ �ϰ� ���
		for(int i =1; i<=100;i++) {
			sum += i;
			if(sum>500) {
				break;
			}
		}
		System.out.println(sum); //5050
	}
}

//1. �ݺ������� break Ű����� ���ǹ��� �Բ� ���δ�. 0

//2. if������ break Ű���带 ����ϸ� 
//   if���� ����������. --> x(�ݺ����� ����������.)

