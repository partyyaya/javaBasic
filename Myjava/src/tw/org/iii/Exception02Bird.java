package tw.org.iii;

public class Exception02Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird b1 = new bird();
		try{
		b1.setleg(2);
		}catch(Exception ee){
			
		}
	}

}
class bird{
	private int leg;
	void setleg(int n) throws Exception{//RuntimeException可不用try{}catch(){}
		if(n>2||n<0){
			throw new Exception();
		}
		leg=n;
	}
}