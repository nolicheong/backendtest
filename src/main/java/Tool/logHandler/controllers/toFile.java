package Tool.logHandler.controllers;

import Tool.logHandler.models.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class toFile {

	private static final Logger logger = LogManager.getLogger(toFile.class);
	
	public void Write(Log lg) {

		try {
		      File myObj = new File("logs.txt");
		      if (myObj.createNewFile()) {
				  logger.info("File created: " + myObj.getName());
		      } else {
				  logger.info("File already exists.");
		      }
		    } catch (IOException e) {
			logger.info("An error occurred.");
		      e.printStackTrace();
		    }
		
		try {
		      FileWriter myWriter = new FileWriter("logs.txt");
		      PrintWriter printWriter = new PrintWriter(myWriter);
		      
		      printWriter.print("");
		      printWriter.printf(lg.getDate().toString()+"("+lg.getSeverity()+")" + lg.getMsg());
		      printWriter.close();
		      myWriter.close();
			logger.info("Successfully wrote to the file.");
		    } catch (IOException e) {
			logger.info("An error occurred.");
		      e.printStackTrace();
		    }
        
	}

}