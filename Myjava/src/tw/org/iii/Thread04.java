package tw.org.iii;

public class Thread04 {
		
	public static void main(String[] args) {
		ming045 obj1 = new ming045();
		obj1.setDaemon(true);//跟著主序走,主序結束則結束,預設為false
		obj1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok");
		return;//即使return也不會結束,沒加obj1.setDaemon(true);也不會結束
	}
}
class ming045 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}