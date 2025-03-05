import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date ; 
import java.awt.Dimension ;

public class DateTimeApp extends Applet implements Runnable{
	Thread th;
	
	public void init()
	{
		th = new Thread(this);
		th.start();
	}

	public void paint(Graphics g)
	{
		Date d = new Date();
		g.drawString(d.toString(),getHeight()/2, getWidth()/2);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				repaint();
				Thread .sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}




	}

}
