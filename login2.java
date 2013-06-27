import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.util.*;
import java.text.*; 
import javax.swing.event.*;
import javax.swing.tree.*;



public class login2 extends JFrame implements ActionListener
	
{
	
	JLabel l1,l2 ;
	
	JTextField txt,txt1;
	
	JButton submit;
	
	static String a,b;
	
		
	public login2 ()

	{
		
		//super("Login Page");
		
		Container con = getContentPane();
		JPanel p = new JPanel();

		p.setBackground(Color.ORANGE);
		p.setLocation(150, 100);
		login2.setDefaultLookAndFeelDecorated(isDefaultLookAndFeelDecorated());
		
		l1 = new JLabel("username :");

		
		
		l2 = new JLabel("password :");

		

		txt = new JTextField( 20 );
		
		 

		txt1 = new JTextField( 20 );
		
		

		submit = new JButton("Submit");
			
		
		p.add( l1 );
		p.add( txt );
		p.add( l2 );
		p.add( txt1 );
		p.add( submit );

			
		con.add(BorderLayout.CENTER,p);
	
	
		submit.addActionListener(this);
		 
		                
		setSize(300, 350);
		setLocation(250,100);
                
		show();
           
		addWindowListener(new WindowAdapter()

		{       
			
			public void windowClosing(WindowEvent e)

	
        
		{
         
			System.exit(0);
        
		}
         

	} 
	);

 
}


public void actionPerformed(ActionEvent e)

{
try{
    
	 a = txt.getText();
	 b = txt1.getText();
	
	BufferedReader reader = new BufferedReader( new FileReader("/home/login.txt"));

	
	String data;
	
	while( ( data = reader.readLine( ) ) != null )
	
	{
	
		int i;
		
		String val[ ] = data.split(",");
	 
		for(i=0;i<val.length;i++)
		 
			if(a.equalsIgnoreCase(val[i]))
		 
			{
		  
				for(i=0;i<val.length;i++)
		  
					if(b.equalsIgnoreCase(val[i]))
  
						if( e.getSource() == submit )
	
						{  
         
        
							new	popup();
                 
 
     
						}

 
 
			}
			else
			{
			  //System.out.println("Incorrect Username or Password");
			}
		
			}
	 
}	
catch(Exception e1){ System.out.println(e1);}
}





  
	public static void main(String v[])throws FileNotFoundException,IOException,AWTException

	{
 
		new login2();

	}
	
}
