package tw.org.iii;

import java.util.LinkedList;

public class Collection03 {

	public static void main(String[] args) {
		//list:有順序(為數值),可重複;set:無順序,不能重複;都是collection
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("1");
		list1.add("3");
		list1.add("2");
		list1.add("2");
		list1.add("3");
		list1.add("3");//若要321則都在前面多"0,"再前面依序插入
		list1.add(0,"4");//再0的位置插入4
		//list1.add(5,"4");//只能在現有位置插入,否則出例外
		System.out.println(list1);
		System.out.println(list1.get(0));
		list1.remove("2");//若有多個2,砍第一個2
		System.out.println(list1);
		while(list1.contains("3")){//只要是"3"都移除
			list1.remove("3");
		}
		System.out.println(list1);
	}

}
