package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * hope.txt������ ���� �����͸� �о ---- FileReader Character�迭 ���
 * �ٸ� ����� result.txt���Ϸ� ���� �����͸� ���...fileWriter Character�迭 ���
 * ::
 * ��Ʈ�� �ڵ� �ۼ� ����
 * 1.�Է�, ��� ��Ʈ���� �Ѳ����� ����
 * 
 * 2.�ݺ��� �ȿ��� �����͸� ���� �� �о
 * 
 * 3.�ݺ��� �ȿ��� �о���� �����͸� Sink �������� ���δ� ���
 *   --> ���� �����͸� ����� ���� �о���̴� ���� ������� �ʰ�
 *   	 ��������ŭ ��Ƶξ��ٰ� �Ѳ����� ����ϴ� ������ ����
 *   	 1)auto flush��� --- flush()
 *   	 2)�ڿ��� ���� �� �� �ȿ� �ִ� �����͸� �Ѳ����� ��� --- close()
 */
class FileReadWriterPreview{
	FileReadWriterPreview() throws IOException{
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
		//������ ���⿡�ٰ� �ۼ�...1-->2-->3
		br = new BufferedReader(new FileReader("src\\hope.txt"));
		//���丮�� �����ؾ����� ��½�Ʈ���� ����...�� �ȿ� ������ϵ� ���������.
		pw = new PrintWriter("C:\\data\\result.txt");
		System.out.println("1.Stream Creating...");
		
		String line = null;
		System.out.println("2.FileReading and Printing...");
		while((line = br.readLine())!=null) pw.println(line);
		}finally {
			br.close();
			pw.close();
		}
	}
}

public class FileReadWriterPreviewTest4 {

	public static void main(String[] args) throws IOException{
		new FileReadWriterPreview();

	}

}
