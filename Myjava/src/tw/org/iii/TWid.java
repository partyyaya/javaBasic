package tw.org.iii;

public class TWid {
	private String id ;
	boolean mal;
	TWid(String myid ){
		id=myid;
	}
	boolean ismale(){		
		return id.charAt(1)=='2';
	}
	
	String getId(){
		return id;
	}
	static boolean isCheckOK(String id){
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		char f0 = id.charAt(0);
		int n12 = letters.indexOf(f0) + 10;	// 'Y' => 21 + 10 = 31
		int n1 = n12 / 10;
		int n2 = n12 % 10;
		int n3=Integer.parseInt(id.substring(1,2));
		System.out.println(n3);
		
		return true;
	}
}
