package tw.org.iii;

import java.net.InetAddress;

import java.net.UnknownHostException;

public class net01 {

	public static void main(String[] args) {
		//http:代表通訊協定,協定封包的傳輸,//之後:表示主機名稱or"IP"
		try {
			InetAddress[] ips =  InetAddress.getAllByName("www.google.com");
			//會先查本機的通訊錄再去DNS查
			for(InetAddress ip:ips ){
			System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}

}
