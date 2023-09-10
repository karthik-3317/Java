package jframes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudeApp implements ActionListener{
	String co[]={"CHECK","INDIA","DUBAI","USA","SRILANKA","JAPAN"};
	String co1[]= {"CHECK","DUBAI","USA","SRILANKA","JAPAN"};
	JFrame jf;
	JTextField tex1,tex2,tex3;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton bn1,bn2;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2;
	JComboBox cob1,cob2;
	Container c1;
	ButtonGroup bg;
	StudeApp()
	{
		jf=new JFrame("EMIRATES PAGE");
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setBounds(100, 150, 700, 500);
		c1=jf.getContentPane();
		c1.setBackground(Color.PINK);
		
		l1=new JLabel("FROM :");
		l1.setBounds(100, 50, 150, 50);
		jf.add(l1);
		
		cob1=new JComboBox(co);
		cob1.setBounds(200, 60, 190, 30);
		jf.add(cob1);
		
		JLabel l2=new JLabel("DESTINATION :");
		l2.setBounds(100, 100, 150, 50);
		jf.add(l2);
		
		cob2=new JComboBox(co1);
		cob2.setBounds(200, 110, 190, 30);
		jf.add(cob2);
		
		JLabel l3=new JLabel("CORONA SYMPTOMS");
		l3.setBounds(100, 125, 210, 100);
		jf.add(l3);
		
		cb1 =new JCheckBox();
		cb1.setText("FEVER");
		cb1.setBounds(290, 165, 70, 20);
		jf.add(cb1);
		
		cb2 =new JCheckBox();
		cb2.setText("COLD");
		cb2.setBounds(360, 165, 70, 20);
		jf.add(cb2);
		
		cb3 =new JCheckBox();
		cb3.setText("PAINS");
		cb3.setBounds(430, 165, 70, 20);
		jf.add(cb3);
		
	    bn1=new JButton("BOOK TICKETS");
		bn1.setBounds(200,200,150,30);
		bn1.addActionListener(this);
		jf.add(bn1);
		
		 bn2=new JButton("CANCEL TICKETS");
		bn2.setBounds(350,200,150,30);
		bn2.addActionListener(this);
		jf.add(bn2);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bn1)
		{
			JOptionPane.showMessageDialog(jf,"YOU HAVE SUCCESSFULLY BOOKED YOUR TICKETS");
			
		}
		else 
		{
			jf.dispose();
		}
		
	}
	

	
}
