package tw.org.iii;



public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ming150().m1();
	}

}
class ming150{
	void m1(){
		try {//沒有try則catch,finally都沒有
			System.out.println("do something");
			//throw new Exception();//代表有錯誤>跳至catch
		} 
		catch (Exception ee) {
			System.out.println("catch");
		}
		finally{//結語的意思,必執行到,就算之前有return也依樣會執行到
			System.out.println("finally");
		}	
		System.out.println("out");
	}
}