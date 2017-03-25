package tw.org.iii;

import java.io.*;//也可import java.io.*;在java.io的package裡的檔案

public class IO04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("./dir1/File.txt");// \\=/ >> c:\\test\\brad.txt; .=所有,大小寫都可
		try{
		FileReader r1 = new FileReader(f1);//The character read
		int temp;
		while(( temp=r1.read())!=-1){
				System.out.print((char)temp);
			}
		}
		catch(Exception ee){
			System.out.println(ee.toString());
		}

	}
}

