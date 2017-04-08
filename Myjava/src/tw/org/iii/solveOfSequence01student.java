package tw.org.iii;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class solveOfSequence01student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();
			Object obj2 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;//解序列(轉型),把原本東西復原成原本型態
			Student s2 = (Student)obj2;//解序列(轉型),把原本東西復原成原本型態
			System.out.println(s1.sum());
			System.out.println(s1.avg());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
