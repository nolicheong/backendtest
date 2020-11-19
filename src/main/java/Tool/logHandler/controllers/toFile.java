package Tool.logHandler.controllers;

// import java.util.logging.Logger;

import Tool.logHandler.models.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class toFile {
	
	// private static Logger logger;
	
	public void Write(Log lg) {
//		FileHandler fh = new FileHandler("/logFile.txt");
//		
//		File logFile = new File("/logFile.txt");
//        if (!logFile.exists()) {
//            try {
//				logFile.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        }
//        
//        logger.addHandler(fh);
//        logger.log(Level.INFO, lg.getMsg());
		
		try {
		      File myObj = new File("logs.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		try {
		      FileWriter myWriter = new FileWriter("logs.txt");
		      PrintWriter printWriter = new PrintWriter(myWriter);
		      
		      printWriter.print("");
		      printWriter.printf(lg.getDate().toString()+"("+lg.getSeverity()+")" + lg.getMsg());
		      printWriter.close();
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
        
	}

}