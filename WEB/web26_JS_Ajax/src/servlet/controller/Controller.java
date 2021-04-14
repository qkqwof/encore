package servlet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException;//정하기 나음
	//화면 연결하기 위해 인자값에 request와 response를 받는다.
}
