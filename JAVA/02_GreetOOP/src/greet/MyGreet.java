  package greet;

//
/* 
 * MyGreetŬ������ 
 * �λ縻�� �ܼ�â���� ����ϴ� ����� ������ �ִ� Ŭ����...
 */
public class MyGreet {
	public String message = "�ȳ��ϼ���^^";        //field ���� �� �ʱ�ȭ    //����(�ʵ�) - ���� ����Ǵ� ����
	                                            
	public void sayHello(String name) {         //method ���� = �޼��� ����� + �޼��� ������  // *method worker
		System.out.println(message + ", " + name);//�޼���� calling �ؾ����� working  // *calling
	}  // test�� �ٽ� ���ư� 	
}
// ���� �޼��尡 ��� �����ϸ� ��
// sayH�����Ű�� �� -> �޼��� ���� ��Ű�� �� -> �ٸ� Ŭ�������� �ؾ� ��
// worker�� ������ ���߿��ϰ� calling�� ������� ��µ�.