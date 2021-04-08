package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 1. 폼값 받는다. getParameter()
 * 2. 받은 값을 가지고 객체를 생성
 * 3. Servletcontext를 반환 받는다...ServletConfig의 getServletContext()
 * 	  Servletcontext에 바인딩...setAttribute
 * 4. 바인딩된 정보를 다음 서블릿이 가져다 쓸 수 있도록 페이지 연결
 */

@WebServlet("/Writing")
public class WriteContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //필드 추가
	private HashMap<String,String> userList;
	private ServletContext cont;
	
    public WriteContext() {
       
    }

	@Override
		public void init() throws ServletException {
			System.out.println("init() call...");
			//2. userList에 담는다.(vo객체가 없어서 map에 담는다.)
			cont = getServletContext();//servletConfig가 상속해줬다..그냥 호출해서 사용하면 됌.
			System.out.println("Writing ServletContext...return..."+cont.getContextPath());
			System.out.println("Writing ServletContext...return..."+cont);
			userList =new HashMap<String,String>(); 
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//1. 폼 값 받는다.
		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userName = request.getParameter("userName");
		
		//2. userList에 담는다.(vo객체가 없어서 map에 담는다.)
		userList.put("userId", userId);
		userList.put("userPass", userPass);
		userList.put("userName", userName);
		
		//바인딩
		cont.setAttribute("userList", userList);
		
		PrintWriter out = response.getWriter();		
		out.println("<html><body bgcolor='pink'>");
		out.println("<b>======Data Writing.... ServletContext======<br>");
		out.println("사용자의 정보가 등록되었습니다.....</b><br><br>");
		
		//다음 서블릿으로 연결
		out.println("<a href=Reading>접속자 명단 보기</a>");
		out.println("</body></html>");
		out.close();
	}
}
