package tw.org.iii;

public class bike {//extends Object,默認繼承Object
	 double speed;//private:不讓使用者知道 與 隨意改變
	/* 1:public    >>全世界
	 * 2:protected
	 * 3:無		   >>同一package
	 * 4:private   >>class
	 * */
	int a;//a=0物件內初始化,a一定要有new物件出來才能使用
	      //若無設定static之xxxx.變數或方法,無法使用於static範圍內
	static int b;//b=0,雖跟a依樣=0,但b屬該"物件本質所有",若該物件呼叫幾次,b=幾次,不會因new初始化
	{
		
		System.out.println("y");
	}
	static{//static為物件本質所有(當該物件被叫出,固定為一個(只呼叫一次))
		
		System.out.println("x");
	}
	//建構式以最佳輸入為主去調用建構式,建構式為物件的初始化動作
	bike(){//此為建構式,()代表對外,{}代表定義
		this(0);//表示此建構式,輸入()內之值((會跳至合適的建構式輸出
	}
	bike(int k){
		this(k*1f);
	}
	bike(float k){
		this(k*1.0);
	}
	bike(double k){
		k=speed;
		a++;b++;
		System.out.println("789");
	}
	//相同名稱之方法,輸入不同,名為overloded
	void upSpeed(){
		upSpeed(0);//表示此建構式的同名方法(("this."可加可不加(因為在同一物件內)
	}
	void upSpeed(double a){
		speed=(speed<1)?1:(speed*(1.2+a));
	}
	void downSpeed(){
		
		speed*=0.7;	
	}
	double getSpeed(){
		return speed;
	}
}
