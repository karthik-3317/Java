package kalyan;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.JTextComponent;

public class ProjectF2 implements ActionListener
{
	JFrame f;
	JButton b1,b2,b3;
	ProjectF2()
	{
		f=new JFrame(" Document ");
	      b1=new JButton("open doc");
	     b2=new JButton("search and highlight word");
	  b3=new JButton("highlighted words file");
	  f.add(b1);
	  f.add(b2);
	  f.add(b3);
	  b1.addActionListener((ActionListener) this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  f.setVisible(true);
	  f.setLayout(new FlowLayout());
	  f.pack();
	  
	}
	public  void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
				JFrame frame = new JFrame();
				frame.setLayout(new BorderLayout());
				final JTextArea jta = new JTextArea("Lost rain wandering parking lots and highways in search of the earth. Down-on-its-luck rain watering plastic petunias on a twentieth-floor balcony. Angry rain condemned to storm sewers, denied rivers. Rebellious rain. Tried to rally ducks and frogs to rise up when their marsh was bulldozed for bungalows. Didn’t work. Tired rain.\r\n"
						+ "\r\n"
						+ "Here, old neighbor rain. Fickle friend rain. Trickling deep to farmers who’ve become dirt, white finger bones point and skulls grumble: “Where were you, prayed-for rain?” Regretful rain, that corn withered, cattle and children went thirsty. Sorrowful, as if a downpour would help now.\r\n"
						+ "\r\n"
						+ "Dying rain, mossy and misty-eyed.d");
				frame.add(jta, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
				frame.pack();
				frame.setVisible(true);
				}
		else if(e.getSource()==b2)
		{
			  JFrame f;
			  JButton b;
			  JTextField t1;
			  JLabel l1;
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
		else if(e.getSource()==b3)
		{
			JFrame frame = new JFrame();
			frame.setLayout(new BorderLayout());
			final JTextArea jta = new JTextArea("Highlighted words");
			JButton btn = new JButton("Add");
			btn.addActionListener((ActionListener) new ActionListener()
			{
			    public void actionPerformed1(ActionEvent e) 
			    {
			        JTextComponent jta1;
					int pos = jta1.getCaretPosition();
			        ((JTextArea) jta1).insert("Some more", pos); 
			    }

				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					
				}            
			});
			frame.add(jta, BorderLayout.CENTER);
			frame.add(btn, BorderLayout.SOUTH);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
			frame.pack();
			frame.setVisible(true);
			}		
}
	public static void main(String args[])
	{
		new ProjectF2();
    
	}
}

