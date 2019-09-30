package Swingpacket;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.*; 

final class AddPasswordRecord extends FrameRunner {
		static protected JButton addButton=new JButton("GeneratePassword");
		Vector<JLabel> Labels = new Vector<JLabel>();
		AddPasswordRecord()
		{
			addButton.setBounds(25,25,100, 40);//x axis, y axis, width, height  
			super.content.add(addButton);//adding button in JFrame
			
			addButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
						/**/JLabel tf1=new JLabel(); 
						Labels.add(tf1);
						
				        tf1.setBounds(50,50,150,150);
				        content.add(tf1);
				        tf1.setText("aa");
				        tf1.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
				        tf1.setOpaque(true);
				        tf1.setBackground(Color.RED);
				        tf1.setForeground(Color.WHITE);
				        
				        SetBounder();
				        addButton.setBounds(50,50,100, 40);
				       
				        }  
				    });  
		}
		
		final private void SetBounder()
		{
			 // Creating an iterator 
	        Iterator<JLabel> currentLabel = Labels.iterator(); 
	        int yRecordTmp = 0;
	        while (currentLabel.hasNext()) { 
	        	JLabel label = currentLabel.next();
	        	label.setBounds(50,20+yRecordTmp,100, 100);
	        	label.setSize(100, 150);;
	        	yRecordTmp+=20;
	        	
	        } 
	        
	        addButton.setBounds(50,50+yRecordTmp,100, 40);
	        
		}
		
		
	
		
		/*public void actionPerformed(ActionEvent e){  
		    JTextField tf1=new JTextField();  
	        tf1.setBounds(50,50,150,20);
	        f.add(tf1);
	        }  
	*/
	
	

}
