package tw.org.iii;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenericT04<T> {
	T s;
	// 保存当前运行类的参数化类型中的实际的类型
		private Class clazz;
		// 表名
		private String tableName;
		
		
		
		// 构造函数： 1. 获取当前运行类的参数化类型； 2. 获取参数化类型中实际类型的定义(class)
		public GenericT04(){
			//  this  表示当前运行类  (繼承此類別的子類)
			//  this.getClass()  当前运行类的字节码(繼承此類別的子類.class)
			//  this.getClass().getGenericSuperclass();  当前运行类的父类，即为GenericT04<T>
			//                                           其实就是“参数化类型”， ParameterizedType   
			Type type = this.getClass().getGenericSuperclass();
			// 强制转换为“参数化类型”  【GenericT04<T>】
			ParameterizedType pt = (ParameterizedType) type;
			// 获取参数化类型中，实际类型的定义  【new Type[]{T.class}】
			Type types[] =  pt.getActualTypeArguments();
			// 获取数据的第一个元素：T.class
			clazz = (Class) types[0];
			// 表名  (与类名一样，只要获取类名就可以)
			tableName = clazz.getSimpleName();
		}
	
	// 定义泛型方法
		public <K> T save(T t,K k) {
			return t;
		}		
		public void update(T t) {

		}		
		public T update(int c) {
			return s;
		}
		// 测试方法
		@Test
		public void testMethod() throws Exception {
			
			// 泛型类：  在创建爱泛型类对象的时候，确定类型
			GenericT04<String> demo = new GenericT04<String>();
			demo.save("", 1);
		}
}
