package tw.org.iii;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1= new StringBuffer();//StringBuffer無法繼承因有final
		StringBuffer sb2= sb1;//指向同一位置
		sb1.append("12345678901234567890");//改變同一位置的值;而String會新建記憶體位置
		System.out.println(sb1.capacity());//一開始容量為16,若超過16則為(+1)*2=34,超過34則capacity=length
		System.out.println(sb1.length());
		System.out.println(sb1==sb2);
		System.out.println(sb2);//列印出指向位置的內容
	}

}
