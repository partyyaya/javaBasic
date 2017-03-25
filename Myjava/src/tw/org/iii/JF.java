package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JF extends JFrame {
	private JButton open ,save,exit;
	private JFpinter2 painter;
	JF(){
		super("視窗程式");//=JFrame()
		//setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		open = new JButton("open");
		save = new JButton("save");
	    exit = new JButton("exit");
		painter =new JFpinter2();
		//add(open, BorderLayout.NORTH);
		//add(save, BorderLayout.WEST);
		//add(exit, BorderLayout.SOUTH);
		JPanel top=new JPanel(new FlowLayout());
		top.add(open);top.add(save);top.add(exit);
		add(top,BorderLayout.NORTH);//alt+/可看提示視窗
		add(painter,BorderLayout.CENTER);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JF();
	}

}
