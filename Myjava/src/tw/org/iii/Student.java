package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable{//student
	//implements Serializable代表可序列化
	private int ch, math, eng;
	private String name;
	public Student(String name, int ch, int math, int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
	}
	double sum(){return ch + math + eng;}
	double avg(){return sum()/3;}
}
