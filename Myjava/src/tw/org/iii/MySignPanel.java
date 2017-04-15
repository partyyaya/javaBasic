package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySignPanel extends JPanel{
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines,recycle;
	private LinkedList<Color> color,colorrecycle,bgcolor;
	private LinkedList<BasicStroke> stroke,strokerecycle;
	private LinkedList sign ;
	Color c1,c2   ;
	BasicStroke s1=new BasicStroke(4);
	public MySignPanel(){
		setBackground(c2=Color.white);		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);		
		lines = new LinkedList<>(); 
		color = new LinkedList<>();
		stroke= new LinkedList<>();
		recycle = new LinkedList<>();
		sign = new LinkedList<>();
		colorrecycle = new LinkedList<>();
		strokerecycle= new LinkedList<>();		
	}
	// 1. mouse event, 2. data structure, 3. draw	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(c2);
		Graphics2D g2d = (Graphics2D)g;		
		for(int i=0; i<lines.size(); i++){
			g2d.setStroke(stroke.get(i));
			g2d.setColor(color.get(i));			
			for (int j=1; j<lines.get(i).size(); j++){				
				HashMap<String,Integer> p0 = lines.get(i).get(j-1);
				HashMap<String,Integer> p1 = lines.get(i).get(j);
				int x0 = p0.get("x"), y0 = p0.get("y");
				int x1 = p1.get("x"), y1 = p1.get("y");				
				g2d.drawLine(x0, y0, x1, y1);					
			}			
		}
		sign.add(g2d.getPaint());
	}
	public void color(){
		 c1 = JColorChooser.showDialog(this, "Select a Color", Color.BLUE);
	}
	public void bgcolor(){
		 c2 = JColorChooser.showDialog(this, "Select a Color", Color.BLUE);
	}
//	public void stroke(){
//		 s1 = new BasicStroke(Integer.parseInt(JOptionPane.showInputDialog("�п�J�ʲӤj�p")));
//		 
//	}
	public void stroke(int a){
		s1 = new BasicStroke(a);
	}
	public void clear(){
		lines.clear();
		color.clear();
		stroke.clear();
		bgcolor.clear();
		repaint();
	}
	public void undo(){		
		recycle.add(lines.removeLast());
//		colorrecycle.add(color.removeLast());
//		strokerecycle.add(stroke.removeLast());
		repaint();
	}
	public void redo(){
		lines.add(recycle.removeLast());
//		color.add(colorrecycle.removeLast());
//		stroke.add(strokerecycle.removeLast());
		repaint();
	}
	public void screenclip(){
		try{
			Robot robot = new Robot();
			File saveFile = new File("");
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rect = new Rectangle(0, 0, d.width, d.height);
			BufferedImage image = robot.createScreenCapture(rect);
			String currentFile="./dir1";
			JFileChooser fc = new JFileChooser(currentFile);
			int option = fc.showSaveDialog(null);
			if(option == JFileChooser.APPROVE_OPTION){
				saveFile = fc.getSelectedFile();
				//簡單一行  寫入 (目標影像, 格式, 目的地)
				ImageIO.write(image, "bmp", saveFile);	
			}
		}catch(Exception ee){
				ee.toString();
		}			

	}
	protected void saveFile(){
		try{
			Dimension d1 = this.getSize();//Dimension表示尺吋
			BufferedImage bi = new BufferedImage(d1.width, d1.height,BufferedImage.TYPE_INT_BGR);
			File saveFile = new File("");
			String currentFile="./dir1";
			JFileChooser fc = new JFileChooser(currentFile);
			int option = fc.showSaveDialog(null);
			this.printAll(bi.getGraphics());
			if(option == JFileChooser.APPROVE_OPTION){
				saveFile = fc.getSelectedFile();
				//簡單一行  寫入 (目標影像, 格式, 目的地)
				ImageIO.write(bi, "bmp", saveFile);	
			}
		}catch(Exception ee){
				ee.toString();
		}	
	}
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			recycle.clear();
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();			
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			line.add(point);
			color.add(c1);
			stroke.add(s1);
			lines.add(line);			
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();
			
		}
	}
}