package Tool.logHandler;

import java.text.DateFormat;

import Tool.logHandler.controllers.toConsole;
import Tool.logHandler.controllers.toDb;
import Tool.logHandler.controllers.toFile;
import Tool.logHandler.models.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class handler {
	
	private static final toConsole toConsole = new toConsole();
	private static final toFile toFile = new toFile();
	private static final toDb toDb = new toDb();

	private static final Logger logger = LogManager.getLogger(handler.class);

	public void handle(Log lg) {
		logger.info("Date: " + DateFormat.getDateInstance(DateFormat.LONG).format(lg.getDate()));
		logger.info("type: " + lg.getType());
		logger.info("Message: " + lg.getMsg());
		logger.info("Severity: " + lg.getSeverity());
		logger.info("");
		
		
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

		logger.info("Invalid stdout value: " + lg.getType() + " only () allowed");
		
	}
}
