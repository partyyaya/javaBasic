package tw.org.iii;

import java.util.Arrays;

public class praticepoke {
/*
 使用boolean陣列與poker陣列並行依序檢查是否有錯誤
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[52];
		int []poker=new int[52];
		int temp;
		for(int i=0;i<52;i++){
			do{
				temp=(int)(Math.random()*52);
				
			}
			while(check[temp]);
				poker[i]=temp;
				check[temp]=true;	
		}
		int[][]player=new int[4][13];
		for(int i=0;i<poker.length;i++){
			player[i%4][i/4]=poker[i];
		}
		System.out.println("----------");
		String[] suits={"黑桃","愛心","方塊","梅花"};
		String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int[] k:player){
			Arrays.sort(k);
			for(int v:k){
				
				System.out.print(suits[v/13]+number[v%13]+" ");
			}
			System.out.println();
		}
	}
}
