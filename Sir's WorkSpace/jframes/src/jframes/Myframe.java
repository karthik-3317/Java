package jframes;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Myframe implements ActionListener {
	JFrame frame;
	Container c;
	JTextField field;
	JLabel label,label2,label3;
	JButton btn,btn2;
	JPasswordField field2;
	Myframe()
	{
		 frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    c= frame.getContentPane();
		c.setBackground(Color.PINK);
		
		frame.setBounds(100, 200, 700, 500);
		frame.setTitle("EMIRATES LOGIN PAGE");
		frame.setLayout(null);
		
		 field=new JTextField();
	     field2=new JPasswordField();
		 label=new JLabel();
		
		frame.add(label);
		label.setText("USER NAME :");
		label.setBounds(130, 100, 150, 80);
		
		 label2=new JLabel();
		frame.add(label2);
		label2.setText("PASSWORD :");
		label2.setBounds(130, 180, 150, 80);
		
		 label3=new JLabel();
		frame.add(label3);
		label3.setText("EMIRATES");
		
		Font font3=new Font("Arial",Font.BOLD,45);
		Font font=new Font("Arial",Font.BOLD,20);
		Font font2=new Font("Arial",Font.BOLD,20);
		
		label3.setFont(font3);
		label3.setForeground(Color.BLUE);
		label3.setBackground(Color.GREEN);
		label3.setBounds(240, 30, 300, 80);
		
		label.setForeground(Color.RED);
		label.setFont(font);
		
		label2.setForeground(Color.RED);
		label2.setFont(font2);
		
		frame.add(field);
		field.setBounds(290, 125, 170, 30);
		
		frame.add(field2);
		field2.setBounds(290, 200, 170, 30);
		
		btn =new JButton();
		frame.add(btn);
		btn.setText("LOGIN");
		btn.setBounds(180, 300, 120, 50);
		btn.addActionListener(this);
		
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		btn.setCursor(cur);
		
	    btn2 =new JButton();
		frame.add(btn2);
		btn2.setText("SIGN UP");
		btn2.addActionListener(this);
		btn2.setBounds(370, 300, 120, 50);
		
		Cursor cur2=new Cursor(Cursor.HAND_CURSOR);
		btn2.setCursor(cur2);
	
	}
	public static void main(String [] args)
	{
		new Myframe();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn)
		{
			String name,pass;
			name=field.getText();
			pass=new String(field2.getPassword());
			if(name.equals("karthik")==true && pass.equals("2004")==true) {
				JOptionPane.showMessageDialog(frame,"username & password is correct");
				System.out.println("username="+name);
				System.out.println("Password="+pass);
				frame.dispose();
				new StudeApp();
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "DETAILS ARE INCORRECT");
				field.setText(" ");
				field2.setText(" ");
			}
		}
		else {
			
			JOptionPane.showMessageDialog(frame,"START YOUR JOURNEY WITH EMIRATES  ");
		}
	}
}
