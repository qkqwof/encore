package pattern.action;

public class AddController implements Controller{

	@Override
	public String requestHandle() {
		System.out.println("AddController...register logic...");
		
		/*
		 * 1. 폼값 받아서
		 * 2. VO객체 생성
		 * 3. DAO리턴 받아서
		 * 4. 비즈니스 로직 호출
		 * 5. 바인딩
		 * 6. path리턴
		 */
		return "add_result.jsp";
	}

}
