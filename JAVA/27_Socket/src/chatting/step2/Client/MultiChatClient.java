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
	    
	    // �Է� ��Ʈ��
	    private BufferedReader inMsg = null;
	    // ��� ��Ʈ��
	    private PrintWriter outMsg = null;

	    // �α��� �г� ���� (GUI)
	    private JPanel loginPanel;
	    // �α��� ��ư (GUI)
	    private JButton loginButton;
	    // ä�� ��ȭ�� (GUI)
	    private JLabel label1;
	    // ä�� ��ȭ�� ���� (GUI)
	    private JTextField idInput;

	    // �α׾ƿ� �г� ����
	    private JPanel logoutPanel;
	    // ä�� ��ȭ�� (GUI)
	    private JLabel label2;
	    // �α׾ƿ� ��ư (GUI)
	    private JButton logoutButton;

	    // �޼��� �Է� �г� (GUI)
	    private JPanel msgPanel;
	    // �޼��� �Է� â (GUI)
	    private JTextField msgInput;
	    // ���� ��ư (GUI)
	    private JButton exitButton;

	    // ä�� ȭ�� Ʋ (GUI)
	    private JFrame jframe;
	    // ä�� ȭ�鿡 ������ �޼��� â (GUI)
	    private JTextArea msgOut;

	    // ī�� ���̾ƿ� (GUI)
	    private Container tab;
	    private CardLayout clayout;
	    
	    // ������
	    private Thread thread;

	    // ���� �÷���
	    boolean status;

	    public MultiChatClient(String ip) {
	    	// Main�� �Էµ� ip�ּҸ� �޾ƿ�
	        this.ip = ip;
	        
	        // �α��� �г� ȭ�� ���� (GUI)
	        loginPanel = new JPanel();
	        loginPanel.setLayout(new BorderLayout());
	        idInput = new JTextField(15);
	        // �α��� ��ư ���� (GUI)
	        loginButton = new JButton("�α���");
	        // �׼� �����ʸ� �̿��Ͽ� �α��� ��ư�� ����
	        loginButton.addActionListener(this);
	        // ä�� ��ȭ�� �Է�â (GUI)
	        label1 = new JLabel("��ȭ��");

	        // ������ �α��� �гο� ���� GUI ��ҵ��� ��ġ
	        loginPanel.add(label1, BorderLayout.WEST);
	        loginPanel.add(idInput, BorderLayout.CENTER);
	        loginPanel.add(loginButton, BorderLayout.EAST);

	        // �α׾ƿ� �г� ȭ�� ���� (GUI)
	        logoutPanel = new JPanel();
	        logoutPanel.setLayout(new BorderLayout());
	        label2 = new JLabel();
	        // �α׾ƿ� ��ư ���� (GUI)
	        logoutButton = new JButton("�α׾ƿ�");
	        // �׼� �����ʸ� �̿��Ͽ� �α׾ƿ� ��ư�� ����
	        logoutButton.addActionListener(this);
	 
	        // ������ �α׾ƿ� �гο� ���� GUI ��ҵ��� ��ġ
	        logoutPanel.add(label2, BorderLayout.CENTER);
	        logoutPanel.add(logoutButton, BorderLayout.EAST);

	        // ä�� ��ȭ ȭ�� ���� (GUI)
	        msgPanel = new JPanel();
	        msgPanel.setLayout(new BorderLayout());
	        msgInput = new JTextField(30);
	        // �׼� �����ʸ� �̿��Ͽ� �޼����� �ԷµǴ� ���� �ν� (GUI)
	        msgInput.addActionListener(this);
	        // ���� ��ư ���� (GUI)
	        exitButton = new JButton("����");
	        // �׼� �����ʸ� �̿��Ͽ� ���α׷��� ����� �� �ֵ��� �� (GUI)
	        exitButton.addActionListener(this);
	  
	        // ������ ä�� ��ȭ �гο� GUI ��ҵ��� ��ġ
	        msgPanel.add(msgInput, BorderLayout.CENTER);
	        msgPanel.add(exitButton, BorderLayout.EAST);

	        // �α��� �Ǵ� �α׾ƿ� �г��� ������ �� �ֵ��� CardLayout�� ���
	        tab = new JPanel();
	        clayout = new CardLayout();
	        tab.setLayout(clayout);
	        tab.add(loginPanel, "login");
	        tab.add(logoutPanel, "logout");

	        // ä�� ���α׷� ���� Frame (GUI)
	        jframe = new JFrame("::��Ƽê::");
	        msgOut = new JTextArea("", 10, 30);
	        // setEditable�� false�� �ξ� JTextArea�� ������ �������� ���ϰ� ��
	        // ������ �� ���ٴ� ���� ��¸� �����ϰ� ���� �ǹ���
	        msgOut.setEditable(false);
	        
	        // VERTICAL(����) ��ũ�ѹٴ� ALWAYS ���������� �ϰ�
	        // HORIZONTAL(����) ��ũ�ѹٴ� �ʿ��� ��쿡�� ���������� NEVER�� ����
	        JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	        // Frame�ȿ� GUI ��ҵ��� ��ġ
	        jframe.add(tab, BorderLayout.NORTH);
	        jframe.add(jsp, BorderLayout.CENTER);
	        jframe.add(msgPanel, BorderLayout.SOUTH);
	       
	        // CardLayout�� �����صξ��� �α��ΰ� �α׾ƿ� �г� �� �α����� �켱 �����ֵ��� ��
	        clayout.show(tab, "login");
	        
	        // pack�� �̿��Ͽ� �������� ������ ������� ���������� ��
	        jframe.pack();
	        
	        // setResizable�� false�� ����Ͽ� �տ��� ������ �������� ũ�Ⱑ ������� �ʵ��� ��
	        jframe.setResizable(false);
	        
	        // setVisible�� true�� �����Ͽ� �������� ���������� ��
	        jframe.setVisible(true);

	    }
	    
	    // ���� ���� �ϴ� method
	    public void connectServer() {
	        try {
	        	// ���� ��ü ����
	        	// �ռ� �Է��� ip�� ��Ʈ��ȣ(8888)�� ������
	            socket = new Socket(ip, 8888);
	            // ���� ������ �޼��� �߻�
	            System.out.println("[Client]Server ���� ����!!");
	            
	            // ����� ��Ʈ�� ����
	            // BufferedReader�� Buffer�� �ִ� IOŬ������ �Էµ� �����͸� �ٷ� �������� �ʰ�
	            // �߰� ���۸��� ��Ų �� ���޽�Ű�� ����� ������ �ִ� 
	            // -> ����� ��Ʈ������ �̸� ���ۿ� �����͸� �÷��α� ������ ȿ������ ����
	            
	            // InputStreamReader�� ����Ʈ ��Ʈ������ ���� ��Ʈ������ Ȥ�� ���� ��Ʈ������ ����Ʈ ��Ʈ������ ��ȯ�� �����Ѵ�
	            // ����Ʈ�� �о���̰� ������ ���� ���ڵ��� ���� ���ڷ� ��ȯ�ϴµ� ���
	            // ���̽� ��Ʈ�� -> InputStreamReader -> �����ڵ� ���ڿ� -> ���� ��Ʈ�� ���
	            
	            // Ŭ���̾�Ʈ�� ������ socket�� �����Ͽ� �����͸� �о���̱� ���� InputStream��
	            // ��뿡�� �����͸� �������� ���� OutputStream�� �����Ѵ�
	            inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            // PrintWriter�� print�� �����ϰ� ����ϴ� method�� ������ �ִ� ���� ��Ʈ��
	            // �⺻������ �� �ٲ� ����� �ֱ� ������ BufferedWriter�� ����� �� ���� �ڵ尡 ª������ ��
	            // -> newLine() : �ٹٲ� �� ������� �ʾƵ� ��
	            
	            // inMsgó�� socket�� �����Ͽ� InputStream���� �޾ƿ� �����͸� ��뿡�� ��������
	            outMsg = new PrintWriter(socket.getOutputStream(), true);
	            
	            // ������ �α��� �޼����� ������
	            // �Է��� id�� �α��� �޼����� ��µ�
	            outMsg.println(id+"/"+"login");
	            
	            // �޼��� ������ �����ϵ��� ������ ��ü�� ������
	            thread = new Thread(this);
	            // ������ ����
	            thread.start();
	        } catch(Exception e) {
	            // e.printStackTrace();
	        	// ������ ������� ������ �޼����� �߻��ϵ��� ��
	            System.out.println("[MultiChatClient]connectServer() Exception �߻�!!");
	        }
	    }

	    // �׼� �̺�Ʈ ó�� method
	    public void actionPerformed(ActionEvent arg0) {
	        Object obj = arg0.getSource();

	        // ���ǹ� ���
	        // ���� ��ư�� ������ ���
	        // ���α׷� ����
	        if(obj == exitButton) {
	            System.exit(0);
	        } 
	        
	        // �α��� ��ư�� ������ ���
	        else if(obj == loginButton) {
	        	// ����ڿ��� id�� �Է¹ް� �Էµ� Text�� ������
	            id = idInput.getText();
	            
	            // ����� �ξ��� label(GUI)�� ������ id�� ���
	            label2.setText("��ȭ�� : " + id);
	            // �� �������� login�� ����Ǿ����Ƿ� CardLayout�� logout �г��� ������
	            clayout.show(tab, "logout");
	            // ������ �����Ŵ
	            connectServer();
	        } 
	        
	        // �α׾ƿ� ��ư�� ������ ���
	        else if(obj == logoutButton) {
	        	// id�� logout�� ǥ����
	            outMsg.println(id + "/" + "logout");
	            
	            // ��ȭâ�� ""���� ���� �� clear ���·� �����
	            msgOut.setText("");
	            
	            // CardLayout�� �ʱ� ���� �� login �г��� �ٽ� ������
	            clayout.show(tab, "login");
	            
	            // Buffer�� socket ��� ����
	            outMsg.close();            
	            try {
	                inMsg.close();
	                socket.close();
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
	            
	            // ���� ����
	            status = false;
	        } 
	        
	        // ä�� �޼����� �Է����� ���
	        else if(obj == msgInput) {
	        	
	        	// ä�� �޼����� Buffer(InputMsg)�� ���� �� outMsg�� ������ �� ���
	            outMsg.println(id + "/" + msgInput.getText());
	            
	            // �޼��� �Է�â�� ""���� ���� �� clear ���·� �����
	            // �޼����� �Է��ϰ� clear ������ ������ �Է��� �޼����� �����ְ� ��
	            msgInput.setText("");
	        }
	    }

	    public void run() {
	    	
	    	// �޼��� ���� ���� ����
	        String msg;
	        String[] rmsg;
	        
	        // ���� ����
	        status = true;

	        while(status) {
	            try {
	            	// �޼��� ����
	            	// readLine()�� ������ ����Ͽ��� BufferedReader���� �Է¹޾Ҵ� ������ �ҷ����� ������ �Ѵ�
	            	// Buffer�� �̸� ����� ���� �о�� �� String ������ ���๮��(enter)�� �����Ͽ� �� ���� ���� �о�´�
	                msg = inMsg.readLine();
	                // �ռ� �о�� ���ڸ� "/"�� �������� �������ش�
	                rmsg = msg.split("/");

	                // JTextArea�� ���ŵ� �޼��� �߰�
	                // rmsg[0]�� id + rmgs[1]�� �о�� �޼��� + �ٹٲ�(enter)�� �������
	                msgOut.append(rmsg[0] + ">"+rmsg[1] + "\n");
	                
	                // ���� ��ȭ �޼����� ������
	                // �ؽ�Ʈ�� ���� ��ġ�� �����Ͽ� ȭ������� ��ũ�� ���·� ������ �� �ֵ��� ��
	                // �ռ� msgOut.append���� �޼����� �о���� �� getLength�� ���̸� Ȯ���ϰ�
	                // setCarePosition�� �̿��Ͽ� ��ġ�� ���� -> ��ũ�� ����
	                msgOut.setCaretPosition(msgOut.getDocument().getLength());
	            } catch(IOException e) {
	                // e.printStackTrace();
	                status = false;
	            }
	        }
	        
	        // ä�� ���α׷��� ����� �� �޼��� �߻�
	        System.out.println("[MultiChatClient]" + thread.getName() + "�����");
	    }

	    public static void main(String[] args) {
	    	// ""���� ip�ּҸ� �Ѱ� ������ ������ �� �ְ� �ϰ� �� Ŭ���̾�Ʈ�� ����� �� �ֵ��� ��
	        MultiChatClient mcc = new MultiChatClient("127.0.0.1");
	    }
	}
	
