package tw.org.iii;

public class Thread01 {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("");
		MyThread m1 = new MyThread("1");
		MyThread m2 = new MyThread("2");
		//m2.run();//裡面方法可重複
		m2.start();//start代表物件生命開始=>只有一個start(此物件生命)
		m1.start();//分岔一執行緒,非馬上開始=>排入main執行緒行程
		Thread.sleep(400);//在0.4秒時印出123
//系統給相同物件時間區塊依樣:a=>睡覺0.1秒=>b=>睡覺0.1秒=>a,b(醒來等排入行程=>a,b睡覺+排入行程時間>=0.1秒)
		System.out.println("123");
	}
}
class MyThread extends Thread{
	private String name ;
	MyThread(String name){
		this.name=name;
	}
	@Override
	public void run() {//表現多執行序
		for(int i=0;i<=10;i++){
			//long start = System.currentTimeMillis();
			System.out.println("thred"+name+" "+i);
			try {
				Thread.sleep(100);//睡覺0.1秒
//				long end = System.currentTimeMillis();
//				System.out.println((double)(end-start)/1000+"秒");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}		
	}
	long end = System.currentTimeMillis();
}