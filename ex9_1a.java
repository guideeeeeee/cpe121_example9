import javax.swing.*;
import java.awt.FlowLayout;
class ex9_1a{
  public static void main(String[]args){
    JFrame frame = new JFrame();
    JPanel p = new JPanel(); 
    JButton ok = new JButton("OK");
    JButton cl = new JButton("Cancel");
    JButton ex = new JButton("Exit");

    frame.setTitle("Handle Event");
    frame.setSize(400,100);
    frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    frame.add(new JLabel("Name"));
    frame.add(new JTextField(10));
    
    p.add(ok); p.add(cl); p.add(ex);
    frame.add(p);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  }
  