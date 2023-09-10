package guiProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Login extends JFrame implements ActionListener {
JButton b1,b2,b3;
Login(){
  Container con=getContentPane();
  b1=new JButton("Transaction Details");
  b2=new JButton("Send Money");
  b3=new JButton("Apply Loan");
  b1.setSize(10,10);
  b2.setSize(10,10);
  b3.setSize(10,10);
  con.setLayout(new GridLayout(3,2));
  con.add(b1);
  con.add(b2);
  con.add(b3);
  this.pack();
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  setVisible(true);
  setSize(300,500);
  setTitle("Choice");
  con.setBackground(Color.gray);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {
  new Details("None","000.00","---","abc");
}
if(e.getSource()==b2) {
  new Money();

}
if(e.getSource()==b3) {
  new Loan();
}
}
}