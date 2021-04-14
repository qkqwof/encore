package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

public class FindController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		String path = "find_fail.jsp";
		
		try {
			MemberVO rvo=MemberDAOImpl.getInstance().findByIdMember(id);
			if(rvo!=null) {
				request.setAttribute("vo", rvo);
				path = "find_ok.jsp";
			}
		}catch(SQLException e) {
			
		}
		return new ModelAndView(path);
	}

}
