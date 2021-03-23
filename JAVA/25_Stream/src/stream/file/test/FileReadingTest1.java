package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���Ͽ� �Էµ� ������ �о
 * �ܼ�â���� ����ϴ� ������ �ۼ�
 * ::
 * ��Ʈ��
 * �Է� 2�� -- FileReader, BufferedReader
 */

public class FileReadingTest1 {

	public static void main(String[] args) throws IOException{
		//1.��Ʈ�� ���� --> �Է� 2��(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		try {
			//2.while������ ������ ������ �а�
			String line = null;
			while((line=br.readLine())!=null){
				//3.�ַܼ� ����ϱ�
				System.out.println(line);
			}
		}finally {
			br.close();
		}
	}
}
