import javax.swing.*;
import java.awt.*;
class ex9_1c{
  public static void main(String[]args){
    JFrame frame = new JFrame();
    Panel panel = new Panel();
    panel.setLayout(new GridLayout(4, 1,1,1));
    frame.setTitle("Handle Event");
    frame.setSize(400,300);
    panel.add(new JLabel("Hello,My name is Jirapat Pethsuksai."));
    panel.add(new JLabel("Department of Compupter Engineering"));
    panel.add(new JLabel("Srinakharinwirot University"));
    panel.add(new JLabel("Ongkarak Nakornnayok"));
    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  }
  