package jframes;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.*;
public class Button {
	public static void main(String [] args)
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBounds(100,100, 700, 500);
		frame.setVisible(true);
		JButton btn=new JButton();
		btn.setBounds(100,100,100,50);
		frame.add(btn);
		btn.setText("LOGIN");
//		Font font=new Font("Arial",Font.ITALIC,20);
//		btn.setFont(font);
//		btn.setForeground(Color.ORANGE);
//		btn.setBackground(Color.YELLOW);
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		btn.setCursor(cur);
		btn.setVisible(true);
		btn.setEnabled(true);
	}
}