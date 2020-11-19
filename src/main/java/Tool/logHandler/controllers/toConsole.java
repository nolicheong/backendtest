package Tool.logHandler.controllers;

import Tool.logHandler.models.Log;

public class toConsole {
	
	public void Write(Log lg) {
		System.out.println("Sending msg to console ...");
		System.out.println(lg.getMsg());
	}

}
