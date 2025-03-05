import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Date;

public class AnimationBall extends Applet implements Runnable {
    Thread th;
    public static int x = 0;        
    public static boolean movingRight = true;  
    
    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        
        g.fillOval(x, getWidth()/2, 30, 30);
    }

    public void run() {
        while(true) {
            try {
                repaint();
                
                if (movingRight) {
                    x += 10;    
                } else {
                    x -= 10; 
                }
                
                
                if (x + 30 >= getWidth()) {
                    x = getWidth() - 30;    
                    movingRight = false;    
                }
                
                else if (x <= 0) {
                    x = 0;                 
                    movingRight = true;    
                }
                
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}