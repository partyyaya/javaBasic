package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IO09OfPicture {//57

	public static void main(String[] args)  {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/ming.jpg");
		File saveFile = new File("./dir2/ming.jpg");		
		try {
			FileOutputStream fout = new FileOutputStream(saveFile);
			FileInputStream fin = new FileInputStream(readFile);
			int b;
			while ((b = fin.read()) != -1){//邊讀取編寫入
				fout.write(b);//寫入
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("Finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
		
	}

}
