package tw.org.iii;

import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.File; 
  
import javax.swing.JButton; 
import javax.swing.JDialog; 
import javax.swing.JFileChooser; 
import javax.swing.JFrame; 
  
public class JFilechooser01 { 
public static void main(String[] args)  
{  
JFrame frame = new JFrame("JFileChooserDemo"); 
frame.setLayout(new FlowLayout()); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
JButton button = new JButton("open"); 
button.addActionListener(new ActionListener()  
{ 
	public void actionPerformed(ActionEvent ae)  
	{ 
	JFileChooser fileChooser = new JFileChooser();//宣告filechooser 
	int returnValue = fileChooser.showOpenDialog(null);//叫出filechooser 
		if (returnValue == JFileChooser.APPROVE_OPTION) //判斷是否選擇檔案 
		{ 
		File selectedFile = fileChooser.getSelectedFile();//指派給File 
		System.out.println(selectedFile.getName()); //印出檔名 
		} 
	} 
}); 
frame.add(button); 
frame.pack(); 
frame.setVisible(true); 
} 
} 

