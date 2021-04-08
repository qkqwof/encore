package servlet.controller;
/*
 * Controller를 생성하는 공장...
 */
public class HandlerMapping {
	private static HandlerMapping factory = new HandlerMapping();
	private HandlerMapping() {
		
	}
	public static HandlerMapping getInstance() {
		return factory;
	}
	
	//Component를 생성...command하는 기능...factory 본연의 역할
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("find.do")) {
			controller = new FindController();
		}else if(command.equals("register.do")) {
			
		}
		return controller;
	}
		
}
