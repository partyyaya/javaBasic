package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class JFpinter3 extends JPanel {
	private int x0,y0, x1, y1, x, y, w, h;
	
	public JFpinter3(){
		setBackground(Color.GREEN);
		addMouseListener(new MouseAdapter() {//匿名內部類別
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				x0 = e.getX(); y0 = e.getY();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				x1 = e.getX(); y1 = e.getY();
				int r = Math.abs(x0-x1); 
				w = h = 2*r;
				x = x0 - r;
				y = y0 - r;
				repaint();
			}
		});
		x0 = y0 = x1 = y1 = -1;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.RED);
		g2d.drawLine(x0, y0, x1, y1);
		//g2d.drawOval(x, y, w, h);
	}
}

