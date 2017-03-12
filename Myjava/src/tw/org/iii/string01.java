package tw.org.iii;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("abc");
		String b=new String("abc");
		String c="abc";
		String d="abc";
		String e=a;
		System.out.println(a==e);//因指向相同位址
		System.out.println(c==d);//因指向相同位址
		System.out.println(a==b);//因指向不同位址
		System.out.println(a.equals(b));//內容依樣
	}

}
