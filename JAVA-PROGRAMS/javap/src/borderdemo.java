
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;


public class borderdemo extends JFrame{

	JButton b1,b2,b3,b4;
	borderdemo()
	{
		Container c=getContentPane();     
		c.setLayout(new FlowLayout());
		b1=new JButton("Raised Bevel Borer");
		b2=new JButton("Lowered Bevel Border");
		b3=new JButton("Raised Etched Border");
		b4=new JButton("Lowered Etched Border");
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.red, Color.yellow); 
		b1.setBorder(bd);
		bd=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		b2.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red,Color.yellow);
		b3.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		b4.setBorder(bd);
		c.add(b1);
		c.add(b2);
		c.add(b3); 
		c.add(b4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
		
		public static void main(String args[])
		{
			borderdemo obj=new borderdemo();
			obj.setTitle("Borders");
			obj.setSize(500,400);
			obj.setVisible(true);
		}

	}


