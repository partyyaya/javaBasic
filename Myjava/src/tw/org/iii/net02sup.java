package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class net02sup {

	public static void main(String[] args) {
		byte[] sendData = new byte[1024];		
			try {
				DatagramSocket s1 = new DatagramSocket(8444);
				DatagramPacket p1 = new DatagramPacket(sendData, sendData.length);				
				s1.receive(p1);						
				System.out.println("ok"+p1.getAddress().getHostAddress()+" 12345");
				s1.close();
			} catch (Exception e) {			
				e.printStackTrace();
			}		
	}
}
