package tw.org.iii;
//thread02 彈性較大,因implements可實做很多張,extends只能繼承一個

public class Thread02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread2 t2 = new thread2("a");
		Thread tt2 = new Thread(t2);//用tt2表現t2的生命週期,t2需implements Runnable
		tt2.start();
		thread2 t3 = new thread2("b");
		Thread tt3 = new Thread(t3);//用tt3表現t3的生命週期,t3需implements Runnable
		tt3.start();
	}
}
class thread1 extends Thread{//只有繼承thread才有執行緒
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(i);			
		}
	}
}
class thread2 implements Runnable{//thread2無執行緒(無start方法)
	private String name;
	thread2(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(name+" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}