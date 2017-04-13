package tw.org.iii;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IO07ofDataOutput {

	public static void main(String[] args) {
		int a=1, b=2; String c = "Brad", d="資策會";
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeInt(a);
			dout.writeInt(b);
			dout.writeUTF(c);
			dout.writeUTF(d);
			dout.writeUTF(d+a);
			dout.flush();
			dout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
