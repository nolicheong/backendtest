package Tool.logHandler;

import java.text.DateFormat;

import Tool.logHandler.controllers.toConsole;
import Tool.logHandler.controllers.toDb;
import Tool.logHandler.controllers.toFile;
import Tool.logHandler.models.Log;

public class handler {
	
	private static final toConsole toConsole = new toConsole();
	private static final toFile toFile = new toFile();
	private static final toDb toDb = new toDb();

	public void handler(Log lg) {
		System.out.println("Date: " + DateFormat.getDateInstance(DateFormat.LONG).format(lg.getDate()));
		System.out.println("type: " + lg.getType());
		System.out.println("Message: " + lg.getMsg());
		System.out.println("Severity: " + lg.getSeverity());
		System.out.println("");
		
		
		if ("console".equalsIgnoreCase(lg.getType()) ) {
			toConsole.Write(lg);
			return;
		}
		
		if ("file".equalsIgnoreCase(lg.getType())) {
			toFile.Write(lg);
			return;
		}
		
		if ("db".equalsIgnoreCase(lg.getType())) {
			toDb.Write(lg);
			return;
		}
		
		System.out.println("Invalid stdout value: " + lg.getType() + " only () allowed");
		
	}
}
