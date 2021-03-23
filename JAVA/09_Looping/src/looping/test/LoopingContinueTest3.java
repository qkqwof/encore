package looping.test;

/*
 * 1~100까지 숫자 중에서 홀수의 합을 출력...하는 로직을 작성
 * 1) 먼저 1~100까지 합을 출력
 * 2) 1)번 중에서 홀수의 값만 합해나간다...continue 사용
 */

public class LoopingContinueTest3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<=100;i++) {
			if(i%2 == 0) continue; // continue ->  1. 지금 조건은 아래 code를 건너뛰고 
								   //              2. 반복을 계속하라.(강조)                 홀수 일 때만 밑부분 실행
			sum += i;
			
		}
		System.out.println("1부터 100까지의 홀수값의 합" + sum);
	}

}
