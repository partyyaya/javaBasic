package tw.org.iii;

import javax.swing.JFrame;

public class JF extends JFrame {
	JF(){
		super("視窗程式");//=JFrame()
		setSize(640, 480);
		setVisible(true);
		System.out.println("134567");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JF();
	}

}
