package stream.object.step2.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfoObjectOutputTest2 {

	public static void main(String[] args) throws Exception{
		String fileName = "src\\userInfo.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		UserInfo user1 = new UserInfo("��ȣ��",48,"java123");
		UserInfo user2 = new UserInfo();
		UserInfo user3 = new UserInfo("�̼���",45,"lee444");
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		//����ȭ
//		oos.writeObject(user1);
//		oos.writeObject(user2);
//		oos.writeObject(user3);

		oos.close();
		System.out.println("����ȭ �۾��� ���½��ϴ�...");
	}

}
