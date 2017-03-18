package tw.org.iii;

public class scooter extends bike {
	scooter(){
		//super(),父類別的空建構子=bike()
		System.out.println("scooter()");		
	}
	void upSpeed(){//若裡面不寫super會直接蓋住父類別的相同名稱方法(相同參數)=overwrite
		super.upSpeed();
		speed =10;
	}
}
