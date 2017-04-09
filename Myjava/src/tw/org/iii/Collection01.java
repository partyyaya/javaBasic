package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Collection01 {

	public static void main(String[] args) {
		
		Bike00 b1 = new Bike00();
		HashSet set = new HashSet();//is a set >> is a collection
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");//可放入字串與數字
		System.out.println(i1);//會自動呼叫物件裡的toString方法
		System.out.println(b1);//會自動呼叫物件裡的toString方法
		int ii3 = 56;
		Integer i3 =ii3;//會建構出物件(i3)=aotoboxing自動裝箱,並把值56傳入
		System.out.println(i3);//會呼叫i3.toString
		//------------------------------------------------//
		set.add(ii3);//ii3 => autoboxing =>新創integer物件
		set.add(i2);//add進去會按照HashSet裡的規則排放,非原本順序
		System.out.println(set.size());//2
		System.out.println(set);//[56,123]
		//-----------------------------------------------//
		Iterator it = set.iterator();//使用疊代
		while(it.hasNext()){//將裡面的東西一個個顯出
			Object obj= it.next();
			Integer i=(Integer)obj;
			System.out.println(i.floatValue());
		}
		//-----------------------------------------------//
		for(Object obj:set){//將裡面的物件一個個顯出,因set為collection
			System.out.println(obj);
			//obj會自動轉型,因ii3為int,i3為integer,所以沒有.0(有父子關係)
			//若裡面東西讓object無法轉型則無發輸出(轉型失敗)
		}
	}
}
class Bike00{
	@Override
	public String toString() {
		
		return "ming";
	}
}