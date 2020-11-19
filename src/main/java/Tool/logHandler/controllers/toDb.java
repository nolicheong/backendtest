package Tool.logHandler.controllers;

import Tool.logHandler.models.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class toDb {
	private static final Logger logger = LogManager.getLogger(toDb.class);
	public void Write(Log lg) {
		logger.info("Sending msg to DB ...");
		logger.info(lg.getMsg());

	}

}
