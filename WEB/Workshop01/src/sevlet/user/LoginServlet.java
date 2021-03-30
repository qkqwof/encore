package sevlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//2. 받은 값을 다시 웹브라우저로 전송해서 출력
		//서버 설정을 먼저 변경 -> 그런 다음에 서버를 plugin
		//request.setCharacterEncoding("UTF-8");//이 부분이 지금 적용 안된다.(get방식이여서 소용없음...서버에 처리한다..)
		response.setContentType("text/html;charset=utf-8");//위치가 PrintWriter 응답받기 전에 해줘야 한다.
		PrintWriter out = response.getWriter();
		
		//1. 폼에 입력된 값 받아서
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		out.println("<html><body>");
		out.println("<h3><b>" + id + "</b>님이 로그인 되었습니다!!! </h3>");
		out.println("<a href='#'>도서 등록</a><br>");
		out.println("<a href='#'>로그 아웃</a>");
		out.println("</body></html>");
		out.close();
	}

}
