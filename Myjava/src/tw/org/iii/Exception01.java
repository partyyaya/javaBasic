package tw.org.iii;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2;
		int[] c={1,2,3,4};
		try{//裡面可以為空,只要一檢查到錯誤則跳至適合的例外處理(部會執行之後直接跳至catch)
			System.out.println(c[4]);
			System.out.println(a/b);
			try{//內部例外建議不使用,因沒有差別,若內部catch使用RuntimeException則之後子類都無法使用				
				System.out.println(a/b);
			}catch(ArrayIndexOutOfBoundsException ee){
				System.out.println("8787");
			}
		}
		catch(ArithmeticException ce){//ArithmeticException算術例外,catch:例外執行
			b=1;
			System.out.println(a/b);		
		}
		//ArrayIndexOutOfBoundsException,ArithmeticException都為RuntimeException的子類別
			//子類可以互換,父與子,子必須在父之上,以子例外優先處理
			
		catch(RuntimeException ee){//只要是執行錯誤都執行此例外
			System.out.println("ok");
		}
		System.out.println("qq");
	}

}
