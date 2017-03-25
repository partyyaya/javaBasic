package tw.org.iii;

public class ClassinsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ming120 a1=new ming120();
		a1.m1();
		ming120.ming1201 a2 = a1.new ming1201();
		//a2.m1();
		ming120.m3();
		ming120.ming1202 a3 = new ming120.ming1202();//呼叫static類別
	}
}
class ming120{
	ming120(){
		System.out.println("ming120");
	}
	void m1(){
		System.out.println("ming120.m1");
	}
	void m2(){
		System.out.println("ming120.m2");
	}
	static void m3(){
		System.out.println("ming120.m3");
	}
	class ming1201{
		ming1201(){
			System.out.println("ming1201");
		}
		void m1(){
			System.out.println("ming1201.m1");
			ming120.this.m1();//代表ming120的m1方法,this表示此類別(本外類別)
		}
	}
static	class ming1202{
		ming1202(){
			System.out.println("ming1202");
		}
		void m1(){
			System.out.println("ming1202.m1");
			
		}
	}
}