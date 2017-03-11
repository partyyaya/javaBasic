package tw.org.iii;

public class ming01 {

	public static void main(String[] args) {
		
			
			int[] a=new int[6];
			int dice;
			for(int i=0;i<1000000;i++){
				dice = (int)(Math.random()*9);
				a[(dice>=6)?dice-3:dice]++;
			}
				for(int j=0;j<6;j++){
					System.out.println("第"+(j+1)+"點 出現"+a[j]+"次");
				}
							
		}	
	}	

