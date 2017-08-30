package tw.org.iii;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenericT04<T> {
	// 定义泛型方法
		public <K> T save(T t,K k) {
			return null;
		}		
		public void update(T t) {

		}		
		// 测试方法
		@Test
		public void testMethod() throws Exception {
			
			// 泛型类：  在创建爱泛型类对象的时候，确定类型
			GenericT04<String> demo = new GenericT04<String>();
			demo.save("", 1);
		}
}
