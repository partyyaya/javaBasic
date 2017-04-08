package tw.org.iii;

import java.io.DataOutputStream;
import java.io.*;
import java.io.FileOutputStream;

public class IO08Of07DataInput {//55.56

	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			
			int a = din.readInt();
			int b = din.readInt();
//			char c1 = din.readChar();
//			char c2 = din.readChar();
//			char c3 = din.readChar();
//			char c4 = din.readChar();
			String c = din.readUTF();
			String s1 = din.readUTF();//須按照順序一一讀取,以避免亂碼
			din.close();
			System.out.println("=> " + a + ":" + b + ":" +c + ":" + s1);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
