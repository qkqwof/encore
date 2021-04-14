package servlet.controller;
/*
 * Controller를 생성하는 공장...
 */
public class HandlerMapping {
	private static HandlerMapping factory = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return factory;
	}
	
	//Component를 생성....command 하는 기능....factory본연의 역할
	public  Controller  createController(String command) {
		Controller controller = null;
		if(command.equals("find.do")) {
			controller = new FindController();
		}else if(command.equals("register.do")) {
			controller = new RegisterController();
		}else if(command.equals("login.do")) {
			controller = new LoginController();
		}else if(command.equals("update.do")) {
			controller = new UpdateController();
		}else if(command.equals("allmember.do")) {
			controller = new AllMemberController();
		}else if(command.equals("idList.do")) {
			controller = new IdListController();
		}else if(command.equals("idCheck.do")) {
			controller = new IdCheckController();
		}
		return controller;
	}
	
}
