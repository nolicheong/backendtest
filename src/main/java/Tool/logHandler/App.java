package Tool.logHandler;

import java.util.Date;

import Tool.logHandler.models.Log;


public class App 
{
	
	
	private static final handler handler = new handler();
	  
	public static void main( String[] args )
    {
     
        if (args.length == 3) {
    	   Log inLog = new Log();
           inLog.setMsg(args[0]);
           inLog.setType(args[1]);
           inLog.setSeverity(args[2]);
           inLog.setDate(new Date());
    	   handler.handler(inLog);
    	   
       } else {
    	   System.out.println("Missing params: (msg stdout(console, file, db) severity");
       }
        
    }

}
