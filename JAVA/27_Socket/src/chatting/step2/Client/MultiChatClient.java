package chatting.step2.Client;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient implements ActionListener, Runnable{
	    private String ip;
	    private String id;
	    private Socket socket;
	    
	    // 입력 스트림
	    private BufferedReader inMsg = null;
	    // 출력 스트림
	    private PrintWriter outMsg = null;

	    // 로그인 패널 구성 (GUI)
	    private JPanel loginPanel;
	    // 로그인 버튼 (GUI)
	    private JButton loginButton;
	    // 채팅 대화명 (GUI)
	    private JLabel label1;
	    // 채팅 대화명 설정 (GUI)
	    private JTextField idInput;

	    // 로그아웃 패널 구성
	    private JPanel logoutPanel;
	    // 채팅 대화명 (GUI)
	    private JLabel label2;
	    // 로그아웃 버튼 (GUI)
	    private JButton logoutButton;

	    // 메세지 입력 패널 (GUI)
	    private JPanel msgPanel;
	    // 메세지 입력 창 (GUI)
	    private JTextField msgInput;
	    // 종료 버튼 (GUI)
	    private JButton exitButton;

	    // 채팅 화면 틀 (GUI)
	    private JFrame jframe;
	    // 채팅 화면에 나오는 메세지 창 (GUI)
	    private JTextArea msgOut;

	    // 카드 레이아웃 (GUI)
	    private Container tab;
	    private CardLayout clayout;
	    
	    // 스레드
	    private Thread thread;

	    // 상태 플래그
	    boolean status;

	    public MultiChatClient(String ip) {
	    	// Main에 입력된 ip주소를 받아옴
	        this.ip = ip;
	        
	        // 로그인 패널 화면 구성 (GUI)
	        loginPanel = new JPanel();
	        loginPanel.setLayout(new BorderLayout());
	        idInput = new JTextField(15);
	        // 로그인 버튼 설정 (GUI)
	        loginButton = new JButton("로그인");
	        // 액션 리스너를 이용하여 로그인 버튼과 연결
	        loginButton.addActionListener(this);
	        // 채팅 대화명 입력창 (GUI)
	        label1 = new JLabel("대화명");

	        // 만들어둔 로그인 패널에 위의 GUI 요소들을 배치
	        loginPanel.add(label1, BorderLayout.WEST);
	        loginPanel.add(idInput, BorderLayout.CENTER);
	        loginPanel.add(loginButton, BorderLayout.EAST);

	        // 로그아웃 패널 화면 구성 (GUI)
	        logoutPanel = new JPanel();
	        logoutPanel.setLayout(new BorderLayout());
	        label2 = new JLabel();
	        // 로그아웃 버튼 설정 (GUI)
	        logoutButton = new JButton("로그아웃");
	        // 액션 리스너를 이용하여 로그아웃 버튼과 연결
	        logoutButton.addActionListener(this);
	 
	        // 만들어둔 로그아웃 패널에 위의 GUI 요소들을 배치
	        logoutPanel.add(label2, BorderLayout.CENTER);
	        logoutPanel.add(logoutButton, BorderLayout.EAST);

	        // 채팅 대화 화면 구성 (GUI)
	        msgPanel = new JPanel();
	        msgPanel.setLayout(new BorderLayout());
	        msgInput = new JTextField(30);
	        // 액션 리스너를 이용하여 메세지가 입력되는 것을 인식 (GUI)
	        msgInput.addActionListener(this);
	        // 종료 버튼 설정 (GUI)
	        exitButton = new JButton("종료");
	        // 액션 리스너를 이용하여 프로그램이 종료될 수 있도록 함 (GUI)
	        exitButton.addActionListener(this);
	  
	        // 만들어둔 채팅 대화 패널에 GUI 요소들을 배치
	        msgPanel.add(msgInput, BorderLayout.CENTER);
	        msgPanel.add(exitButton, BorderLayout.EAST);

	        // 로그인 또는 로그아웃 패널을 선택할 수 있도록 CardLayout을 사용
	        tab = new JPanel();
	        clayout = new CardLayout();
	        tab.setLayout(clayout);
	        tab.add(loginPanel, "login");
	        tab.add(logoutPanel, "logout");

	        // 채팅 프로그램 메인 Frame (GUI)
	        jframe = new JFrame("::멀티챗::");
	        msgOut = new JTextArea("", 10, 30);
	        // setEditable을 false로 두어 JTextArea의 내용을 수정하지 못하게 함
	        // 수정할 수 없다는 것은 출력만 가능하게 함을 의미함
	        msgOut.setEditable(false);
	        
	        // VERTICAL(수직) 스크롤바는 ALWAYS 보여지도록 하고
	        // HORIZONTAL(수평) 스크롤바는 필요한 경우에만 보여지도록 NEVER로 설정
	        JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	        // Frame안에 GUI 요소들을 배치
	        jframe.add(tab, BorderLayout.NORTH);
	        jframe.add(jsp, BorderLayout.CENTER);
	        jframe.add(msgPanel, BorderLayout.SOUTH);
	       
	        // CardLayout에 설정해두었던 로그인과 로그아웃 패널 중 로그인을 우선 보여주도록 함
	        clayout.show(tab, "login");
	        
	        // pack을 이용하여 프레임이 적절한 사이즈로 맞춰지도록 함
	        jframe.pack();
	        
	        // setResizable을 false로 사용하여 앞에서 설정된 프레임의 크기가 변경되지 않도록 함
	        jframe.setResizable(false);
	        
	        // setVisible을 true로 설정하여 프레임이 보여지도록 함
	        jframe.setVisible(true);

	    }
	    
	    // 서버 연결 하는 method
	    public void connectServer() {
	        try {
	        	// 소켓 객체 생성
	        	// 앞서 입력한 ip와 포트번호(8888)를 지정함
	            socket = new Socket(ip, 8888);
	            // 연결 성공시 메세지 발생
	            System.out.println("[Client]Server 연결 성공!!");
	            
	            // 입출력 스트림 생성
	            // BufferedReader란 Buffer에 있는 IO클래스로 입력된 데이터를 바로 전달하지 않고
	            // 중간 버퍼링을 시킨 후 전달시키는 기능을 가지고 있다 
	            // -> 입출력 스트림에서 미리 버퍼에 데이터를 올려두기 때문에 효율성이 증가
	            
	            // InputStreamReader는 바이트 스트림에서 문자 스트림으로 혹은 문자 스트림에서 바이트 스트림으로 변환을 제공한다
	            // 바이트를 읽어들이고 지정된 문자 인코딩에 따라 문자로 변환하는데 사용
	            // 바이스 스트림 -> InputStreamReader -> 유니코드 문자열 -> 문자 스트림 출력
	            
	            // 클라이언트와 서버는 socket을 생성하여 데이터를 읽어들이기 위한 InputStream과
	            // 상대에게 데이터를 내보내기 위한 OutputStream을 생성한다
	            inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            // PrintWriter는 print와 유사하게 출력하는 method를 가지고 있는 보조 스트림
	            // 기본적으로 줄 바꿈 기능이 있기 때문에 BufferedWriter를 사용할 때 보다 코드가 짧아지게 됨
	            // -> newLine() : 줄바꿈 을 사용하지 않아도 됨
	            
	            // inMsg처럼 socket을 생성하여 InputStream에서 받아온 데이터를 상대에게 내보낸다
	            outMsg = new PrintWriter(socket.getOutputStream(), true);
	            
	            // 서버로 로그인 메세지를 전달함
	            // 입력한 id와 로그인 메세지가 출력됨
	            outMsg.println(id+"/"+"login");
	            
	            // 메세지 수신이 가능하도록 스레드 객체를 생성함
	            thread = new Thread(this);
	            // 스레드 시작
	            thread.start();
	        } catch(Exception e) {
	            // e.printStackTrace();
	        	// 서버에 연결되지 않으면 메세지가 발생하도록 함
	            System.out.println("[MultiChatClient]connectServer() Exception 발생!!");
	        }
	    }

	    // 액션 이벤트 처리 method
	    public void actionPerformed(ActionEvent arg0) {
	        Object obj = arg0.getSource();

	        // 조건문 사용
	        // 종료 버튼을 눌렀을 경우
	        // 프로그램 종료
	        if(obj == exitButton) {
	            System.exit(0);
	        } 
	        
	        // 로그인 버튼을 눌렀을 경우
	        else if(obj == loginButton) {
	        	// 사용자에게 id를 입력받고 입력된 Text를 가져옴
	            id = idInput.getText();
	            
	            // 만들어 두었던 label(GUI)에 가져온 id를 출력
	            label2.setText("대화명 : " + id);
	            // 위 과정에서 login이 진행되었으므로 CardLayout에 logout 패널을 보여줌
	            clayout.show(tab, "logout");
	            // 서버와 연결시킴
	            connectServer();
	        } 
	        
	        // 로그아웃 버튼을 눌렀을 경우
	        else if(obj == logoutButton) {
	        	// id와 logout을 표기함
	            outMsg.println(id + "/" + "logout");
	            
	            // 대화창을 ""안의 내용 즉 clear 상태로 만든다
	            msgOut.setText("");
	            
	            // CardLayout에 초기 상태 즉 login 패널을 다시 보여줌
	            clayout.show(tab, "login");
	            
	            // Buffer와 socket 모두 종료
	            outMsg.close();            
	            try {
	                inMsg.close();
	                socket.close();
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
	            
	            // 상태 변경
	            status = false;
	        } 
	        
	        // 채팅 메세지를 입력했을 경우
	        else if(obj == msgInput) {
	        	
	        	// 채팅 메세지를 Buffer(InputMsg)로 보낸 후 outMsg로 가져온 후 출력
	            outMsg.println(id + "/" + msgInput.getText());
	            
	            // 메세지 입력창을 ""안의 내용 즉 clear 상태로 만든다
	            // 메세지를 입력하고 clear 해주지 않으면 입력한 메세지가 남아있게 됨
	            msgInput.setText("");
	        }
	    }

	    public void run() {
	    	
	    	// 메세지 관련 변수 설정
	        String msg;
	        String[] rmsg;
	        
	        // 상태 변경
	        status = true;

	        while(status) {
	            try {
	            	// 메세지 수신
	            	// readLine()은 앞전에 사용하였던 BufferedReader에서 입력받았던 내용을 불러오는 역할을 한다
	            	// Buffer에 미리 저장된 값을 읽어올 때 String 값으로 개행문자(enter)를 포함하여 한 줄을 전부 읽어온다
	                msg = inMsg.readLine();
	                // 앞서 읽어온 문자를 "/"를 기준으로 나누어준다
	                rmsg = msg.split("/");

	                // JTextArea에 수신된 메세지 추가
	                // rmsg[0]은 id + rmgs[1]은 읽어온 메세지 + 줄바꿈(enter)의 출력형태
	                msgOut.append(rmsg[0] + ">"+rmsg[1] + "\n");
	                
	                // 현재 대화 메세지를 보여줌
	                // 텍스트의 삽입 위치를 설정하여 화면상으로 스크롤 형태로 보여질 수 있도록 함
	                // 앞서 msgOut.append으로 메세지를 읽어들일 때 getLength로 길이를 확인하고
	                // setCarePosition을 이용하여 위치를 지정 -> 스크롤 형태
	                msgOut.setCaretPosition(msgOut.getDocument().getLength());
	            } catch(IOException e) {
	                // e.printStackTrace();
	                status = false;
	            }
	        }
	        
	        // 채팅 프로그램이 종료될 때 메세지 발생
	        System.out.println("[MultiChatClient]" + thread.getName() + "종료됨");
	    }

	    public static void main(String[] args) {
	    	// ""안의 ip주소를 넘겨 상대방이 접속할 수 있게 하고 두 클라이언트가 연결될 수 있도록 함
	        MultiChatClient mcc = new MultiChatClient("127.0.0.1");
	    }
	}
	
