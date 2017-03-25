package tw.org.iii;

import java.io.File;//也可import java.io.*;在java.io的package裡的檔案
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("./dir1/File.txt");// \\=/ >> c:\\test\\brad.txt; .=所有,大小寫都可
		/*if(f1.exists()){//因丟出的為runtime底下所以不用try,catch
			System.out.println("有"+f1.getAbsolutePath());
		}else{
			System.out.println("無");
		}*/
		
		try{//因FileNotFoundException不在runtime裡面
		FileInputStream fin = new FileInputStream(f1);
		byte[] buf = new byte[(int)f1.length()];//因為utf-8,每個陣列空間最大為int
		int temp=fin.read(buf);
		System.out.print(new String(buf,0,temp));
		//while(( temp=fin.read(buf))!=-1){
		//	System.out.print(new String(buf,0,temp));
		//}
		
		//do{
		//	temp = fin.read();
		//}while(temp!=-1);
		//System.out.println((char)fin.read());
		
		fin.close();
		}
//		catch(FileNotFoundException ee){
//			System.out.println(ee.toString());
//		}
		catch(IOException ee){
			System.out.println(ee.toString());
		}

	}
}

