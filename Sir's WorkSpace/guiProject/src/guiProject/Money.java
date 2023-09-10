package guiProject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Money extends JFrame implements ActionListener {
JPanel p1,p2;
JTextField t1,t2;
JLabel l1,l2,l3;
JButton b1,b2;
Money(){
  Container con=getContentPane();  
  con.setLayout(new GridLayout(2,1));
  p1=new JPanel();
  p2=new JPanel();
  p1.setBackground(Color.green);
  p2.setBackground(Color.yellow);
  p2.setLayout(new FlowLayout());
  con.add(p1);
  con.add(p2);
  t1=new JTextField(30);
  t2=new JTextField(30);
  l1=new JLabel("Account Number of Reciever");
  l2=new JLabel("Amount");
  l3=new JLabel("Send Money");
  p1.add(l3);
  b1=new JButton("Send");
  b2=new JButton("Reset");
  setVisible(true);
  setSize(500,600);
  setTitle("Send Money");
  p2.add(l1);
  p2.add(t1);
  p2.add(l2);
  p2.add(t2);
  p2.add(b1);
  p2.add(b2);
  this.pack();
  b1.addActionListener(this);
  b2.addActionListener(this);
}
  public void actionPerformed(ActionEvent e) {
    String tacc,tamo;
    double acc,amo;
  if(e.getSource()==b1) {
    tacc=t1.getText();
    acc=Double.parseDouble(tacc);
    tamo=t2.getText();
    amo=Double.parseDouble(tamo);
    if(acc>100 && amo>0) 
    {
      JOptionPane.showMessageDialog(null,"Succesfully Sent Money");
      setVisible(false);
      new Details(tacc,tamo,"Sent","abc");
    }
    else
      JOptionPane.showMessageDialog(null,"Invalid");
  }
  if(e.getSource()==b2) {
    t1.setText("");
    t2.setText("");
  }
  }
}