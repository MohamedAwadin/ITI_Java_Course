import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet{
	private String message;
	public void paint(Graphics g){

		message = getParameter("message");
		if(message == null){
			message = "Hello World";
		}
		g.drawString(message, 50 , 100);
	}

}
