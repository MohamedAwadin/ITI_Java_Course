import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Date;

public class AnimationBall extends Applet implements Runnable {
    Thread th;
    public static int x = 0;          
    public static int y = 0;          
    public static boolean movingRight = true;  
    public static boolean movingDown = true;   
    
    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        
        g.fillOval(x, y, 30, 30);
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
                
                
                if (movingDown) {
                    y += 10;    
                } else {
                    y -= 10;    
                }
                
                
                if (x + 30 >= getWidth()) {
                    x = getWidth() - 30;    
                    movingRight = false;    
                }
                
                else if (x <= 0) {
                    x = 0;
                    movingRight = true;     
                }
                
                
                if (y + 30 >= getHeight()) {
                    y = getHeight() - 30;   
                    movingDown = false;     
                }
                
                else if (y <= 0) {
                    y = 0;
                    movingDown = true;      
                }
                
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}