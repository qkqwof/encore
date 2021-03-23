package com.encore.javadoc;

//Single Comment
//

//Multi Line Comment
/*
 * 
 */

/**
 * 
 * @author Park Jae Young(이름 달기)
 * @since JDK 1.8.0_241(작성한 코드의 버전 달기)
 * @version [소스코드 버전 정보]... Source Code Version Level1
 * 
 */

public class JavaComment {
	/**
	 * 엔코아 아카데미에서 수강하는 학생의 이름
	 * 
	 */
	public String name;
	/**
	 * 엔코아 아카데미에서 수강하는 학생의 아이디
	 */
	public int stuId;
	
	//void 아닐 때, return 키워드 나와야 함
	/**
	 * 
	 * @param java test score
	 * @param python test score
	 * @return 자바와 파이썬 성적의 합산으로 학생의 최종성적을 반환
	 */
	public int scoreSum(int java, int python) {
		return java + python;
		
	}
}
//주석은 테스트 클래스에 다는 것 아님.

//(한글 인코딩) -> -encoding euc-kr -charset euc-kr -docencoing euc-kr
//자기가 짠 코드를 팀동료에게 쥐어줌.(내가 이해했지만 남이 이해 못할 수도 있어서...)
