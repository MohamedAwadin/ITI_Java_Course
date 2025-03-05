import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Date;




public class AnimationBall extends Applet implements Runnable {
    Thread th;
    
    public static int x1 = 0;          
    public static int y1 = 0;          
    public static boolean movingRight1 = true;  
    public static boolean movingDown1 = true;   
    
    
    public static int x2 = 100;        
    public static int y2 = 100;        
    public static boolean movingRight2 = false; 
    public static boolean movingDown2 = false;  
    
    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        
        g.setColor(Color.RED);
        g.fillOval(x1, y1, 30, 30);
        
        
        g.setColor(Color.BLUE);
        g.fillOval(x2, y2, 30, 30);
    }

    public void run() {
        while(true) {
            try {
                repaint();
                
                //Ball_1
                if (movingRight1)
                {
                    x1 += 10;
                } 
                else
                {
                    x1 -= 10;
                } 
                if (movingDown1)
                {
                    y1 += 10;
                } 
                else
                {
                    y1 -= 10;
                } 
                
                // Ball_2
                if (movingRight2)
                {
                    x2 += 10;
                } 
                else
                {
                    x2 -= 10;
                } 
                if (movingDown2)
                {
                    y2 += 10;
                } 
                else
                {
                    y2 -= 10;
                } 
                
                
                if (x1 + 30 >= getWidth()) {
                    x1 = getWidth() - 30;
                    movingRight1 = false;
                } 
                else if (x1 <= 0) {
                    x1 = 0;
                    movingRight1 = true;
                }
                if (y1 + 30 >= getHeight()) 
                {
                    y1 = getHeight() - 30;
                    movingDown1 = false;
                } 
                else if (y1 <= 0) 
                {
                    y1 = 0;
                    movingDown1 = true;
                }
                
                
                if (x2 + 30 >= getWidth()) 
                {
                    x2 = getWidth() - 30;
                    movingRight2 = false;
                } 
                else if (x2 <= 0) {
                    x2 = 0;
                    movingRight2 = true;
                }
                if (y2 + 30 >= getHeight()) 
                {
                    y2 = getHeight() - 30;
                    movingDown2 = false;
                } 
                else if (y2 <= 0) {
                    y2 = 0;
                    movingDown2 = true;
                }
                
                
                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                
                if (distance < 30) { 
                    
                    boolean tempRight = movingRight1;
                    boolean tempDown = movingDown1;
                    movingRight1 = movingRight2;
                    movingDown1 = movingDown2;
                    movingRight2 = tempRight;
                    movingDown2 = tempDown;
                }
                
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}