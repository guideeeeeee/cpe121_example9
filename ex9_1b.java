import javax.swing.*;
import java.awt.*;
class ex9_1b{
  public static void main(String[]args){
    JFrame frame = new JFrame();
    JPanel mainpanel = new JPanel(); 
    mainpanel.setLayout(new BorderLayout()); // default for start setting border later.
    
    frame.setTitle("Handle Event");
    frame.setSize(400,100);

    JButton ok = new JButton("OK");
    JButton cl = new JButton("Cancel");
    JButton ex = new JButton("Exit");

    JPanel topPanel = new JPanel();
    topPanel.setLayout(new BorderLayout());
    mainpanel.add(topPanel,BorderLayout.CENTER);
    topPanel.add(new JLabel("Name"),BorderLayout.WEST);
    topPanel.add(new JTextField(10),BorderLayout.CENTER);

    JPanel panelButton = new JPanel();
    panelButton.setLayout(new BorderLayout());
    mainpanel.add(panelButton,BorderLayout.SOUTH);
    panelButton.add(ok,BorderLayout.WEST);
    panelButton.add(cl,BorderLayout.CENTER); 
    panelButton.add(ex,BorderLayout.EAST);

    frame.add(mainpanel);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  }
  