package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;


import javax.swing.JPanel;

public class CollectionOfInterface01sup extends JPanel {
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines;
	public CollectionOfInterface01sup(){
		setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);//移動時
		lines = new LinkedList<>();
	} 
	//1.mouse event 
	@Override
	public void paintComponents(Graphics g) {
		
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(4));
		for(LinkedList<HashMap<String,Integer>> line:lines){
			for(int i=1;i<line.size();i++){//int i=1因為0看不到線
				HashMap<String , Integer> p0 = line.get(i-1);
				HashMap<String , Integer> p1 = line.get(i);
				int x0=p0.get("x"),y0=p0.get("y");
				int x1=p1.get("x"),y1=p1.get("y");
				g2d.drawLine(x0, y0, x1, y1);
			}
		}		
	}
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {			
			super.mousePressed(e);
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
			HashMap<String, Integer> point =new HashMap<>();
			point.put("x", e.getX());
			point.put("y",e.getY());
			line.add(point);
			lines.add(line);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String, Integer> point =new HashMap<>();
			point.put("x", e.getX());
			point.put("y",e.getY());
			lines.getLast().add(point);
			repaint();
		}
	}
	//2.data struture 
	//3.draw
}
