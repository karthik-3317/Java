package jframes;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;
public class Page {
	public static void main(String [] args)
	{
		JFrame frame=new JFrame();
		JLabel label=new JLabel();
		label.setBounds(50,100,200,60);
		label.setText("USER NAME");
		frame.add(label);
		JTextField field =new JTextField();
		frame.setBounds(100, 100, 1000, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=frame.getContentPane();
		frame.add(field);
		field.setText("enter something ");
		field.setBounds(150,100,200,60);
		Font font=new Font("Arial",Font.ITALIC,25);
		field.setFont(font);
		field.setForeground(Color.GREEN);
		field.setBackground(Color.BLUE);
		field.setEditable(true);
		JPasswordField pass=new JPasswordField();
		frame.add(pass);
		JLabel la=new JLabel();
		frame.add(la);
		la.setText("PASSWORD");
		la.setBounds(50, 250, 100, 60);
		pass.setText("karthik");
		pass.setBounds(150,250,200,50);
		pass.setBackground(Color.BLUE);
		pass.setForeground(Color.GREEN);
		frame.setTitle("MY JAVA FRAMES");
	}
}