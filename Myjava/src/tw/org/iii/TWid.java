package tw.org.iii;

public class TWid {
	private String id ;
	boolean mal;
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	TWid(){
		this((int)(Math.random()*2)==0);
	}
	TWid(boolean ismale){
		this(ismale,(int)(Math.random()*26));
	}
	TWid(int area){
		this((int)(Math.random()*2)==0,area);
	}
	TWid(boolean ismale,int area){
		char f0=letters.charAt(area);
	}
	String getId(){
		return id;
	}
	static boolean isCheckOK(String id){
		if(!preCheck(id)){
			return false;
		}
		
		char f0 = id.charAt(0);
		int n12 = letters.indexOf(f0) + 10;	// 'Y' => 21 + 10 = 31
		int n1 = n12 / 10;
		int n2 = n12 % 10;
		int n3=Integer.parseInt(id.substring(1,2));
		int n4=Integer.parseInt(id.substring(2,3));
		int n5=Integer.parseInt(id.substring(3,4));
		int n6=Integer.parseInt(id.substring(4,5));
		int n7=Integer.parseInt(id.substring(5,6));
		int n8=Integer.parseInt(id.substring(6,7));
		int n9=Integer.parseInt(id.substring(7,8));
		int n10=Integer.parseInt(id.substring(8,9));
		int n11=Integer.parseInt(id.substring(9,10));
		int sum=n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
		return sum%10==0;
	}
	static boolean preCheck(String a){
		//判斷長度為10
		//判斷charAt[0]為A-Z
		//判斷charAt[1]為1.2
		//other為0~9		
		return a.matches("^[A-Z][12][0-9]{8}$");//^開頭,$結尾(正規表示法)
	}
}
