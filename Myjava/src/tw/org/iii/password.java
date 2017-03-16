package tw.org.iii;

import javax.swing.JOptionPane;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mis=0;
		while(true){
		String str= JOptionPane.showInputDialog("請輸入密碼");		
			if(str.matches("[a-zA-Z0-9*@_$]{6,20}")){
				System.out.println("輸入正確");
				JOptionPane.showMessageDialog(null,"輸入正確" );
				break;
			}else{
				System.out.println("輸入錯誤請,重新輸入");
				JOptionPane.showMessageDialog(null,"輸入錯誤,請輸入a-zA-Z0-9*@_$以內符號" );
				mis++;
			}
			if(mis==3){
				System.out.println("會部會太笨");
				JOptionPane.showMessageDialog(null,"會部會太笨" );
				mis=0;
				break;
			}
		}
	}

}
