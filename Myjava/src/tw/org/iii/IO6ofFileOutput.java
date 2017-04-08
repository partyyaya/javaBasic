package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO6ofFileOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "1234567,123\nline1\nline2\n";//"\n"代表煥行
		File outFile = new File("./dir1/file01.txt");
		//即使dir1裡沒資料,也不會報錯,因不影響物件實體
		try {
			FileOutputStream f1 = new  FileOutputStream(outFile,true);
			//true代表再後面輸出東西進去(append),預設為false
			//若輸出檔案"找步道位址"則會"新增檔案創立",會先到Buffer緩衝區再決定傳到資料夾裡
			//若有安全設定則會出例外
			f1.write(data.getBytes());
			//每執行一次則會全部刷新,輸出新的
			f1.flush();//能準確送到接收端的方法,以免滯留在緩衝區(inputStream沒有)
			f1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
