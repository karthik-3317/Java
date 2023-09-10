package kalyan;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
public class ProjectF1 {

	public static void main(String args[])
	{
	JLabel l=new JLabel("BIBLIOPHILE");
	l.setBounds(100,100,100,100);
	l.setFont(new Font("Times New Roman", Font.PLAIN, 60));
	JFrame f=new JFrame("WELCOME");
	f.setVisible(true);
	f.setLayout(new GridLayout(2,1));
	f.setSize(400,400);
	f.add(l,BorderLayout.CENTER);
	l.setSize(50,50);
	ImageIcon img=new ImageIcon("C:\\Users\\123pv\\OneDrive\\Desktop\\b2.jfif");
	f.add(new JLabel(img),BorderLayout.SOUTH);
	}
	}


