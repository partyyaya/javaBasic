package tw.org.iii;

public class ClassAndClass02 {

	public static void main(String[] args) {
		cd1 c1=new cd3();//因為abstract而無法new cd1
		c1.m2();//因父m2方法為抽象而找子相同名稱方法(實體為cd2則方法用cd2)
	}
}
abstract class cd1{//具有抽象方法的類別必為抽象類別,抽象類別需由子幫忙開創抽象方法的實體
	cd1(){
		System.out.println("cd1()");
	}	
	 void m1(){System.out.println("cd1.m1");}
	 abstract void m2();	//抽象方法不可加{},也不可加static,因為虛構無法具體表示,需由子代做
}
class cd2 extends cd1{
	void m2(){System.out.println("cd2.m2");}//

}
class cd3 extends cd1{
	 void m2(){System.out.println("cd3.m2");}
	//若父與子有相同名稱之方法,則不能用static,因static為本類別專屬
}
abstract class cd4 extends cd1{
	 void m3(){}
	 abstract void m4();//抽象方法不可加{},也不可加static,因為需由子代做
}