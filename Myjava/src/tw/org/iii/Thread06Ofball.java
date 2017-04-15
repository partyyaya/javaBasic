package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Thread06Ofball extends JFrame{
	private Thread06Ofballsup clock;
	private Thread06Ofballsup02 pull;
	Thread06Ofball(){
		setLayout(new BorderLayout());
		clock = new Thread06Ofballsup();
		add(clock,BorderLayout.NORTH);
		pull = new Thread06Ofballsup02();
		add(pull,BorderLayout.CENTER);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	public static void main(String[] s){
		new Thread06Ofball();
	}
}
