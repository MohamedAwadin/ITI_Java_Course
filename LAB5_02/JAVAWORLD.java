import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Date;

public class JAVAWORLD extends Applet implements Runnable {
    Thread th;
    public static int x = 0;          
    
    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);

        g.drawString("Hello Awadin", x, getHeight()/2);
    }

    public void run() {
        while(true) {
            try {
                repaint();
                
                
                x += 10;
                
                
                
                
                
                if (x >= getWidth()) {
                    
                    x = 0;
                }
                
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}