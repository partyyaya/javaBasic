package tw.org.iii;

import javax.swing.JOptionPane;

public class RegularExpression {

	public static void main(String[] args) {
		String email;		
			 email = JOptionPane.showInputDialog("請輸入信箱");
			if(email.matches("^\\w{1,20}@[a-z]{5}.com[.tw]{0,3}$")){
				System.out.println("true");
			}else{
				System.out.println("false");
			}			
	}
}
