package gui.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChattServer {
	//Process�� �ʵ带 ����
	ServerSocket server;
	Socket s;
	ArrayList<Chatthread> list;
	
	public ChattServer(){
		list = new ArrayList<Chatthread>();
	}
	
	public void broadcast(String message) {
		for(Chatthread t : list) {
			t.sendMessage(message);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready......");
			
			while(true) { //������....wating for...
				s=server.accept();
				Chatthread ct = new Chatthread(s,this);
				list.add(ct);
				ct.start();//.. �۾��� ���������� ����Ǵ� pocus!!
			}
		}catch(Exception e) {
			
		}finally {
			
		}
	}
	public static void main(String[] args) {
		ChattServer process = new ChattServer();
		process.net();
	}
}
//������ ����� Ŭ���̾�Ʈ�� �޼����� �ְ�޴��ϸ� �����ϴ� ������...�۾�������
class Chatthread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattServer;
			
	Chatthread(Socket s, ChattServer chattServer){
		this.s = s;
		this.chattServer = chattServer;
		
		System.out.println(s.getInetAddress()+"���� �����ϼ̽��ϴ�.");	
		chattServer.broadcast(s.getInetAddress()+"���� ä�ù濡 �����̽��ϴ�.");
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while(true) {
				String line = br.readLine();
				chattServer.broadcast(line);
			}
		}catch(IOException e) {
			//������ �������� ������ �̰����� ...
			System.out.println(s.getInetAddress()+"���� ������ �����̽��ϴ�.");	
			chattServer.broadcast(s.getInetAddress()+"���� ä�ù��� �����̽��ϴ�.");
			//
			chattServer.list.remove(this);			
		}
	}
}












