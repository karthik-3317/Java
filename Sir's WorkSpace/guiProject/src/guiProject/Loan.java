package guiProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Loan extends JFrame implements ActionListener {
JPanel p1,p2,p3;
JLabel l1,l2;
JButton b1,b2;
JRadioButton r1;
JTextField t1;
Loan(){
  Container con=getContentPane();
  con.setLayout(new GridLayout(3,1));
  ImageIcon i=new ImageIcon("D:\\money1.jpg");
  JLabel p=new JLabel(i);
  p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
  p1=new JPanel();
  p1.setBorder(BorderFactory.createLineBorder(Color.black));
  p2=new JPanel();
  p3=new JPanel();
  p1.add(p);
  p1.setBackground(Color.cyan);
  p2.setBackground(Color.orange);
  p3.setBackground(Color.orange);
  con.add(p1);
  con.add(p2);
  con.add(p3);
  setTitle("Loan Application");
  l1=new JLabel("Apply for Loan");
  p1.add(l1);
  l2=new JLabel("Amount to be loaned");
  t1=new JTextField(30);
  p2.add(l2);
  p2.add(t1);
  r1=new JRadioButton("Confirm for Loan to be Applied");
  p2.add(r1);
  b1=new JButton("Apply for Loan");
  b2=new JButton("Reset");
  p3.add(b1);
  p3.add(b2);
  setVisible(true);
  setSize(300,500);
  this.pack();
  b1.addActionListener(this);
  b2.addActionListener(this);
}
  public void actionPerformed(ActionEvent e) {
    String am;
    am=t1.getText();
    double amo=Double.parseDouble(am);
    if(e.getSource()==b1) {
      if(amo>0) {
        JOptionPane.showMessageDialog(null,"Succesfully Applied for Loan");  
        setVisible(false);
        new Details("2100xxx369",am,"Recieved");
      }
      else
        JOptionPane.showMessageDialog(null,"Invalid");  
    }
        if(e.getSource()==b2) {
          t1.setText("");
        }
  }

}