import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import javax.swing.*;

import java.awt.image.*;
import javax.imageio.*;
import java.util.*;
import java.text.*; 
import javax.swing.event.*;
import javax.swing.tree.*;



class popup extends JFrame
	

{
      
	
	JButton start,stop;
	JTextField del;
	static boolean flag=false; 	
		
	@SuppressWarnings("deprecation")
	public popup()
	   
	{
	     
		super("popup");
	    
		Container con = getContentPane();
		JPanel p = new JPanel();

		p.setBackground(Color.MAGENTA);
		p.setLocation(250,300);
		           
	         
		start = new JButton("start");
             
		stop = new JButton("stop");
		
		del = new JTextField(20);
		del.setToolTipText("Enter time in milli seconds. Eg: 1 s = 1000 ms");
		
		con.add(BorderLayout.CENTER,p);
		
		setSize(300 , 350 );
		setLocation(550,100);
             
		//setLayout( new FlowLayout());
        
		p.add(del);
		
		p.add(start);
        		
		p.add(stop);
				           
	//	start.addActionListener(this); 
			
		start.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e)

		        {

                flag = true;

                 while(flag == true )
                 {
                         
                         simplethread s1 = new simplethread();
                           	
			try {


					Thread.sleep(Integer.parseInt(del.getText()));
					
			} catch (InterruptedException e1) {

				// TODO Auto-generated catch block

				e1.printStackTrace();

			}
				 } } }

		);

	             
	//	stop.addActionListener(this); 
		stop.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent le){
        flag=false;
        System.exit(0);
        }
        }
        );		
		   	
		show();
	   
	}
	

	

/*	public void actionPerformed(ActionEvent e)
	
	{
	
		flag = true;
	//System.out.println("hi");
		 while(flag != false )
		 {
			 if( e.getSource() == start )
				
				{  
			 simplethread s1 = new simplethread();
			try {



Thread.sleep(Integer.parseInt(del.getText()));
					
			
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 }
		
	
		    
	

	
		if ( e.getSource() == stop )

		{
			flag = false;
			System.exit(0);

		}

	
	} }
*/

/*	stop.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent le){
	flag=false;
	System.exit(0);
	}
	}	
	);

*/

	public static void main(String v[]) throws  InterruptedException

	{
 
		popup p1 = new popup();

	}
	
	
	
	
}

