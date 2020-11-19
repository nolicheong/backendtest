package Tool.logHandler.controllers;

import Tool.logHandler.models.Log;

public class toDb {
	
	public void Write(Log lg) {
		System.out.println("Sending msg to DB ...");
		System.out.println(lg.getMsg());
	}

}
