import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
		setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g) { 
		/*g.setColor(Color.RED);
		int x [] = {275,150,450}; 
		int y[]= {200, 300, 300};
		g.fillPolygon(x,y,3); */
		
		 int midX = 265;
		    int midY = 235;
		    int radius[] = {118,40,90,40};
		    int nPoints = 16;
		    int[] X = new int[nPoints];
		    int[] Y = new int[nPoints];

		    for (double current=0.0; current<nPoints; current++)
		    {
		        int i = (int) current;
		        double max = 7;
				double x = Math.cos(current*((2*Math.PI)/max))*radius[i % 4];
		        double y = Math.sin(current*((2*Math.PI)/max))*radius[i % 4];

		        X[i] = (int) x+midX;
		        Y[i] = (int) y+midY;
		    }

		    g.setColor(Color.WHITE);
		    g.fillPolygon(X, Y, nPoints);
		
		g.setColor(Color.lightGray);
		Font titleFont = new Font ("Castellar", Font.BOLD, 60); 
		g.setFont(titleFont);
		g.drawString(" SG", 200, 250);
		/*g.setColor(Color.RED);
		g.drawString(" This is a String ", 10, 50);
		
		g.drawLine(100,100, 100, 150); // x1, y1, x2, y2
		g.drawLine(150, 100, 150, 150);
		
		//mouth 
		g.fillArc(100, 200, 50, 50, 180, 180); */
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}
}
