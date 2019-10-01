package Swingpacket;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.*;

import DataManagement.PasswordGenerator;
import SwingComponents.PanelInterfrace; 

final class AddPasswordRecord extends FrameRunner implements PanelInterfrace{
		static protected JButton addButton=new JButton("GeneratePassword");
		static protected JTextField text1=new JTextField("name of portal");
		static protected JTextField text2=new JTextField("PASWOORD NAME");
		Vector<JLabel> Labels = new Vector<JLabel>();
		AddPasswordRecord()
		{
			addButton.setBounds(25,25,100, 40);//x axis, y axis, width, height  
			addComponent(addButton);
			  
		   
		    text1.setBounds(50,100, 200,30);  
		    addComponent(text1);
		    
		    text2.setBounds(30,0,200, 20); 
		    text2.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		    text2.setOpaque(true);
		    text2.setBackground(Color.RED);
		    text2.setForeground(Color.BLACK);
		    addComponent(text2);
		    
			addButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
						/**/JLabel tf1=new JLabel(); 
						
						
						
						Labels.add(tf1);
						
				       
						
				        tf1.setText(PasswordGenerator.generatePassword()+ " " + text1.getText());
				        tf1.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
				        tf1.setOpaque(true);
				        tf1.setBackground(Color.BLUE);
				        tf1.setForeground(Color.BLACK);
				        addComponent(tf1);
				        
				        
				        
				       // addButton.setBounds(50,50,100, 40);
				       
				        }  
				    });  
		}
		@Override
		public void setComponentBounds()
		{
			
	        Iterator<JLabel> currentLabel = Labels.iterator(); 
	        int yRecordTmp = 0;
	        while (currentLabel.hasNext()) { 
	        	JLabel label = currentLabel.next();
	        	yRecordTmp+=6;
	        	label.setBounds(30,20+yRecordTmp,200, 20);
	        	
	        	yRecordTmp+=20;
	        	
	        } 
	        
	        addButton.setBounds(20,50+yRecordTmp,100, 40);
	        text1.setBounds(130,50+yRecordTmp,120, 40);
	       
		}
		
		public void addComponent(JComponent var)
		{
			super.content.add(var);//adding button in JFrame
			setComponentBounds();
		}

	
	

}
