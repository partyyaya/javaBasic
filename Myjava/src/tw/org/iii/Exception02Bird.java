package tw.org.iii;

public class Exception02Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird b1 = new bird();
		
		try{//RuntimeException及以內可不用try{}catch(){}
		b1.setleg(2);
		}
		catch(MyException ee){	
			System.out.println(ee.toString());
		}
		catch(MyException2 ee){	
			System.out.println(ee.toString());
		}
		catch(Exception ee){	
			System.out.println(ee.toString());
		}
		System.out.println("end");
	}

}
class bird{
	private int leg;
	//void setleg(int n) throws MyException,MyException2{//宣告throws須加s因可能丟出多個
	void setleg(int n) throws Exception{//若宣告Exception則trycatch必需用到Exception
		if(n>2||n<0){
			throw new Exception();//丟出一個用throw
		}
		leg=n;
	}
}
class MyException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
class MyException2 extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}