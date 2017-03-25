package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IO05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("./dir1/Book1.csv");
		try{
		FileReader fr1 = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr1);
		String temp;
		while((temp=br.readLine())!=null){
		System.out.println(temp);
		}
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}

}
