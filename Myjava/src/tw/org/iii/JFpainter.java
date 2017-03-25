package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class JFpainter extends JPanel 
	//implements MouseListener
	{
	private int x0,y0, x1, y1, x, y, w, h;
	private MyMouseAdapter myMouseAdapter;
	
	public JFpainter(){
		setBackground(Color.yellow);
		//addMouseListener(this);
		myMouseAdapter = new MyMouseAdapter(this);
		addMouseListener(myMouseAdapter);
		x0 = y0 = x1 = y1 = -1;
		
	}
	
	void setX0(int x0){this.x0=x0;}
	void setY0(int y0){this.y0=y0;}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.RED);
		g2d.drawLine(x0, y0, x1, y1);
		//g2d.drawOval(x, y, w, h);
	}

	void changeLine(int x1, int y1){
		this.x1 = x1; this.y1 = y1;
		int r = Math.abs(x0-this.x1); 
		w = h = 2*r;
		x = x0 - r;
		y = y0 - r;
		repaint();

	}
	
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("Clicked");
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		x0 = e.getX(); y0 = e.getY();
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		x1 = e.getX(); y1 = e.getY();
//		int r = Math.abs(x0-x1); 
//		w = h = 2*r;
//		x = x0 - r;
//		y = y0 - r;
//		repaint();
//	}
	
}

class MyMouseAdapter extends MouseAdapter {
	private JFpainter painter;
	public MyMouseAdapter(JFpainter painter) {
		this.painter = painter;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setY0(e.getY());
		//x0 = e.getX(); y0 = e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		int x1 = e.getX(), y1 = e.getY();
		painter.changeLine(x1, y1);
	}
}





