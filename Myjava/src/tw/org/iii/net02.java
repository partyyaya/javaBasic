package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class net02 {

	public static void main(String[] args) {
		//UDP:不管有沒連接照傳封包/TCP:有連接才傳封包
		String data = "wtf";
		byte[] sendData = data.getBytes();
		
		try {//送出udp封包形式
			DatagramSocket s1 = new DatagramSocket();//作udp輸出通道
			DatagramPacket p1 = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("10.2.24.109"),8444);
			//DatagramPacket代表作出封包
			s1.send(p1);
			s1.close();
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
