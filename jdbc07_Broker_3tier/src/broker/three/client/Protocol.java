package broker.three.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.RecordNotFoundException;
import broker.three.shares.Command;
import broker.three.vo.CustomerRec;
import broker.three.vo.StockRec;


/*
 * Database와 거의 동일한 모양으로 작성된 모듈...즉 기능의 선언부가 동일하다..하지만 구현부는 전혀달라진다.
 * Client 사이드의 통신 알고리즘을 가지고 있는 클래스...
 */
public class Protocol {
	private Socket s;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	private Command cmd;
	
	public static final int MIDDLE_PORT = 60000;
	
	public Protocol(String serverIP) throws Exception{
		s = new Socket(serverIP, MIDDLE_PORT);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	
	public void close() {
		try {
			s.close();
		}catch(Exception e) {
			System.out.println("Protocol close()...error..."+e);
		}
	}//
	
	// 모든 메소드마다 공통적으로 반복되는 로직을 정의...
	public void writeCommand(Command cmd) {
		try {
			oos.writeObject(cmd);
			System.out.println("Client writeObject cmd...end");
		} catch (IOException e) {
			System.out.println("Client writeObject cmd...error"+e);
		}
	}
	
	public int getResponse() { //readObject() + getResult().getStatus()
		try {
			cmd = (Command)ois.readObject();
			
			System.out.println("Client readObject cmd...end");
		} catch (Exception e) {
			System.out.println("Client readObject cmd...error"+e);
		} 		
		// 0(성공) , (-2) DuplicateSSNException, (-1) RecordNotFoundException, (-3)InvalidTransactionException
		int status=cmd.getResults().getStatus();
		return status;
	}
	
	
	//Broker에서 2tier에서 Database 메소드를 호촐하고 있는데...코드 수정이 없기 위해서는 여기서 그 기능을 다 받아줘야 한다.
	public void addCustomer(CustomerRec cust) throws DuplicateSSNException {
		/*
		 * 1. 도시락 싼다...cmd 객세 생성
		 * 2. 싼 도시락 던진다...jury가 받는다.
		 * -----------------------------------
		 * 3. jury가 던진 도시락 다시 받는다.
		 * 4. 잘못된 경우(-) | 잘된경우(0)
		 */
		//도시락 싼다.
		cmd = new Command(Command.ADDCUSTOMER);
		String [ ] str = {cust.getSsn(), cust.getName(), cust.getAddress()};
		cmd.setArgs(str);
		
		//서버쪽으로 날린다.
		writeCommand(cmd);
		
		// blocking.... 서버가 던지는 도시락 다시 받을때까지(응답이 올때까지) 대기상태...
		int status=  getResponse();
		if(status==-2) throw new DuplicateSSNException();
	}
	
	public void deleteCustomer(String ssn) throws RecordNotFoundException {
		cmd = new Command(Command.DELETECUSTOMER);
		String[ ] str = {ssn};
		cmd.setArgs(str);
		
		writeCommand(cmd);
		
		/////////////////
		
		int status = getResponse();
		if(status==-1) throw new RecordNotFoundException();
	}
	
	public void updateCustomer(CustomerRec cust) throws RecordNotFoundException {
		
	}
	
	public CustomerRec getCustomer(String ssn) throws SQLException {
		
		return null;
	}
	
	public ArrayList<CustomerRec> getAllCustomers(){
		
		return null;
	}
	public ArrayList<StockRec> getAllStocks() {
		
		return null;
	}
	
	public void buyShares(String ssn, String symbol, int quantity) {
		
	}
	
	public void sellShares(String ssn, String symbol, int quantity) {
		
	}
}
























