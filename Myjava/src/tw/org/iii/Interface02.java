package tw.org.iii;

public class Interface02 {
/*如何應用interface
 * 首先把共同功能找出並interface
 * 一個個 對 對象implements 共同功能
 * 再對 對象進行描述
 * */
	public static void main(String[] args) {
		sw(new flyerfish(""));
		
	}
	static void sw(swim a){
		a.m1();
	}
}
interface flying{
	void fly();
}
interface swim{//可被擁有的方法或行為
	void m1();//interface裡不寫存取修飾字=public abstract
	abstract void m2();//interface不可用{},因為都是抽象方法,abstract可加可不加
					   //interface需要實作
}

abstract class fish implements swim{//若abstract要改public需存放於另一個資料夾
	private String name;
	fish(String name){
		this.name=name;
	}
	public abstract void m1();//因interface皆為public則須在方法前加public
	public void m2(){}
}

class flyerfish extends fish implements flying{
	 //也可以將extends fish implements flying 改成 implements flying,swim
	flyerfish(String na){
		super(na);
	}
	public void m1(){//因父類別為public則須在方法前加public		
	}
	public void m2(){System.out.println("mmm");}
	public void fly(){
		System.out.println("飛起來了");
	}
}
 class dock implements flying,swim{
	 public void m1(){}
	 public void m2(){}
	 public void fly(){}
 }

