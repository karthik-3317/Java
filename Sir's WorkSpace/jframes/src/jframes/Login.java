package jframes;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class Login
{
	public static void main(String[] args)
	{
	JFrame frame =new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,1000,500);
	frame.setTitle("KVSS PAVAN ADITYA");
	Container c= frame.getContentPane();
	c.setBackground(Color.BLUE);
	frame.setResizable(false);
	JLabel label =new JLabel("USERNAME");
	frame.setLayout(null);
	label.setBounds(100,50,100,30);
	frame.add(label);
	JLabel la=new JLabel("PASSWORD");
	la.setBounds(100, 100, 100, 30);
	JLabel laa=new JLabel("YOHANI");
	laa.setBounds(200,50,100,90);
	frame.add(laa);
	frame.add(la);
	}
}
