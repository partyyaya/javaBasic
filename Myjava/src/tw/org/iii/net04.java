package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class net04 {
	public static void main(String[] args) {
		//for(int i=0;i<=65535;i++){
			try {
				File sendFile = new File("./dir1/ming.png");
				byte[] buf = new byte [(int)sendFile.length()];
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
				//使用BufferedInputStream比較順暢(因有緩衝)
				bin.read(buf);
				bin.close();
				Socket s1 = new Socket(InetAddress.getByName("10.2.1.127"),8999);
				//System.out.println("port"+i);
				OutputStream out = s1.getOutputStream();
				out.write("Hello, World".getBytes());
				out.flush();
				out.close();
				s1.close();
			} catch (Exception e) {				
				System.out.println(e.toString());
			}
		//}
	}

}
