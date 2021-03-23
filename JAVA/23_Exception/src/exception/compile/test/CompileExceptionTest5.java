package exception.compile.test;
//1. try~catch    2.throws    3.main...
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class CompileExceptionTest5 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String path = "C:\\encore_PJY\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader ��ü�� ����..");
		try {
			fr = new FileReader(path);//stream
			
			System.out.println("2. FileReader�� ����� �̿��ؼ� ������ ������ �о�鿩��");
			fr.read();
			
		}finally {
			//��� ������ �ݵ�� ��ž���
			fr.close();//�� �ڵ尡 ����� �߿��ϴ�.
			}
}
}
