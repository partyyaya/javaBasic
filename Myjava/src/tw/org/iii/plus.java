package tw.org.iii;

public class plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,sum=0;
		while(a<=100){
			sum+=a++;	//sum+=a;a++;					
		}		
		System.out.println(sum);
		System.out.println("----------");
		sum=0;
		for(a=1;a<=100;a++){
			sum+=a;
		}
		System.out.println(sum);
	}
}
