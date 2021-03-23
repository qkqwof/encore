package chatting.step2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {		
		// 서버 소켓
		private ServerSocket ss = null;
		// 클라이언트와 연결되는 소켓
		private Socket s = null;
		
		// 클라이언트의 Thread를 관리하기 위해 ArrayList를 이용 
		ArrayList <ChatThread> chatlist = new ArrayList <ChatThread>();
		
		// 프로그램 시작
		public void start() {
			try {
				
				// 서버 소켓을 설정하고 포트번호(8888) 지정
				ss = new ServerSocket(8888);
				// 서버가 시작될 경우 메세지 발생
				System.out.println("server start");
				
				
				// 클라이언트가 연결되기를 기다리며 while문 진행
				while(true) {
					
					// 연결 되었다면
					s = ss.accept();				
					// 연결된 클라이언트에 대해서 chat Thread 객체를 생성
					ChatThread chat = new ChatThread();
					
					// 클라이언트에 리스트를 추가시켜준다
					chatlist.add(chat);
					
					// chat Thread 시작
					chat.start();
				}
			} catch(Exception e) {
			
				// 연결에 실패했을 경우 실패 메세지 발생
				System.out.println("[MultiChatServer]start() Exception 발생!!");
			}   
		} 
		
		// 서버를 시자하기 위한 main
		public static void main(String[] args) {
			MultiChatServer server = new MultiChatServer();
			// 서버 시작
			server.start();
		}
		
		// 메세지 보내기
		void msgSendAll(String msg) {
			// 사용자와 상대방 모두 메세지가 표시될 수 있도록 연결
			for(ChatThread ct : chatlist) {
				ct.outMsg.println(msg);
			}
		}

		// 각각의 클라이언트들을 관리
		class ChatThread extends Thread {
			
			// 메세지 관련 변수 설정 
			String msg;
			String[] rmsg;
			
			// 입력 스트림
			private BufferedReader inMsg = null;
			// 출력 스트림
			private PrintWriter outMsg = null;
			
			// 작동
			public void run() {
			
				// 진행 상태일 때
				boolean status = true;
				
				// 채팅 Thread가 진행된다는 메세지 발생
				System.out.println("##ChatThread start...");
				
				try {
					// 입출력 스트림 생성
		            // BufferedReader란 Buffer에 있는 IO클래스로 입력된 데이터를 바로 전달하지 않고
		            // 중간 버퍼링을 시킨 후 전달시키는 기능을 가지고 있다 
		            // -> 입출력 스트림에서 미리 버퍼에 데이터를 올려두기 때문에 효율성이 증가
		            
		            // InputStreamReader는 바이트 스트림에서 문자 스트림으로 혹은 문자 스트림에서 바이트 스트림으로 변환을 제공한다
		            // 바이트를 읽어들이고 지정된 문자 인코딩에 따라 문자로 변환하는데 사용
		            // 바이스 스트림 -> InputStreamReader -> 유니코드 문자열 -> 문자 스트림 출력
		            
		            // 클라이언트와 서버는 socket을 생성하여 데이터를 읽어들이기 위한 InputStream과
		            // 상대에게 데이터를 내보내기 위한 OutputStream을 생성한다
					inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
					// PrintWriter는 print와 유사하게 출력하는 method를 가지고 있는 보조 스트림
		            // 기본적으로 줄 바꿈 기능이 있기 때문에 BufferedWriter를 사용할 때 보다 코드가 짧아지게 됨
		            // -> newLine() : 줄바꿈 을 사용하지 않아도 됨
		            
		            // inMsg처럼 socket을 생성하여 InputStream에서 받아온 데이터를 상대에게 내보낸다
					outMsg = new PrintWriter(s.getOutputStream(), true);
					
					// 제대로 진행되는 중에 있다면
					while(status) {
						
						// 메세지 수신
		            	// readLine()은 앞전에 사용하였던 BufferedReader에서 입력받았던 내용을 불러오는 역할을 한다
		            	// Buffer에 미리 저장된 값을 읽어올 때 String 값으로 개행문자(enter)를 포함하여 한 줄을 전부 읽어온다
						msg = inMsg.readLine();
						// 앞서 읽어온 문자를 "/"를 기준으로 나누어준다
						rmsg = msg.split("/");
						
						// 채팅 메세지를 logout이라고 입력했을 경우
						if(rmsg[1].equals("logout")) {
							// 채팅 대화 창을 초기 상태로(clear 상태로) 만듬
							chatlist.remove(this);
							// 상대방이 종료했다는 내용을 server메세지로 전달
							msgSendAll("server/" + rmsg[0] + "님이 종료했습니다.");
							// 채팅 프로그램 상태가 false로 전환됨
							status = false;
						}
						
						// 로그인 메세지가 발생했을 경우
						else if(rmsg[1].equals("login")) {
							// 상대방이 접속했다는 내용을 server메세지로 전달
							msgSendAll("server/"+rmsg[0]+"님이 로그인했습니다.");
						}
			
						else {
							// 메세지를 서로 주고 받음
							// msgSendAll method를 이용
							msgSendAll(msg);
						}
					} 
					
					// Thread를 멈출 수 있도록 interrupt() method를 호출
					// 처음 호출할 경우 Thread가 sleep()상태 즉 일시정지 상태로 들어갔다가
					// InterruptedException이 발생하여 catch문으로 이동하게 되므로
					// 결론적으로 run() method를 정상 종료시키게 됨
					this.interrupt();
					// 종료 메세지 발생
					System.out.println("##"+this.getName()+"stop!!");
				} catch(IOException e) {
					// 채팅 대화 창을 초기 상태로(clear 상태로) 만듬
					chatlist.remove(this);
					// e.printStackTrace();
					// run()의 while문을 빠져나와 Thread가 정상 종료 되었을때 메세지 발생
					System.out.println("[ChatThread]run() IOException 발생!!");
				}
			}
		}
		
	}


