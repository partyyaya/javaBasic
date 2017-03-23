package tw.org.iii;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1 = new triangle(2,2,2,2);
		m1(s1);
		swimming a1 = new ming013();//因ming013繼承012,所以可以new
		//ming012 m1 = a1;此行編譯錯誤,因擁有的方法不能表示實體
		ming012 m1 = (ming012)a1;//表示ming012實體的方法,a1必須是與m1相同實體才能轉換
		//上敘述幾乎都與class繼承轉型一樣
		swim(new ming013());
	}
	static void swim(swimming q){
		q.m1();
	}
	static void m1(shape a){
		System.out.println(a.area());
	}
}
interface shape{
	double length();
	double area();
}
class triangle implements shape{
	private double s1,s2,s3,h1;
	triangle(double s1,double s2,double s3,double h1){
		this.s1=s1;this.s2=s2;this.s3=s3;this.h1=h1;
	}
	public double length(){return s1+s2+s3;}//要與interface方法名稱相同
	public double area(){return s1*h1/2;}
}

class SquShape implements shape{
	private double s;
	SquShape(double s){
		this.s=s;
	}
	public double length(){
		return s*4;
	}
	public double area(){
		return s*s;
	}
}
interface swimming{//可被擁有的方法或行為
	void m1();//不寫存取修飾字=public
	abstract void m2();//interface不可用{},因為都是抽象方法,abstract可加可不加
					   //interface需要實作
}
 class ming012 implements swimming{
	public void m1(){}//因interface皆為public則須在方法前加public
	public void m2(){}
}
 class ming013 extends ming012{
	public void m1(){//因父類別為public則須在方法前加public
		System.out.println("mmm");
	}
	public void m2(){}
}
