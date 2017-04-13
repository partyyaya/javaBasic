package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class net02sup {

	public static void main(String[] args) {
		byte[] sendData = new byte[1024];		
			try {//接收udp封包形式
				DatagramSocket s1 = new DatagramSocket(8444);//開啟8444窗口
				DatagramPacket p1 = new DatagramPacket(sendData, sendData.length);
				//DatagramPacket代表作出封包空殼,以備姐收封包
				s1.receive(p1);						
				System.out.println("ok"+p1.getAddress().getHostAddress()+" 12345");
				s1.close();
			} catch (Exception e) {			
				e.printStackTrace();
			}		
	}
}
