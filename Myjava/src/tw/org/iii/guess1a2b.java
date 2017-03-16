package tw.org.iii;

import javax.swing.JOptionPane;

public class guess1a2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = creatanswer(3);
		System.out.println(answer);
		boolean iswinner=false;
		for (int i=0; i<1; i++){
			// 2-1. input a number string
			String guess = JOptionPane.showInputDialog("猜一個數字");
			
			// 2-2. compare string => result
			String result = checkAB(answer, guess); 
			JOptionPane.showMessageDialog(null, result);
			if(result.equals("3A0B")){
				iswinner=true;
				break;
			}
			
			// 2-3. WINNER -> break
			// 2-4. repeat 10 times > LOSSER
		}
		if(iswinner)
			JOptionPane.showMessageDialog(null, "恭喜答對");
		else
			JOptionPane.showMessageDialog(null, "答錯嚕"+answer);
			
	}
	static String creatanswer(int d){
		boolean[] check = new boolean[10];	// 0 - 9: false
		int[] poker = new int[d]; // 0-2: 0
		int temp; 
		for (int i=0; i<poker.length; i++){
			do{
				temp = (int)(Math.random()*10);
				
			}while (check[temp]);
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker) ret += v;
		
		return ret;
	}
//只要是 static 修飾的變數、函式，都屬類別所有，即無法經由物件呼叫來存取與使用，必須透過該類別的名稱來呼叫才行。
//static類似於function自由使用
static String checkAB(String a, String g){
		int A=0,B=0;
		for(int i=0;i<g.length();i++){
			if(g.charAt(i)==a.charAt(i)){
				A++;}
			else if (a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A+"A"+B+"B";
	}
}
