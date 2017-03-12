package tw.org.iii;

public class bike {
	private double speed;//private:不讓使用者知道
	void upSpeed(){
		speed=(speed<1)?1:(speed*1.2);
	}
	void downSpeed(){
		speed*=0.7;	
	}
	double getSpeed(){
		return speed;
	}
}
