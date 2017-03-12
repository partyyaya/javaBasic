package tw.org.iii;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();//因為字串是物件
		byte[] b ={97,98,99,100,101,102,103};//abcdefg
		String s2 = new String(b);
		String s3 = new String(b,2,4);//從第2位置(c)開始傳4個
		String s4 = "ncejownv";
		System.out.println(s3);
		char c1 = s2.charAt(3);//0123
		System.out.println(c1);
		System.out.println("abcdefg".charAt(4));//當""出現,會自動new出新物件
		
	}

}
