package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalSign extends JFrame {
	private JButton clear, undo, redo, save, open,color,stroke,bgcolor;
	private MySignPanel msp;
	
	public DigitalSign(){
		super("Digital Sign");
		setLayout(new BorderLayout());	
		JComboBox g = new JComboBox();
		g.setSize(200, 100);
		g.addItem("選擇粗細");
		for(int i=1;i<=20;i++){
		g.addItem(i);}
		clear = new JButton("Clear"); 
		undo = new JButton("Undo");
		color = new JButton("color"); 
		bgcolor = new JButton("bgcolor"); 
		//stroke = new JButton("stroke"); 
		redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout()); 
		top.add(clear);top.add(undo); 
		top.add(redo);top.add(color);
		top.add(bgcolor);
		//top.add(stroke);
		top.add(g);
		add(top, BorderLayout.NORTH);		
		msp = new MySignPanel();
		add(msp, BorderLayout.CENTER);	
		
		clear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						msp.undo();
					}
				});
//		stroke.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				msp.stroke();
//			}
//		});
		g.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.stroke(g.getSelectedIndex());
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msp.redo();
			}
		});
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				msp.color();
			}
		});
		bgcolor.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {				
						msp.bgcolor();
					}
				});
		setSize(640,  480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DigitalSign();
	}

}