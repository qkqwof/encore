package stream.data.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ带 �ۼ�
 * ���࿡ score.dat ���� ������ �������� �ʾƼ� ��µǴ� �����޽����� ����...
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ������ ���ڱ���� �ƴ�, Binary Data(���� ������)�̱⿡
 * ����������� ���Ƶ� �� �� ���� �������� ����
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ��� 
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻��(int)���� �ڵ���ȯ���Ѽ� �о�� ��
 * 
 */

public class DataOutputStreamTest2 {

	public static void main(String[] args){
		DataInputStream dis = null;
		try {
		dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
		int data = 0;
		
			while(true) {
				data = dis.readInt();
				System.out.println(data);
			}
		}catch(EOFException e) {//More Exception!!
			
		}catch(IOException e) {
			
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
