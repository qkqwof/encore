package poly.test;

/*
 * Singletone Pattern
 * �ϳ��� Ŭ�����κ��� �ϳ��� ��ü�� �����ϵ��� �ϴ� ����
 * 1. Ŭ���� �ȿ��� �ϴ� ��ü �ϳ��� ����
 *    private static ��ü�� ����
 * 2. �ٸ� ������(�ٸ� Ŭ����)�� ��ü ������ ���� ���ϵ��� ���Ƶд�
 * 	  private ������(){}
 * 3. �������� �ϳ��� ��ü�� ��𼭵��� ������ �� �� �ֵ��� public�� �޼ҵ带 ������
 * -------------------------------------------------------------------
 */

class EncoreCompany{
	private String companyName;
	
	//1. static private���� ��ü ����
	static private EncoreCompany encore = new EncoreCompany();
	
	//2. �ٸ� �������� ��ü���� ����
	private EncoreCompany() {
		companyName = "Encore";
		System.out.println("Company Name..." + companyName);
	}
	
	//3. ����� ���� ��ü�� �ٸ� ������ ������ �� �� �յ��� ����� �ϳ� �������´�...public static����...!!
	public static EncoreCompany getCompany() {
		return encore;
	}
}

public class SingletoneTest {

	public static void main(String[] args) {
//		EncoreCompany a = new EncoreCompany();
		EncoreCompany encore1 = EncoreCompany.getCompany();
		EncoreCompany encore2 = EncoreCompany.getCompany();
		EncoreCompany encore3 = EncoreCompany.getCompany();
		
		
		System.out.println(encore1.toString());
		System.out.println(encore2.toString());
		System.out.println(encore3.toString());
	}

}
