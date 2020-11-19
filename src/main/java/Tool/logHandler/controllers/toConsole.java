package Tool.logHandler.controllers;

import Tool.logHandler.models.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class toConsole {
	private static final Logger logger = LogManager.getLogger(toConsole.class);
	public void Write(Log lg) {
		logger.info("Sending msg to console ...");
		logger.info(lg.getMsg());
	}

}
