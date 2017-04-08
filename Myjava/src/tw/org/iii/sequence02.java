package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class sequence02 {

	public static void main(String[] args) {
		ming021 obj = new ming022();
		//序列:依序排列一種方式
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/ming020"));
			oout.writeObject(obj);//把物件序列化
			oout.flush();
			oout.close();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//解序
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/ming020"));
			ming022 obj2 = (ming022)oin.readObject();
			//序列化的類別在解序時不會執行建構式第二次(因已存實體)
			oin.close();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
class ming020 implements Serializable{
	//當父類別有序列化,則之後子類別都有序列化,若只有子類別序列化,則父類別無序列化
	ming020(){System.out.println("ming020");}

}
class ming021 extends ming020 {
	ming021(){System.out.println("ming021");}
}
class ming022 extends ming021 {
	ming022(){System.out.println("ming022");}
}