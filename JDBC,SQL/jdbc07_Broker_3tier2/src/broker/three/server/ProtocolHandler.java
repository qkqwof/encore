package broker.three.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * server Side 의 Process class..main...
 * 서버소켓을 가지면서 클라이언트의 접속을 기다린다..
 * 클라이언트가 접속을 하면 accept()로 맞아들여서 소켓을 리턴...이걸 Jury가 가져간다...
 * JURY 쓰레드가 START..
 * 
 *  THREAD
 *  1)데몬 쓰레드...main
 *  2)작업 쓰레드...JuryThread
 *  3)리스너 쓰레드 ...ProtocolHandler
 *    무한루핑 돌면서 계속적으로 클라이언트의 접속을 기다린다.
 *    특정한 기능을 하는것은 아니다.
 *    
 */
public class ProtocolHandler extends Thread{
	//필드 선언
	ServerSocket server;
	Socket s;
	JuryThread jury;
	Database db;	
	public static final int MIDDLE_PORT = 60000;
	
	public ProtocolHandler(String serverIP){
		try {
			server = new ServerSocket(MIDDLE_PORT);
			db =  new Database(serverIP);
		}catch(Exception e) {
			
		}		
		System.out.println("start Protocol Handler.....service port ..."+MIDDLE_PORT);
	}	
	public void run() {
		//무한 루핑을 돌면서 클라이언트가 접속하면
		//소켓을 리턴하고 그걸가지고 
		//juryThread를 생성 start시킨다
		while(true) {
			try {
				s = server.accept();
				jury = new JuryThread(s,db);
				jury.start();
			} catch (IOException e) {
				
			}			
		}//while
	}//run
	
	public static void main(String[] args) {
		ProtocolHandler handler = new ProtocolHandler("127.0.0.1");
		handler.start();
	}
}









