package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * 파일에 입력된 내용을 읽어서
 * 또다른 파일로 출력하는 로직을 작성
 * ::
 * 스트림
 * 입력 2개 -- FileReader, BufferedReader
 * 출력 2개 -- FileWriter, BufferedWriter
 * ::
 * 1.스트림 생성...4개 생성
 * 2.파일의 내용을 읽어서
 * 3.또다른 파일로 출력(Sink)
 */

public class FileReadingTest3 {

	public static void main(String[] args) throws IOException{
		//1.스트림 생성 --> 입력 2개(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\reuslt.txt",true));//src밑에 스트림이 생성이 될 때 디렉토리가 생성될 때 만들고 출력
		// 끝에 true--> 이어쓰기
		//PrintWriter pw = new PrintWriter("src\\reuslt.txt");
		try {
			//2.while문에서 파일의 내용을 읽고
			String line = null;
			while((line=br.readLine())!=null){
				//3.또다른 파일로 출력(Sink)...이 부분이 변경
				pw.println(line);
			}
			//bw.flush();//auto flushing 기능..데이터를 모아두지 말고 입력되는 족족 바로 출력한다
		}finally {
			br.close();
			pw.close();
		}
	}
}
