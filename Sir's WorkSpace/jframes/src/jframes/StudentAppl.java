package jframes;

public class StudentAppl {
}
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//public class LoginPage implements ActionListener {
//	JFrame f;
//	JLabel un,ps;
//	JTextField uname;
//	JPasswordField p;
//	JButton lg,ext;
//	LoginPage(){
//		f=new JFrame("Login Page");
//		f.setLayout(null);
//		f.setSize(700,500);
//		
//		un=new JLabel("username");
//		un.setBounds(100,100,100,70);
//		f.add(un);
//		
//		uname=new JTextField();
//		uname.setBounds(220,100,150,50);
//		f.add(uname);
//		
//		ps=new JLabel("Password");
//		ps.setBounds(100,230,100,70);
//		f.add(ps);
//		
//		p=new JPasswordField();
//		p.setBounds(220,230,150,50);
//		f.add(p);
//		
//		lg=new JButton("Login");
//		lg.setBounds(180,330,100, 50);
//		lg.addActionListener(this);
//		f.add(lg);
//		
//		ext=new JButton("EXIT");
//		ext.setBounds(380,330,100,50);
//		ext.addActionListener(this);
//		f.add(ext);
//		
//		f.setVisible(true);
//		
//	}
//
//	public static void main(String[] args) {
//		new LoginPage();
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==lg)
//		{
//			String name,pass;
//			name=uname.getText();
//			pass=new String(p.getPassword());
//			if(name.equals("klef")==true&&pass.equals("123@")==true) {
//				JOptionPane.showMessageDialog(f,"username & password is correct");
//			    System.out.println("username="+name);
//			    System.out.println("password="+pass);
//			    f.dispose();
//			    new StudAppln();
//			}
//			else
//			{
//				JOptionPane.showMessageDialog(f,"Invalid username and Password");
//				uname.setText("");
//				p.setText("");
//			}
//		}
//		else {
//			f.dispose();
//		}		
//	}
//}
//  
//
//
//package esan;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//public class StudAppln implements ActionListener{
//	JFrame sf;
//	JLabel l1,l2,l3,l4,l5;
//	JTextField t1,t2;
//	JRadioButton rb1,rb2;
//	ButtonGroup bg;
//	JComboBox cb;
//	JCheckBox c,cp,jv;
//	JButton sb,cl;	
//	String d[]= {"Select","CSE","ECE","EEE","BT","MECH"};
//   StudAppln(){
//	   sf=new JFrame("Student Application");
//	   sf.setLayout(null);
//	   sf.setSize(700,700);
//	   
//	   l1=new JLabel("Name:");
//	   l1.setBounds(100,100,100,60);
//	   sf.add(l1);
//	   
//	   t1=new JTextField();
//	   t1.setBounds(220,100,100, 70);
//	   sf.add(t1);
//	   
//	   l2=new JLabel("ID:");
//	   l2.setBounds(100, 170,100,60);
//	   sf.add(l2);
//	   
//	   t2=new JTextField();
//	   t2.setBounds(200, 170, 100, 70);
//	   sf.add(t2);
//	   
//	   l3=new JLabel("Gender:");
//	   l3.setBounds(100,250,100, 60);
//	   sf.add(l3);
//	   
//	   rb1=new JRadioButton("MALE");
//	   rb1.setSelected(true);
//	   rb1.setBounds(200, 250,100, 60);
//	   sf.add(rb1);
//	   
//	   rb2=new JRadioButton("FEMALE");
//	   rb2.setBounds(270,250, 100, 60);
//	   sf.add(rb2);
//	   
//	   bg=new ButtonGroup();
//	   bg.add(rb1);
//	   bg.add(rb2);
//	   
//	   l4=new JLabel("DEPT:");
//	   l4.setBounds(100, 330, 100, 60);
//	   sf.add(l4);
//	   
//	   cb=new JComboBox(d);
//	   cb.setBounds(220, 330,100, 60);
//	   sf.add(cb);
//	   
//	   l5=new JLabel("SKILL");
//	   l5.setBounds(100,390, 100,70);
//	   sf.add(l5);
//	   
//	   c=new JCheckBox("C");
//	   c.setBounds(220, 390, 100, 60);
//	   sf.add(c);
//	   
//	   cp=new JCheckBox("CPP");
//	   cp.setBounds(320, 390, 100, 60);
//	   sf.add(cp);
//	   
//	   jv=new JCheckBox("JAVA");
//	   jv.setBounds(430, 390, 100, 60);
//	   sf.add(jv);
//	   
//	   sb=new JButton("SUBMIT");
//	   sb.setBounds(100,470, 100, 60);
//	   sb.addActionListener(this);
//	   sf.add(sb);
//	   
//	   cl=new JButton("Cancel");
//	   cl.setBounds(270, 470, 100, 60);
//	   cl.addActionListener(this);
//	   sf.add(cl);	   
//	   sf.setVisible(true);
//   }
//@Override
//public void actionPerformed(ActionEvent e) {
//	  if(e.getSource()==sb) {
//		  System.out.println("NAME="+t1.getText());
//		  System.out.println("ID="+t2.getText());
//		  if(rb1.isSelected())
//			  System.out.println("gender="+rb1.getText());
//		  else
//			  System.out.println("Gender="+rb2.getText());
//		 System.out.println("DEPT="+(String)cb.getSelectedItem());
//		 System.out.print("SKILL");
//		 if(c.isSelected())
//			 System.out.print(" "+c.getText());
//		 if(cp.isSelected())
//			 System.out.print(" "+cp.getText());
//		 if(jv.isSelected())
//			 System.out.println(" "+jv.getText());
//		 sf.dispose();
//	  }
//	  else {
//		  sf.dispose();
//	  }
//	
//}
//}
//
//
