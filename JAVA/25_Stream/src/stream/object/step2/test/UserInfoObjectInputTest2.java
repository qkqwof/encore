package stream.object.step2.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserInfoObjectInputTest2 {

	public static void main(String[] args) throws Exception{
		String fileName = "src\\userInfo.ser";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		
		UserInfo user1 = (UserInfo)ois.readObject();
		UserInfo user2 = (UserInfo)ois.readObject();
		UserInfo user3 = (UserInfo)ois.readObject();
		////////////////////////////////////////////
		ArrayList<UserInfo> list = (ArrayList)ois.readObject();
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(list);
		
		
		
	}

}
