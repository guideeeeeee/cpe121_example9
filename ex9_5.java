import java.awt.*;
import javax.swing.*;

public class ex9_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new GridLayout(10, 10,1,1));
        for(int i =0;i<10;i++){
            for(int j =0;j<10;j++){
                int rannum = (int)(Math.random()*2);
                JLabel newlabel = new JLabel(Integer.toString(rannum));
                JPanel newpanel = new JPanel();
                newpanel.add(newlabel);
                mainPanel.add(newpanel);
            
            }

        }
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
