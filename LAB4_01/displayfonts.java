import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Toolkit;

public class displayfonts extends Applet{
	
	public void paint(Graphics g){

		
		Toolkit t= Toolkit.getDefaultToolkit();
		String[] s = t.getFontList();
		int i=20;
		for(String str : s){
			System.out.println(str);
			g.drawString(str, 50, i);
			i+=20;
		}
		
	}

}
