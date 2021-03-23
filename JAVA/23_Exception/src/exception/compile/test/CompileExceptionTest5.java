package exception.compile.test;
//1. try~catch    2.throws    3.main...
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class CompileExceptionTest5 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String path = "C:\\encore_PJY\\util\\poem.txt";
		FileReader fr = null;
		
		System.out.println("1. FileReader 객체를 생성..");
		try {
			fr = new FileReader(path);//stream
			
			System.out.println("2. FileReader의 기능을 이용해서 파일의 내용을 읽어들여봄");
			fr.read();
			
		}finally {
			//열어서 썼으면 반드시 잠궈야함
			fr.close();//이 코드가 상당히 중요하다.
			}
}
}
