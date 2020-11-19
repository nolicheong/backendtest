package Tool.logHandler;

import java.util.Date;

import Tool.logHandler.controllers.toFile;
import Tool.logHandler.models.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	
	
	private static final handler handler = new handler();

    private static final Logger logger = LogManager.getLogger(App.class);
	  
	public static void main( String[] args )
    {
     
        if (args.length == 3) {
    	   Log inLog = new Log();
           inLog.setMsg(args[0]);
           inLog.setType(args[1]);
           inLog.setSeverity(args[2]);
           inLog.setDate(new Date());
    	   handler.handle(inLog);
    	   
       } else {
            logger.info("Missing params: (msg stdout(console, file, db) severity");
       }
        
    }

}
