package thread.step6.test;

public class MegaboxProcess {

	public static void main(String[] args) {
		MagaboxUser user = new MagaboxUser();
		Thread user1 = new Thread(user, "����");
		Thread user2 = new Thread(user, "�̳���");
		
		user1.start();
		user2.start();
	}

}
