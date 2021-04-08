package servlet.controller;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		
	}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	//Component를 생성...command하는 기능...factory 본연의 역할
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("find")) {
			controller = new FindController();
		}else if(command.equals("register")) {
			
		}
		return controller;
	}
		
}
