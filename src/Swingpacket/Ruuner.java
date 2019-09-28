package Swingpacket;

import javax.swing.*;  
public class Ruuner extends BackEnd{ 
	
static protected JFrame f=new JFrame();

public static void main(String[] args) {  
	JButton b=new JButton("click");//creating instance of JButton  
	b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
	          
	f.add(b);//adding button in JFrame  
	
	f.setBounds(0,0,400,500);  //f.setBounds(x, y, width, height);
	
	new MenuBar();
	
	f.setLayout(null);//using no layout managers  
	
	f.setVisible(true);//making the frame visible  
}  
}  

