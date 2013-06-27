
import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import java.util.*;
import java.text.*;

class simplethread implements Runnable {
	
	Thread t;
	simplethread()
	{
	t = new Thread(this);	
	//while(popup.EXIT_ON_CLOSE != 1)
	{t.start();}
	}
	
	
	@SuppressWarnings("deprecation")
	public void run()
	{
		
		
		try
		{
             
			int m,n,o;
		   
			BufferedImage screencapture = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			Date date = new Date();
			SimpleDateFormat dateformat = new SimpleDateFormat("HH-mm-ss");
			 m = date.getDate();
			 n = date.getMonth();
			 o = date.getYear();
			 o = o+1900;
			
			File dir = new File("C:/"+ login2.a + "/" + m + "-" + n + "-" + o );
		    //boolean isDirCreated = 
		    		dir.mkdirs();
			File file = new File("C:/"+ login2.a + "/" + m + "-" + n + "-" + o,dateformat.format(date)+ ".jpg");
			ImageIO.write(screencapture,"jpg", file);
			
		
			
		}
		
		catch(Exception e){
			
			
		}
		
		}
}		



class Screen2{

public static void main(String v[])throws AWTException, IOException , InterruptedException
{   
	int delay = 20000 ; // Delay 1000 = 1sec
	 while(true)
	
	{
	
		new simplethread();
	
		Thread.sleep(delay);
	
	}
	
	
}

}