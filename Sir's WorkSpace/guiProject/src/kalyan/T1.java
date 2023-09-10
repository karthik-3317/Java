package kalyan;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class T1 implements ActionListener
{
	  JFrame f;
	  JButton b;
	  JTextField t1;
	  JLabel l1;
	  T1()
	  {
		  f = new JFrame("SEARCH A WORD");
		  l1=new JLabel("enter a word");
		  t1=new JTextField(10);
		  b=new JButton("search");
		  f.setVisible(true);
		  f.setLayout( new FlowLayout());
		  f.setSize(400,400);
		  f.add(l1);
		  f.add(t1);
		  f.add(b);
		  b.addActionListener(this);
	  }
		  public void actionPerformed(ActionEvent e)
		  {
			  if(e.getSource()==b)
			  {
				     
			  }
		  }
	}

