package SwingComponents;

import javax.swing.*;

import Swingpacket.FrameRunner;

import java.awt.event.*;    
/**
 * Class adding new menu bar
 * 
 * 
 * @author Tobiasz
 *
 */
public class MenuBar extends FrameRunner implements ActionListener{ 
	public JMenuBar mb;    
	public JMenu account;    
	public JMenuItem changeuser,logout;
	
	public MenuBar(){
	
	mb=new JMenuBar();  
	
	account=new JMenu("account");
	changeuser=new JMenuItem("change user");    
	logout=new JMenuItem("logout");   
	changeuser.addActionListener(this);
	
	account.add(changeuser);account.add(logout);
	mb.add(account);
	super.f.add(mb);
	super.f.setJMenuBar(mb);
	}

	
	public void actionPerformed(ActionEvent e) {    
		
	} 

}