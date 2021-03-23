package chatting.step2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {		
		// ���� ����
		private ServerSocket ss = null;
		// Ŭ���̾�Ʈ�� ����Ǵ� ����
		private Socket s = null;
		
		// Ŭ���̾�Ʈ�� Thread�� �����ϱ� ���� ArrayList�� �̿� 
		ArrayList <ChatThread> chatlist = new ArrayList <ChatThread>();
		
		// ���α׷� ����
		public void start() {
			try {
				
				// ���� ������ �����ϰ� ��Ʈ��ȣ(8888) ����
				ss = new ServerSocket(8888);
				// ������ ���۵� ��� �޼��� �߻�
				System.out.println("server start");
				
				
				// Ŭ���̾�Ʈ�� ����Ǳ⸦ ��ٸ��� while�� ����
				while(true) {
					
					// ���� �Ǿ��ٸ�
					s = ss.accept();				
					// ����� Ŭ���̾�Ʈ�� ���ؼ� chat Thread ��ü�� ����
					ChatThread chat = new ChatThread();
					
					// Ŭ���̾�Ʈ�� ����Ʈ�� �߰������ش�
					chatlist.add(chat);
					
					// chat Thread ����
					chat.start();
				}
			} catch(Exception e) {
			
				// ���ῡ �������� ��� ���� �޼��� �߻�
				System.out.println("[MultiChatServer]start() Exception �߻�!!");
			}   
		} 
		
		// ������ �����ϱ� ���� main
		public static void main(String[] args) {
			MultiChatServer server = new MultiChatServer();
			// ���� ����
			server.start();
		}
		
		// �޼��� ������
		void msgSendAll(String msg) {
			// ����ڿ� ���� ��� �޼����� ǥ�õ� �� �ֵ��� ����
			for(ChatThread ct : chatlist) {
				ct.outMsg.println(msg);
			}
		}

		// ������ Ŭ���̾�Ʈ���� ����
		class ChatThread extends Thread {
			
			// �޼��� ���� ���� ���� 
			String msg;
			String[] rmsg;
			
			// �Է� ��Ʈ��
			private BufferedReader inMsg = null;
			// ��� ��Ʈ��
			private PrintWriter outMsg = null;
			
			// �۵�
			public void run() {
			
				// ���� ������ ��
				boolean status = true;
				
				// ä�� Thread�� ����ȴٴ� �޼��� �߻�
				System.out.println("##ChatThread start...");
				
				try {
					// ����� ��Ʈ�� ����
		            // BufferedReader�� Buffer�� �ִ� IOŬ������ �Էµ� �����͸� �ٷ� �������� �ʰ�
		            // �߰� ���۸��� ��Ų �� ���޽�Ű�� ����� ������ �ִ� 
		            // -> ����� ��Ʈ������ �̸� ���ۿ� �����͸� �÷��α� ������ ȿ������ ����
		            
		            // InputStreamReader�� ����Ʈ ��Ʈ������ ���� ��Ʈ������ Ȥ�� ���� ��Ʈ������ ����Ʈ ��Ʈ������ ��ȯ�� �����Ѵ�
		            // ����Ʈ�� �о���̰� ������ ���� ���ڵ��� ���� ���ڷ� ��ȯ�ϴµ� ���
		            // ���̽� ��Ʈ�� -> InputStreamReader -> �����ڵ� ���ڿ� -> ���� ��Ʈ�� ���
		            
		            // Ŭ���̾�Ʈ�� ������ socket�� �����Ͽ� �����͸� �о���̱� ���� InputStream��
		            // ��뿡�� �����͸� �������� ���� OutputStream�� �����Ѵ�
					inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
					// PrintWriter�� print�� �����ϰ� ����ϴ� method�� ������ �ִ� ���� ��Ʈ��
		            // �⺻������ �� �ٲ� ����� �ֱ� ������ BufferedWriter�� ����� �� ���� �ڵ尡 ª������ ��
		            // -> newLine() : �ٹٲ� �� ������� �ʾƵ� ��
		            
		            // inMsgó�� socket�� �����Ͽ� InputStream���� �޾ƿ� �����͸� ��뿡�� ��������
					outMsg = new PrintWriter(s.getOutputStream(), true);
					
					// ����� ����Ǵ� �߿� �ִٸ�
					while(status) {
						
						// �޼��� ����
		            	// readLine()�� ������ ����Ͽ��� BufferedReader���� �Է¹޾Ҵ� ������ �ҷ����� ������ �Ѵ�
		            	// Buffer�� �̸� ����� ���� �о�� �� String ������ ���๮��(enter)�� �����Ͽ� �� ���� ���� �о�´�
						msg = inMsg.readLine();
						// �ռ� �о�� ���ڸ� "/"�� �������� �������ش�
						rmsg = msg.split("/");
						
						// ä�� �޼����� logout�̶�� �Է����� ���
						if(rmsg[1].equals("logout")) {
							// ä�� ��ȭ â�� �ʱ� ���·�(clear ���·�) ����
							chatlist.remove(this);
							// ������ �����ߴٴ� ������ server�޼����� ����
							msgSendAll("server/" + rmsg[0] + "���� �����߽��ϴ�.");
							// ä�� ���α׷� ���°� false�� ��ȯ��
							status = false;
						}
						
						// �α��� �޼����� �߻����� ���
						else if(rmsg[1].equals("login")) {
							// ������ �����ߴٴ� ������ server�޼����� ����
							msgSendAll("server/"+rmsg[0]+"���� �α����߽��ϴ�.");
						}
			
						else {
							// �޼����� ���� �ְ� ����
							// msgSendAll method�� �̿�
							msgSendAll(msg);
						}
					} 
					
					// Thread�� ���� �� �ֵ��� interrupt() method�� ȣ��
					// ó�� ȣ���� ��� Thread�� sleep()���� �� �Ͻ����� ���·� ���ٰ�
					// InterruptedException�� �߻��Ͽ� catch������ �̵��ϰ� �ǹǷ�
					// ��������� run() method�� ���� �����Ű�� ��
					this.interrupt();
					// ���� �޼��� �߻�
					System.out.println("##"+this.getName()+"stop!!");
				} catch(IOException e) {
					// ä�� ��ȭ â�� �ʱ� ���·�(clear ���·�) ����
					chatlist.remove(this);
					// e.printStackTrace();
					// run()�� while���� �������� Thread�� ���� ���� �Ǿ����� �޼��� �߻�
					System.out.println("[ChatThread]run() IOException �߻�!!");
				}
			}
		}
		
	}


