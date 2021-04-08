package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberVO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//클라이언트가 요청하는 순간 세션이 만들어진다...우리는 이걸 받아서 사용하면 된다.
		HttpSession session = request.getSession();
		
		//클라이언트를 구분하는 값도 함께 생성....JSESSIONID값
		out.println("JSESSIONID :: "+session.getId()+"<br>");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//위 값을 비즈니스 로직에 넣어서 호출...MemberVO vo=login(id,pass);
		MemberVO rvo = new MemberVO(id,password,"홀길동","여의도");
		
		session.setAttribute("vo", rvo);
		
		out.println("<hr>");
		out.println("<a href=ProductServlet>ProductServlet이동...두번쨰 다시 요청하는 서블릿...</a>");
		
		
	}

}
