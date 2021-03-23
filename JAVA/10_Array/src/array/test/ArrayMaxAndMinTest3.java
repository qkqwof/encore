package array.test;

/*
 * int 타비의 배열을 만든다...랜덤한 값의 정수를 집어 넣는다.
 * 여러 숫자들 중에서 가장 큰 수와 가장 작은 수를 찾아내는 알고리즘을 작성...
 */

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {
		
		int[] scores = {79,88,91,44,99,55,96};
		
		//최고값을 만들 변수를 만들고, 최솟값을 만들 변수를 만들어야 함
		//이런 공간은 local로 만들꺼여서 기본값도 있어야 함
		
		int min = scores[0];  //배열의 첫번째 값으로 기본값을 초기화한다....79
		int max = scores[0];  //79
		
		
//		  for(int i=1;i<scores.length;i++) {//0~6 
//				if(scores[i] < min) { 
//					min =scores[i]; 
//				} 
//				if(scores[i]>max) {
//					max = scores[i]; 
//					} 
//				}
//		 
		
		//Advanced For | ForEach ....."뭐가 어디에서 도는가?"
		for(int score : scores) {
			if(score<min) {
				min = score;
			}
			if(score>max) {
				max = score;
			}
		}
		
		System.out.println("최솟값: " + min);
		System.out.println("최댓값: " + max);

	}

}
