package tw.org.iii;

public class Turnclass {
	public static void main(String [] args){
		ming014 m1=new ming014();
		ming015 m2=(ming015)m1;//轉型
		ming014 m3=new ming015();
		ming015 m4=(ming015)m3;//轉型失敗,因為子類別不能互轉型(classcastexception)
	}
}
class ming014{
	
}
class ming015 extends ming014{
	
}
class ming016 extends ming015{
	
}
