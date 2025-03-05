import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Color;
public class displayfonts extends Applet {
    
    public Font font;
    public String[] FontList ;
	public Color color_font = Color.BLUE;

    public void init() {
        Toolkit t = Toolkit.getDefaultToolkit();
        FontList = t.getFontList();
	}
    

    public void paint(Graphics g) {
        for (int i = 0; i < FontList.length; i++) {
			font = new Font(FontList[i], Font.BOLD, 12);
			g.setFont(font);
			g.setColor(color_font);
            g.drawString(FontList[i], 20, 20+i*10);
        }
    }
}