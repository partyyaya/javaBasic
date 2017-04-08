package tw.org.iii;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class net03 {
	public static void main(String[] args) {
		//for(int i=0;i<=65535;i++){
			try {
				Socket s1 = new Socket(InetAddress.getByName("10.2.1.127"),9999);
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
