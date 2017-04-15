package tw.org.iii;

import java.util.Timer;
import java.util.TimerTask;

public class Thread05 {
	private static Timer timer= new Timer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timer = new Timer();
		timer.schedule(new ming046("a"),3000,1000);//排入行程後3秒鐘後每一秒印出ok
		timer.schedule(new ming046("b"),2000,500);//排入行程後2秒鐘後每0.5秒印出ok
		timer.schedule(new stop091(timer),9000);//9秒鐘後結束
		System.out.println("main");
	}
	static class stop091 extends TimerTask{
		private Timer timer;
		stop091( Timer timer){
			this.timer=timer;
		}
		@Override
		public void run() {
			timer.cancel();
			}
		}
}
class ming046 extends TimerTask{
	private String name;
	private int i;
	ming046(String name){
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+" is ok "+i++);
		}
	}
class stop090 extends TimerTask{
	private Timer timer;
	stop090( Timer timer){
		this.timer=timer;
	}
	@Override
	public void run() {
		timer.cancel();
		}
	}