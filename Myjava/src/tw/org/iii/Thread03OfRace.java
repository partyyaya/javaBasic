package tw.org.iii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thread03OfRace extends JFrame {
	private JButton go,stop;
	private JLabel[] lanes=new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	private boolean isrunning;
	 Thread03OfRace(){
		 super("race");
		 setLayout(new GridLayout(lanes.length+2,1));
		 go = new JButton("GO"); add(go);
		 stop = new JButton("stop"); add(stop);
		 for(int i=0;i<lanes.length;i++){
			 JLabel lane = new JLabel((i+1)+",");
			 lanes[i]=lane;
			 add(lane);
		 }
		
		 go.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		 stop.addActionListener(new ActionListener() {		
				@Override
				public void actionPerformed(ActionEvent e) {
					stopGame();
				}
			});
		 setSize(800,480);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 private void go (){
		 if(!isrunning){
			 isrunning=true;
			 rank=1;
			 for(int i=0;i<lanes.length;i++){
				 lanes[i].setText((i+1)+",");
			 }
			for(int i=0;i<cars.length;i++){
				cars[i]=new Car(i);
			}
			for(int i=0;i<cars.length;i++){
				cars[i].start();
			}
		 }
	 }
	 private void stopGame(){
		 for(Car car:cars){
		 car.interrupt();
		 }
		 isrunning=false;
	 }
	private class Car extends Thread{
		private int lane;
		Car(int lane){
			this.lane=lane;
		}
		@Override
		public void run() {
			for(int i=0;i<=100;i++){
				lanes[lane].setText(lanes[lane].getText()+">");
				try {
					Thread.sleep(10+(int)(Math.random()*200));
				} catch (InterruptedException e) {
				//System.out.println(lane+"ok");					
				}				
				if(rank>1){					
				break;
				}					
			}
			lanes[lane].setText(lanes[lane].getText()+rank++);
			stopGame();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread03OfRace();
	}

}
