package tw.org.iii;

import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class ming130{
	void m1()throws IOException{
		
	}
}
class ming131 extends ming130{
	void m1()throws IOException{//子類別要用throws時,須用(丟出)父>=的類別,若父沒用,子也不能用
		
	}
}