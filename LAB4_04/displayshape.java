import java.applet.Applet;
import java.awt.*;

public class displayshape extends Applet {
    
    public void paint(Graphics g) {
        
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        
        // Top arc of the lamp shade
        int topArcX = 120, topArcY = 100, topArcWidth = 150, topArcHeight = 40;
        g.drawArc(topArcX, topArcY, topArcWidth, topArcHeight, 0, 180);
        g.setColor(Color.YELLOW);
        g.drawArc(topArcX, topArcY, topArcWidth, topArcHeight, 0, 180);
        g.setColor(Color.BLACK);

        // Bottom arc of the lamp shade
        int bottomArcX = 80, bottomArcY = 200, bottomArcWidth = 230, bottomArcHeight = 50;
        g.drawArc(bottomArcX, bottomArcY, bottomArcWidth, bottomArcHeight, 180, 180);

        // Side lines of the lamp shade
        g.drawLine(topArcX, topArcY + topArcHeight / 2, bottomArcX, bottomArcY + bottomArcHeight / 2);
        g.drawLine(topArcX + topArcWidth, topArcY + topArcHeight / 2, bottomArcX + bottomArcWidth, bottomArcY + bottomArcHeight / 2);

        // Lamp body color fill
        g.setColor(Color.YELLOW);
        // g.fillPolygon(
        //     new int[]{topArcX, bottomArcX, bottomArcX + bottomArcWidth, topArcX + topArcWidth}, 
        //     new int[]{topArcY + topArcHeight / 2, bottomArcY + bottomArcHeight / 2, bottomArcY + bottomArcHeight / 2, topArcY + topArcHeight / 2}, 
        //     4
        // );
        g.setColor(Color.BLACK);

        // Middle oval
        int midOvalX = 155, midOvalY = 130, midOvalWidth = 70, midOvalHeight = 90;
        g.drawOval(midOvalX, midOvalY, midOvalWidth, midOvalHeight);
        g.setColor(Color.YELLOW);
        g.fillOval(midOvalX, midOvalY, midOvalWidth, midOvalHeight);
        g.setColor(Color.BLACK);

        // Left oval
        int leftOvalX = 110, leftOvalY = 160, leftOvalWidth = 40, leftOvalHeight = 60;
        g.drawOval(leftOvalX, leftOvalY, leftOvalWidth, leftOvalHeight);
        g.setColor(Color.YELLOW);
        g.fillOval(leftOvalX, leftOvalY, leftOvalWidth, leftOvalHeight);
        g.setColor(Color.BLACK);

        // Right oval
        int rightOvalX = 230, rightOvalY = 160, rightOvalWidth = 40, rightOvalHeight = 60;
        g.drawOval(rightOvalX, rightOvalY, rightOvalWidth, rightOvalHeight);
        g.setColor(Color.YELLOW);
        g.fillOval(rightOvalX, rightOvalY, rightOvalWidth, rightOvalHeight);
        g.setColor(Color.BLACK);

        // Lamp stand
        int standX1 = 170, standY1 = 250, standX2 = 190, standY2 = 320;
        int standX3 = 220, standY3 = 250, standX4 = 200, standY4 = 320;
        g.drawLine(standX1, standY1, standX2, standY2);
        g.drawLine(standX3, standY3, standX4, standY4);

        // Lamp base
        int baseX = 140, baseY = 320, baseWidth = 120, baseHeight = 20;
        g.drawRect(baseX, baseY, baseWidth, baseHeight);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(baseX, baseY, baseWidth, baseHeight);
    }
}
