package tw.org.iii;

public class ClassAndClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
/*存取修飾字:1>2>3>4
* 1:public    >>全世界
 * 2:protected
 * 3:無		   >>同一package
 * 4:private   >>class
 * */
class ce1{
	public void m1(){		
	}
	ce3 m2(){return new ce3();}
}
class ce2 extends ce1{
	 public void m1(){//若子類別要overwrite父類別,則型態與方法名稱都要依樣
					 //若子繼承父的方法則,存取修飾字須>=父
		 			 //,若父方法為private則子可無視父方法名稱可做相同名稱方法並無關系		
	}
	 ce4 m2(){return new ce4();}
}
class ce3{
	
}
class ce4 extends ce3{
	
}
