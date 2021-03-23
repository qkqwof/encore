package stream.data.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * scores.dat파일의 내용을 readInt()로 읽어들여서
 * 각각의 점수를 출력하고
 * 모든 점수의 총합을 구하는 로직을 작성...
 * EOFException은 컴파일 시점에 잡혀지지 않고
 * 실행시점에서 잡혀지기 때문에
 * main메소드 선언부에서 throws로 던져질 수 없음
 * ---------------------------------------
 * main메소드 선언부에서 throws로 예외를 던져서
 * main을 호출한 곳(JVM)에서 예외를 처리할 수 있는 것은
 * Compile Exception계열 만이 가능
 * 
 */

public class DataOutputStreamTest4 {

	public static void main(String[] args){
		int sum = 0;
		int score = 0;
		DataInputStream dis = null;
		//1.스트림 생성
		try {
			dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
			System.out.println("Stream Creating...");
			
			while(true){
				score = dis.readInt();
				System.out.println(score);//각각의 점수는 여기서 출력된다...
				sum += score;
			}
		}catch(EOFException e) {
			System.out.println("모든 점수의 총합은 " + sum + "점!!");
		}catch(IOException e) {
			
	    }finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//
	}

}
