package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable{//student
	//implements Serializable代表可序列化
	private int ch,eng;
	private transient int math;//transient表示不序列化,當解序列時math視為0分(double型態 0.0)
	private String name;
	private Car car;
	public Student(String name, int ch, int math, int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
		car=new Car();//裡面物件必須序列化,不然會出現例外
	}
	void getname(){
		System.out.println(name);
	}
	double sum(){return ch + math + eng;}
	double avg(){return sum()/3;}
}
class Car implements Serializable{
	
}