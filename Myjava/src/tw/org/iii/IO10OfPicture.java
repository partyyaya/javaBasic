package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO10OfPicture {

	public static void main(String[] args) {//58
		long start = System.currentTimeMillis();//開始計時
		File readFile = new File("./dir1/brad.jpg");
		File saveFile = new File("./dir2/brad.jpg");
		
		try {
			byte[] b = new byte[(int)readFile.length()];//將整張圖片存放於陣列
			FileInputStream fin = new FileInputStream(readFile);
			fin.read(b);//將整張圖片讀取
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(saveFile);
			fout.write(b);//將整張圖片寫入
			fout.flush();
			fout.close();
			System.out.println("Finish");//代表沒有例外
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);//耗費時間
		
	}

}
