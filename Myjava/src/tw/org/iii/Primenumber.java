package tw.org.iii;

import javax.swing.JOptionPane;

public class Primenumber {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("請輸入數字");
		int number=Integer.parseInt(input);
		for(int i=1;i<=number;i++){
			int sum=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					sum++;
				}
			}
			if(sum==2){
				System.out.print(i+"*"+"\t");
			}else
			System.out.print(i+"\t");
			if(i%10==0){
				System.out.println();
			}
			
		}

	}

}
