package access.parent;

/*
 * Access Modifier�� ���������� �˾ƺ��� ������ �ۼ�.
 * ������ �ʵ忡 ���� �ٸ� ���� �����ڸ� ����...
 * �ڽ� Ŭ�������� �ش� �ʵ忡 ��� �����ϴ����� Ȯ���� ������ �Ѵ�.
 */

public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = "protectedTest";
	String defaultTest = "defaultTest";
	private String privateTest = "privateTest";
	
	//�ϳ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����Ѵ�.
	//�̋� ���� ���� ����� �����ڸ� �־��ָ� �׋��� �⺻ �����ڰ� �ڵ������� �������� �ʴ´�.
	//�׷��� ���࿡ �⺻ �����ڰ� �ݵ�� �ʿ��� ����� �� ��������� �⺻�����ڸ� �ڵ�� �ۼ��ؾ� �Ѵ�.
	//public Parent(){}
	
	public void access() {
		System.out.println("Access Modifier Test....");
	}
}
