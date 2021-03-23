package stream.console.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Ű����� �о���� �����͸� �ַܼ� ���(System.out.println())�ϴ� ������ �ۼ�
 * ::
 * �ҽ��ڵ� ����
 * 1. ��Ʈ�� ��ü ����
 * 2. �о���δ�.
 * 3. �ַܼ� ����Ѵ�.
 */

public class KeyboardInputTest1 {

	public static void main(String[] args) {
		//1. �Է� ��Ʈ���� �ʿ�..2��(�⺻(node),����(filter))
		System.out.println("1.��Ʈ�� ����...�����͸� Ű����� �Է��ϼ���>>>>");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		//2.������ ��Ʈ���� ����� ���...�о���δ�.
		System.out.println("2.�����͸� �о���δ�...");
		try {
			String line = br.readLine();
			while(line!=null) {
				//3.�о���� �����͸� �ַܼ� ����Ѵ�.
				System.out.println("Reading Data :: " + line);
				line = br.readLine();// �� �κ��� �� �߰� �Ǿ�� ��� �о ���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				
			}
		}
	}

}
