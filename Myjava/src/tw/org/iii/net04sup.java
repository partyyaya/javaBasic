package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class net04sup {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8999);
			Socket socket  = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.png"));
			BufferedInputStream bin=new BufferedInputStream(socket.getInputStream());
			byte[]buf = new byte [4096];
			int len;
			while((len=bin.read(buf))!=-1){
				bout.write(buf,0,len);
			}
			bin.close();//先讀入
			bout.flush();
			bout.close();//再輸出
			server.close();
			System.out.println("ok");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
