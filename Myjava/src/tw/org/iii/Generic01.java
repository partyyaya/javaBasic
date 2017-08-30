package tw.org.iii;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Generic01 {

	// 运行时期异常 
	@Test
	public void testGeneric() throws Exception {
		// 集合的声明
		List list = new ArrayList();
		list.add("China");
		list.add(1);
		
		// 集合的使用
		String str = (String) list.get(1);		
	}
	

	// 使用泛型
	@Test
	public void testGeneric2() throws Exception {
		// 声明泛型集合的时候指定元素的类型
		List<String> list = new ArrayList<String>();
		list.add("China");
//		list.add(1);// 编译时期报错
		
		String str = list.get(1); 
	}
	
	/*
	 * 泛型擦除实例 
	 
	public void save(List<Person> p){
	}
	public void save(List<Dept> d){    // 报错： 与上面方法编译后一样
	}
	*/
	
	// 泛型写法
	@Test
	public void testGeneric3() throws Exception {
		// 声明泛型集合，集合两端类型必须一致
		List<Object> list = new ArrayList<Object>();
		List<String> list1 = new ArrayList<String>();
		List list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList();
		
		// 错误
		//List<Object> list4 = new ArrayList<String>();
		// 错误： 泛型类型必须是引用类型,不能为基本类型
		// List<int> list5 = new ArrayList<int>();
	}
	

}
