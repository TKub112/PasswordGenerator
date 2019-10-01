package Swingpacket;
import SwingComponents.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JOptionPane;

import DataManagement.BackEnd;
import SwingComponents.ContentContainer;
import SwingComponents.MenuBar;

import javax.swing.JFrame;
import javax.swing.*;  
public class FrameRunner extends BackEnd{ 

static protected JFrame f=new JFrame();
static protected JButton b=new JButton("click");
static protected JPanel content = new JPanel();

public static void main(String[] args) {  
	new AddPasswordRecord();
	new MenuBar();
	
	//JScrollPane pane = new JScrollPane(content);
	//f.getContentPane().add(pane);
	new ContentContainer();
	content.setBounds(20,20,300,350);//f.setBounds(x, y, width, height);
	content.setMinimumSize(new Dimension(300,350));
	content.setForeground(Color.RED);
	content.setBackground(Color.WHITE);
	
	JScrollPane scrollableTextArea = new JScrollPane(content); 
	scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	content.setLayout(null);
	
	f.add(content);
	f.getContentPane().add(content); 
	
	frameInit();
}  

static void frameInit(){
	f.setBounds(0,0,400,500);  //f.setBounds(x, y, width, height);
	//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);  
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //f.getContentPane().setLayout(new FlowLayout());  
	f.setVisible(true);//making the frame visible 
	
	
	f.addWindowListener(new java.awt.event.WindowAdapter() {
	    @Override
	    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	       /* if (JOptionPane.showConfirmDialog(f, 
	            "Are you sure you want to close this window?", "Close Window?", 
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
	        	*/
	        	try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.exit(0);
	        }
	    
	});
}
}  

