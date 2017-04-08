package tw.org.iii;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class sequence01OfstudentSup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Brad", 50, 30, 24);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/brad.object"));
			oout.writeObject(s1);//把物件序列化
			oout.flush();
			oout.close();
			System.out.println("OK");//代表沒有例外發生
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
