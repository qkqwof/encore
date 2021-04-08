package pattern.factory;

import pattern.action.AddController;
import pattern.action.Controller;
import pattern.action.DeleteController;
import pattern.action.UpdateController;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		System.out.println("ControllerFactory...Creating...");
	}
	
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	//Controller를 생성하는 기능
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("insert")) {
			controller = new AddController();
			System.out.println("AddController...생성");
		}else if(command.equals("update")) {
			controller = new UpdateController();
			System.out.println("UpdateController...생성");
		}else if(command.equals("delete")) {
			controller = new DeleteController();
			System.out.println("DeleteController...생성");
		}
		return controller;
	}
}
