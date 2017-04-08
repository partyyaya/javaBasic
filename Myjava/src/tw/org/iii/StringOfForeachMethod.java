package tw.org.iii;

public class StringOfForeachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x={1,2,3};
		int y[]={4,5,6};
		new StringOfForeachMethod().go(x,y);//二維陣列可用二個一維傳入
		//m1("123","12","1");//若用...時
		m1(3,"123","12","1");
		m2(new String[]{"1234","123","12"});//若用[]時
	}
	void go(int []... z){
		for(int []a:z){
			System.out.println(a[0]);
		}
		
	}
	static void m1(String a){
		System.out.println(a);
	}
	static void m1(String a,String b){
		System.out.println(a);
		System.out.println(b);
	}
	static void m1(String... a){
		//若需傳入不知數個字串用"..."不能用"[]"因為叫不到,若之前有"明確"的方法則用明確的方法
		System.out.println(a[0]);
		for(String name:a){
			System.out.println(name);
		}
	}
	static void m1(String b,String... a){//在前面多加一個String表示至少一個字串
		//若需傳入不知數個字串用"..."不能用"[]"因為叫不到,若之前有"明確"的方法則用明確的方法
		System.out.println(a[0]);
		for(String name:a){
			System.out.println(name);
		}
	}
	static void m1(int b,String... a){//傳入時須先傳int再傳String
		//若需傳入不知數個字串用"..."不能用"[]"因為叫不到,若之前有"明確"的方法則用明確的方法
		System.out.println(a[0]);
		for(String name:a){
			System.out.print(name);
		}
	}
	static void m2(String[] a){
		//若需傳入不知數個字串用"..."不能用"[]"因為叫不到,若之前有"明確"的方法則用明確的方法
		System.out.println(a[0]);
		for(String name:a){
			System.out.println(name);
		}
	}
}
