package tw.org.iii;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "qwe";//String無法繼承因有final
		String s2 = s1;//會指向s1
		System.out.println(s1==s2);
		s1="mary";//s1會另外設記憶體,名叫mary
		System.out.println(s1==s2);//false
		System.out.println(s1.concat("123"));//空出記憶體來放新的延長字串
		System.out.println(s1);
		System.out.println(s1.replace('a', 'A'));//空出記憶體來放替換的延長字串
		System.out.println(s1);
	}
}
