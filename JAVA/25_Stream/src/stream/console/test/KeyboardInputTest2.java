package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1.��Ʈ�� ��ü�� ����...�Է�,���
 * 2.while�� �ȿ��� ��� �о���̰� 
 * 3.���� �����͸� ���
 * ::
 * Ű����� �Է��� �����͸� 
 * �ַܼ� ����ϴ� ������ �ۼ�
 * ::
 * �Է� -- 2�� - InputStreamReader, BufferedReader
 * ��� -- X - System.out.println()
 */

public class KeyboardInputTest2 {

	public static void main(String[] args) throws IOException{
		//1.��Ʈ�� ��ü�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("InputStream Creating...Ű����� ������ �Է�..\n");

		
		String line = null;
		try {
			while((line = br.readLine())!=null) {//2.
				if(line.equals("exit")) {
					System.out.println("�ý����� �����մϴ�...�Է±���");
					break;
				}
				System.out.println("Reading Data :: " + line);//3.
			}
		}finally {
			br.close();
		}
		
	}

}
