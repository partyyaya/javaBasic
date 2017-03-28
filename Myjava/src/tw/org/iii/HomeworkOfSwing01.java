package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class HomeworkOfSwing01 extends JFrame {
	private JMenuBar menuBar;
	private JMenu fileMenu,editMenu,aboutMenu;
	private JMenuItem Open,Save,SaveAs,Close,Cut,Copy,Paste,About;
	private JTextArea textArea = new JTextArea();
	
	public HomeworkOfSwing01(){
		 initComponents();
	        initEventListeners();
	}		
	    private void initComponents() {
	        setTitle("新增純文字檔案");
	        setSize(400, 300);
	        initFileMenu();  	        
	        initEditMenu();        
	        initAboutMenu();
	        initMenuBar();
	        initArea();
	    }
	    public void initArea(){
			textArea.setFont(new Font("細明體",Font.PLAIN, 16));
			textArea.setLineWrap(true);//會偵測是否換行
			JScrollPane panel = new JScrollPane(textArea,
	                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);//因會自動換行,所以不用
			getContentPane().add(panel, BorderLayout.CENTER);
	        
		}
	    private void initMenuBar() {
	        // 選單列
	        menuBar = new JMenuBar();
	        menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        menuBar.add(aboutMenu);
	        // 設置選單列
	        setJMenuBar(menuBar);
	    }

	    private void initAboutMenu() {
	        // 設置「關於」選單
	        aboutMenu = new JMenu("關於");
	        About = new JMenuItem("關於JNotePad");
	        aboutMenu.add(About);
	    }

	    private void initEditMenu() {
	        // 設置「編輯」選單
	        editMenu = new JMenu("編輯");
	        Cut = new JMenuItem("剪下");
	        Copy = new JMenuItem("複製");
	        Paste = new JMenuItem("貼上");
	        
	        editMenu.add(Cut);
	        editMenu.add(Copy);
	        editMenu.add(Paste);
	    }

	    private void initFileMenu() {
	        // 設置「檔案」選單
	        fileMenu = new JMenu("檔案");
	        Open = new JMenuItem("開啟舊檔");
	        Save = new JMenuItem("儲存檔案");
	        SaveAs = new JMenuItem("另存新檔");
	        Close = new JMenuItem("關閉");
	        
	        fileMenu.add(Open);
	        fileMenu.addSeparator(); // 分隔線
	        fileMenu.add(Save);
	        fileMenu.add(SaveAs);
	        fileMenu.addSeparator(); // 分隔線
	        fileMenu.add(Close);
	    }

	    private void initEventListeners() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        initAccelerator();
	    }

	    private void initAccelerator() {
	        // 快速鍵設置
	        Open.setAccelerator(
	                KeyStroke.getKeyStroke(
	                        KeyEvent.VK_O,
	                        InputEvent.CTRL_MASK));
	        Save.setAccelerator(
	                KeyStroke.getKeyStroke(
	                        KeyEvent.VK_S,
	                        InputEvent.CTRL_MASK));
	        Close.setAccelerator(
	                KeyStroke.getKeyStroke(
	                        KeyEvent.VK_Q,
	                        InputEvent.CTRL_MASK));
	        Cut.setAccelerator(
	                KeyStroke.getKeyStroke(KeyEvent.VK_X,
	                        InputEvent.CTRL_MASK));
	        Copy.setAccelerator(
	                KeyStroke.getKeyStroke(KeyEvent.VK_C,
	                        InputEvent.CTRL_MASK));
	        Paste.setAccelerator(
	                KeyStroke.getKeyStroke(KeyEvent.VK_V,
	                        InputEvent.CTRL_MASK));
	                 		
	    }
	public static void main(String[] args){		
		SwingUtilities.invokeLater(() -> {
        	new HomeworkOfSwing01().setVisible(true);
        });	 		
	}	
}

