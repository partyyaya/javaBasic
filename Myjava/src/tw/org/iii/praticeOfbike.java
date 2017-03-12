package tw.org.iii;

public class praticeOfbike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike a = new bike();//會產生一記憶體位置
		bike b = new bike();
		System.out.println(a);//會出現記憶體的位置
		System.out.println(b.getSpeed());//只要有new出物件則起初必有值(代表具體存在)
		b.upSpeed();
		while(b.getSpeed()<10){
			b.upSpeed();
		}
		System.out.println(b.getSpeed());
	}

}
