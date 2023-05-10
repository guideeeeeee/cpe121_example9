import javax.swing.*;
import java.awt.*;
class ex9_1d{
  public static void main(String[]args){
    JFrame frame = new JFrame();
    JPanel mainpanel = new JPanel();
    frame.setTitle("ex9_d");
    mainpanel.setLayout(new GridLayout(8,8));
    
    for(int i =1;i<9;i++){
      for(int j =1;j<9;j++){
        JPanel square = new JPanel();
        if((i+j)%2 != 0){
            square.setBackground(Color.black);
        }
        mainpanel.add(square);
      }
    }
    
    frame.add(mainpanel);
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  }
  