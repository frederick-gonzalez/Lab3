import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                      //Draw a second border
//                        g.setColor(Color.CYAN);
//                      //Draw 2 lines
//                        g.drawRect(x1+3, y1+3, width-6, height-6);
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.MAGENTA);
//                        g.drawLine(x2, y1, x1, y2);
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(getWidth()/2-55/2, getHeight()/2-55/2, 55, 55);
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        //Draw Stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+36, width, 36);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+108, width, 36);
                        //Draw blue triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1+150, y1+90);
                        p3.addPoint(x1, y1+180);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        //Draw Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 30, y1 + 78);
                        p2.addPoint(x1 + 46, y1 + 78);
                        p2.addPoint(x1 + 52, y1 + 63);
                        p2.addPoint(x1 + 58, y1 + 78);
                        p2.addPoint(x1 + 74, y1 + 78);
                        p2.addPoint(x1 + 61, y1 + 88);
                        p2.addPoint(x1 + 66, y1 + 103);
                        p2.addPoint(x1 + 53, y1 + 93);
                        p2.addPoint(x1 + 39, y1 + 103);
                        p2.addPoint(x1 + 43, y1 + 88);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);                   
                        
            }
}