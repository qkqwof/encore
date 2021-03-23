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
 * scores.dat������ ������ readInt()�� �о�鿩��
 * ������ ������ ����ϰ�
 * ��� ������ ������ ���ϴ� ������ �ۼ�...
 * EOFException�� ������ ������ �������� �ʰ�
 * ����������� �������� ������
 * main�޼ҵ� ����ο��� throws�� ������ �� ����
 * ---------------------------------------
 * main�޼ҵ� ����ο��� throws�� ���ܸ� ������
 * main�� ȣ���� ��(JVM)���� ���ܸ� ó���� �� �ִ� ����
 * Compile Exception�迭 ���� ����
 * 
 */

public class DataOutputStreamTest4 {

	public static void main(String[] args){
		int sum = 0;
		int score = 0;
		DataInputStream dis = null;
		//1.��Ʈ�� ����
		try {
			dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
			System.out.println("Stream Creating...");
			
			while(true){
				score = dis.readInt();
				System.out.println(score);//������ ������ ���⼭ ��µȴ�...
				sum += score;
			}
		}catch(EOFException e) {
			System.out.println("��� ������ ������ " + sum + "��!!");
		}catch(IOException e) {
			
	    }finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//
	}

}
