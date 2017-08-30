package tw.org.iii;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Generic03 {
	/**
	 * super限定元素范围：必须是String父类   【下限】
	 * @param list
	 */
	public void save(List<? super String> list) {
	}

	@Test
	public void testGeneric() throws Exception {
		// 调用上面方法，必须传入String的父类
		List<Object> list1 = new ArrayList<Object>();
		List<String> list2 = new ArrayList<String>();
		
		List<Integer> list3 = new ArrayList<Integer>();
		save(list2);
		//save(list3);無法調用
	}
}
