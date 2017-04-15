package tw.org.iii;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Thread06Ofballsup extends JLabel {
	private Timer timer;
	private int i=0;
	
	public Thread06Ofballsup(){
		timer = new Timer();
		timer.schedule(new task(),0, 1000);
		
	}
	private class task extends TimerTask{
		@Override
		public void run() {
			Calendar c1 = Calendar.getInstance();
			int h = c1.get(Calendar.HOUR_OF_DAY);
			int m = c1.get(Calendar.MINUTE);
			int s = c1.get(Calendar.SECOND);
			setText(h+":"+m+":"+s);
		}
	}

}
