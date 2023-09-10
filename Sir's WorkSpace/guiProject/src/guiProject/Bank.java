package guiProject;
import javax.swing.*;
import javax.swing.ImageIcon; 
import java.io.*; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
import java.awt.event.*;
import java.awt.*;
class Bank extends JFrame implements ActionListener {
JPanel p1,p2,p3;
JLabel l1,l2,l3;
JTextField t1;
JPasswordField pwd1;
JButton b1,b2;
Bank(){
  p1=new JPanel();
  p2=new JPanel();
  p3=new JPanel();
  Container con=getContentPane();
  con.setLayout(new GridLayout(3,1));
//  pic.setSize(1,2);
  setTitle("ABC Bank");
  con.add(p1);
  con.add(p3);
  con.add(p2);
  p1.setBackground(Color.cyan);
  p1.setPreferredSize(getMinimumSize());
  p2.setBackground(Color.RED);
  l1=new JLabel("Welcome to ICICI Bank");
  l1.setSize(250,260);
  p1.setLayout(new FlowLayout());
  p1.add(l1);
  p3.setBackground(Color.black);
  l2=new JLabel("Username");
  l3=new JLabel("Password");
  t1=new JTextField(30);
  pwd1=new JPasswordField(30);
  b1=new JButton("Login");
  b2=new JButton("Reset");
  p2.setLayout(new GridLayout(3,2));
  p2.add(l2);
  p2.add(t1);
  p2.add(l3);
  p2.add(pwd1);
  p2.add(b1);
  p2.add(b2);
  this.pack();
  b1.addActionListener(this);
  b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
  String user,pw;
  if(e.getSource()==b1) {
    user=t1.getText();
    pw=new String(pwd1.getPassword());
    if(user.equals("abc")&&pw.equals("1234")) {
      new Login();
      setVisible(false);
      }
    else
      JOptionPane.showMessageDialog(null,"Invalid, Please check again");
  }
  if(e.getSource()==b2) {
    t1.setText("");
    pwd1.setText("");
  }
}
public static void main(String[] args) {
  Bank b=new Bank();
  b.setVisible(true);
  b.setSize(800,400);
}
}
