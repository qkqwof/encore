    package exam.test;

/*
 * static�� Ű���� ����
 * 1. ��ü���� ���� ���� �޸𸮿� �ö󰣴�.
 * 2. ��ü���� ���� �ξ� ������...Class File Loader��������...�̶� �޸� �ö󰣴�.
 * 	  JVM(STACK | HEAP ---> new Ű����� ������ ��ü��| ....Class Area[static�� �������� ���])
 * 3. static�� ������ �ʵ�� ������ ��ü�鿡�� ���� �����Ѵ�.!!!
 * 
 * 4. static�� static���� ���Ѵ�.
 * 5. static ��� �ȿ����� this��� ���Ѵ�.
 * 6. static�� final�� ������ ���� �Բ� ����Ѵ�.
 *    ex) ����� ����  static final int BASIC_SALARY=1000;
 * 7. static intitializtion block
 * 8. �̱��� ����
 */

class Member{
	//�ʵ� ������ static ������ ����(local level�δ� ����� �� ����.)
	static String  name = "ȫ�浿";
	static int age = 22;
	int count = 1;//�ʵ�
	
	//staticblock
	public static void getMember() {//static block
		System.out.println("��/��/��/��/ " + name);//static variable
		//System.out.println("��/��/��/��/ " + count);
	}
	
	//non-static block
	public void getMember2() {//static block
		System.out.println("��/��/��/��/ " + name);//static variable
		
	}
	
}
public class StaticExamTest {

	public static void main(String[] args) {
		//static�� ������ ����� �ٷ� �����ؼ� ����� �� �ִ�...Class�̸�.static�޼ҵ�
		Member.getMember();
		
		//
		Member m = new Member();
		m.getMember();
		m.getMember2();

	}

}
