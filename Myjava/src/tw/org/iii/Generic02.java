package tw.org.iii;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Generic02 {

	/**
	 * list集合只能处理 Double/Float/Integer等类型
	 * 限定元素范围：元素的类型要继承自Number类  (上限)
	 * @param list
	 */
	public void save(List<? extends Number> list) {
	}

	@Test
	public void testGeneric() throws Exception {
		List<Double> list_1 = new ArrayList<Double>();
		List<Float> list_2 = new ArrayList<Float>();
		List<Integer> list_3 = new ArrayList<Integer>();
		List<Number> list_5 = new ArrayList<>();
		List<String> list_4 = new ArrayList<String>();
		
		// 调用
		save(list_1);
		save(list_2);
		save(list_3);
		save(list_5);
		//save(list_4);無法調用
	}
}
