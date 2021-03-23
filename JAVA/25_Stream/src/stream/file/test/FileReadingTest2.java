package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���Ͽ� �Էµ� ������ �о
 * �Ǵٸ� ���Ϸ� ����ϴ� ������ �ۼ�
 * ::
 * ��Ʈ��
 * �Է� 2�� -- FileReader, BufferedReader
 * ��� 2�� -- FileWriter, BufferedWriter
 * ::
 * 1.��Ʈ�� ����...4�� ����
 * 2.������ ������ �о
 * 3.�Ǵٸ� ���Ϸ� ���(Sink)
 */

public class FileReadingTest2 {

	public static void main(String[] args) throws IOException{
		//1.��Ʈ�� ���� --> �Է� 2��(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\reuslt.txt"));//src�ؿ� ��Ʈ���� ������ �� �� ���丮�� ������ �� ����� ���
		try {
			//2.while������ ������ ������ �а�
			String line = null;
			while((line=br.readLine())!=null){
				//3.�Ǵٸ� ���Ϸ� ���(Sink)...�� �κ��� ����
				bw.write(line);
				bw.newLine();//���� �� �� �پ� �а� �ѷ��� �Ǵµ� ���� ����� �����ϱ� �� �ڵ�� ���� ������ �Ѱ���
			}
			bw.flush();//auto flushing ���..�����͸� ��Ƶ��� ���� �ԷµǴ� ���� �ٷ� ����Ѵ�
		}finally {
			br.close();
			bw.close();
		}
	}
}
