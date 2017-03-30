package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton; 
import javax.swing.JDialog; 
import javax.swing.JFileChooser; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants; 
  
public class JFilechooser02Homework  { 
	private JButton open ,save,exit;
	private JTextArea textArea;
	private JFrame frame;
	public JFilechooser02Homework(){
		frame= new JFrame("選擇資料"); ;
		frame.setLayout(new FlowLayout()); 
		frame.setLayout(new BorderLayout()); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		open = new JButton("open"); 
		save = new JButton("save");
	    exit = new JButton("exit");
	    JPanel top=new JPanel(new FlowLayout());
		top.add(open);top.add(save);top.add(exit);
		frame.add(top,BorderLayout.NORTH);//alt+/可看提示視窗
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)  
			{ 
			JFileChooser fileChooser = new JFileChooser();//宣告filechooser 
			int returnValue = fileChooser.showOpenDialog(null);//叫出filechooser 
				if (returnValue == JFileChooser.APPROVE_OPTION) //判斷是否選擇檔案 
				{ 
				File selectedFile = fileChooser.getSelectedFile();//指派給File 
				try{
					FileReader fr1 = new FileReader(selectedFile);
					BufferedReader br = new BufferedReader(fr1);
					String temp;
						while((temp=br.readLine())!=null){
						textArea.append(temp);
							
						}
					}catch(Exception ee){
						System.out.println(ee.toString());
					}
				
				//System.out.println(selectedFile.getName()); //印出檔名 
				} 
			} 
		}); 				
		frame.setSize(640, 480);
			
		initArea();
		frame.setVisible(true);
	}	
	public void initArea(){
    	textArea = new JTextArea();
		textArea.setFont(new Font("細明體",Font.PLAIN, 16));
		textArea.setLineWrap(true);//會偵測是否換行
		JScrollPane panel = new JScrollPane(textArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);//因會自動換行,所以不用
		frame.getContentPane().add(panel, BorderLayout.CENTER);        
	}
	public static void main(String[] args)  
	{  
		new JFilechooser02Homework();
	}
} 


