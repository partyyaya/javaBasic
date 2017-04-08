package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class net05netpicture {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://3.share.photo.xuite.net/victory0508454/13f3544/6993829/271639967_m.jpg");
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin=new BufferedInputStream(in);
			byte[]buf = new byte [4096];
			int len;
			while((len=bin.read(buf))!=-1){
				bout.write(buf,0,len);
			}
			bin.close();//先讀入
			bout.flush();
			bout.close();//再輸出
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}

}
