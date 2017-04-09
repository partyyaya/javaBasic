package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection02 {

	public static void main(String[] args) {
			HashSet set1 = new HashSet();
			set1.add(12);
			set1.add(56);
			set1.add(12.3);
			set1.add(12.3);//部會重複
			set1.add(12.0);
			set1.add("www");
			System.out.println(set1);
//-------------------------------------------//
			HashSet set2 = new HashSet();
			while(set2.size()<6){//樂透號碼產生器(因HashSet部會重複)
				set2.add((int)(Math.random()*49+1));				
			}
			System.out.println(set2);
//-----------------------------------------------//
			TreeSet set3 = new TreeSet();
			set3.add(12);
			set3.add(56);
			set3.add(23);
			//set3.add("123");//因不能轉型,"執行後"所以跳出例外
			System.out.println(set3);
//--------------------------------------------//
			TreeSet set4 = new TreeSet();
			while(set4.size()<6){//樂透號碼產生器(因TreeSet部會重複+由小到大)
				set4.add((int)(Math.random()*49+1));//當add進去時就會排序				
			}
			System.out.println(set4);
//--------------------------------------------//			
			TreeSet<Integer> set5 = new TreeSet<>();//<Integer>代表裡面只能放Integer型態
			set5.add(12);
			set5.add(56);
			byte a=23;
			//set5.addAll(a);//因不能直接轉型,會再寫的時候直接罵人
			System.out.println(set5);
//----------------------------------------------//			
			TreeSet<String> set6 = new TreeSet<>();//<Integer>代表裡面只能放Integer型態
			set6.add("12");
			set6.add("15");
			set6.add("24");			
			//set5.addAll(a);//因不能直接轉型,會再寫的時候直接罵人		
			for(String str:set6){
				System.out.println(set6);
//------------------------------------------------//
				HashSet set7 = new HashSet();
				set7.add(13);
				set7.add(56);
				set7.add(12.3);
				HashSet set8 = new HashSet();
				set8.add(12.3);//部會重複
				set8.add(12.0);
				set7.addAll(set8);
				System.out.println(set7);					
			}
	}

}
