package exception.compile.test;
import java.io.FileInputStream;
/*
 * 1. ���ܶ�� ���� �ſ� �پ��� ��Ȳ���� �߻��� �� ����
 * �̷� �� ��� ���ܸ� Exception ���� Ŭ���� �ϳ��� ó���ϴ� ���� �״��� ���� ����� �ƴ�
 * ---> ������� ����ȭ �ϴ� ���� ����.
 * ---> �������� ī�װ��� ���ܴ� �Ѱ����� �����ִ� �͵� ����
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CompileExceptionTest6 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try {
			Class.forName("exception.compile.test.CompileExceptionTest6");
			new FileInputStream("Hello");
			DriverManager.getConnection("aaa");
		}catch(ClassNotFoundException e) {
			System.out.printf("�ش� Ŭ������ ã�� ���� �����ϴ�...: %s%n", e.getMessage());
		}catch(FileNotFoundException | SQLException e) {
			System.out.printf("�ش��ϴ� ���ҽ��� �����ϴ�: %s%n",e.getMessage());
		}
		System.out.println("���α׷� ��������");
}
}
