package jframes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginPage implements ActionListener{
	JFrame f;
	JLabel un,ps;
	JTextField uname;
	JPasswordField p;
	JButton lg,ext;
	LoginPage()
	{
		f=new JFrame("Login page");
		f.setLayout(null);
		f.setSize(700,500);
		un=new JLabel("username");
		un.setBounds(100,100,100,70);
		f.add(un);  //adding into frame
		
		uname=new JTextField();
		uname.setBounds(220,100,150,50);
		f.add(uname);
		
		ps=new JLabel("Password");
		ps.setBounds(100,230,100,70);
		f.add(ps);
		
		p=new JPasswordField();
		p.setBounds(220,230,150,50);
		f.add(p);
		
		lg=new JButton("Login");
		lg.setBounds(180,330,100,50);
		lg.addActionListener(this);
		f.add(lg);
		
		ext=new JButton("Exit");
		ext.setBounds(380,330,100,50);
		ext.addActionListener(this);
		f.add(ext);
		
		f.setVisible(true);
		
	}
	public static void main(String [] args)
	{
		
		new LoginPage();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==lg)
		
		{
			String name,pass;
			name=uname.getText();
			pass=new String(p.get Password());
			if(name.equals("Karthik")==true && pass.equals("15072004KA")==true) {
				JOptionPane.showMessageDialog(f,"username & password is correct");
				System.out.println("username="+name);
				System.out.println("Password="+pass);
			}
			else
			{
				JOptionPane.showMessageDialog(f, "Invalid username and passoword");
				uname.setText(" ");
				p.setText(" ");
			}
		}
		else {
			f.dispose();
		
		}
	}
}
