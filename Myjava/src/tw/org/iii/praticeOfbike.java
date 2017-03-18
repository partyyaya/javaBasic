package tw.org.iii;

public class praticeOfbike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike a = new bike();//會產生一記憶體位置
		 new bike(10);//也可不用取名子,以new做出物件bike()再初始化
		System.out.println(a);//會出現記憶體的位置
		System.out.println(a.getSpeed());//只要有new出物件則起初必有值(代表具體存在)
		System.out.println(bike.b);
		a.upSpeed();
		while(a.getSpeed()<10){
			a.upSpeed();
		}
		System.out.println(a.getSpeed());
	}

}
