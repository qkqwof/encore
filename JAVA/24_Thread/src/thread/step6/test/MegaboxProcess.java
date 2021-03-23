package thread.step6.test;

public class MegaboxProcess {

	public static void main(String[] args) {
		MagaboxUser user = new MagaboxUser();
		Thread user1 = new Thread(user, "¿øºó");
		Thread user2 = new Thread(user, "ÀÌ³ª¿µ");
		
		user1.start();
		user2.start();
	}

}
