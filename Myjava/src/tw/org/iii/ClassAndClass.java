package tw.org.iii;

public class ClassAndClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add3 a1 = new add3();
		add2 a2 = new add3();//以父類別創子類別,但不可以子創父,且變數名稱a1.a2不可依樣
		//如上所示,建構子以父類別為主,若父子方法名稱相同則用子方法(宣告為主),若無相同方法則無法用子方法
		//以宣告之類別為主,父看不到子的變數,但可用方法看到
		//myf1(a2);
		a2.m1();
	}
	static void myf1(add1 a){
		a.m1();//以參數為主去使用方法,若父子方法名稱相同則用子方法(宣告為主),若無相同方法則無法用子方法
	}
}
class add1{
	int a;
	static {System.out.println("a1");}
	add1(int b){
	System.out.println("1");
		a++;
	}
	 void m1(){//若父類別方法加static則子類不能有相同名稱之方法
		 int c=0;
		System.out.println("add1");
	}
}
class add2 extends add1{
	
	static {System.out.println("a2");}
	add2(){//若父類別建構子有參數,則子類別做出建構子檔替,子類別都需super	
		
		this(0);//若用super就不能用this,相反也是,this代表此類別
		a++;
		System.out.println("23");
	}
	add2(int b){
		
		super(0);//若父類別建構子有參數,則子類別做出建構子檔替	
		a++;
		System.out.println("20");
	}
	 void m1(){//若父與子有相同名稱之方法,則不能用static,因static為本類別專屬
		 	super.m1();
			System.out.println("add2");
		}
}
class add3 extends add2{
	int b;
	static {System.out.println("a3");}//static會先找到最根源再依序找到子類別
	
	add3(){	
		
		super(0);//使用父類別(int a),若沒寫super則用無參數
		a++;
		System.out.println("3");
		System.out.println(a);
	}
    void m1(){
    	super.m1();
    	a++;
    	System.out.println(a);
		System.out.println("add3");
	}
}
