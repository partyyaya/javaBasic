package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class JFpainter extends JPanel implements MouseListener {
	private int x0,y0,x1,y1,x,y,w,h;
				
	public JFpainter(){
		setBackground(Color.CYAN);
		addMouseListener(this);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		//g2d.setColor(Color.black);		
		//g2d.drawLine(0, 0, 300, 300);//左上角為(0,0)
		
		g2d.setColor(Color.black);
		//g2d.drawLine(x0, y0, x1, y1);
		g2d.drawOval(x0, y0, Math.abs(x1-x0),Math.abs(y1-y0));
		System.out.println("paint");
		x0=y0=x1=y1=-1;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("click");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("press"+e.getX()+"x"+e.getY());
		x0=Math.abs(e.getX());y0=Math.abs(e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
		x1=Math.abs(e.getX());y1=Math.abs(e.getY());
		repaint();//重劃
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}

