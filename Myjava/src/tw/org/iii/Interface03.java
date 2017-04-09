package tw.org.iii;

public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
interface ming030{
	public void m1();
}
interface ming031{
	public void m2();
}
interface ming032 extends ming030{//介面繼承無implements,因無法實作,需用extends
	public void m3();
	public void m1();//介面無override覆寫意義
	public void m1(int a);//多型也要實作出來
}
interface ming033 extends ming030,ming031{//介面可多重繼承
	public void m1();
}
class ming034 implements ming032{//要連子界面繼承的父介面一起實作
	public void m1(int a){};
	public void m1(){};
	public void m3(){};
}
class ming035 extends ming034{
	public void m1(){};//override

}



