package chatting.step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Socket ��ſ��� Ŭ���̾�Ʈ�� ������ ��� �ִ� ���μ���
 * ������ �����ؼ� ��û�� �ϰ����ϴ� ���������� ������ �õ�
 * �̶� �������� ������ �ִ� ��Ʈ�� ������ ��Ʈ�� �̿��ؾ� ������ �ɼ� �ִ�
 * ::
 * ��Ʈ�� �ڵ�
 * Ű����� �о���� ����Ÿ�� 
 * ������ ������ ������ �ۼ�
 */
public class ChattClient {
	Socket s;
	BufferedReader br;//��ü������ ����
	PrintWriter pw; //�������� ���Ϲ޾Ƽ�..
	
	public void net() {
		try {
			s = new Socket("127.0.0.1", 5500);
			System.out.println("Socket Creating...");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);//auto flushing
			System.out.println("Stream Creating...");
			
			String line = "";
			while((line = br.readLine())!=null) pw.println(line);
			
		} catch (UnknownHostException e) {	
			System.out.println("�������� ���ῡ �����߽��ϴ�..");
		} catch (IOException e) {			
		}
	}
	
	public static void main(String[] args) {
		ChattClient chattClient = new ChattClient();
		chattClient.net();
	}

}
