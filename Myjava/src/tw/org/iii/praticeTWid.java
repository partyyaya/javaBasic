package tw.org.iii;

public class praticeTWid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TWid c = new TWid("f23456789");
		if(c.ismale()){
			System.out.println("女生");
		}else
			System.out.println("男生");
		c.isCheckOK("12345678");
	}
}
