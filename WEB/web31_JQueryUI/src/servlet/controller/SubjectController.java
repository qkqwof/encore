package servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubjectController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("SubjectComponent...진입...");
		//비지니스 로직....엔코아 주요 과목..이수과목을 디비에서 꺼내온다..돌아갔다 치고
		
		String result = "Big Data | Machine Learning | DeepLearning | Python | Restful API Servicve | Vue CLI";
		
		request.setAttribute("result", result);
		
		return new ModelAndView("Result.jsp");//forwarding방식으로 이동..
	}

}
