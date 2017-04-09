package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalSign extends JFrame {
	private JButton clear, undo, redo, save, open,color;
	private MySignPanel msp;
	
	public DigitalSign(){
		super("Digital Sign");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear"); undo = new JButton("Undo");color = new JButton("color"); redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout()); top.add(clear);top.add(undo); top.add(redo);top.add(color);
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
				Color newColor = JColorChooser.showDialog(DigitalSign.this, "Select a Color", Color.BLUE);
				msp.color(newColor);
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
