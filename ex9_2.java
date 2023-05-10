import java.awt.*;
import javax.swing.*;

public class ex9_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        frame.setTitle("ex9_2");
        frame.setSize(300,100);

        JPanel paneltop = new JPanel();
        paneltop.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneltop.add(new JButton("Button 4"));
        paneltop.add(new JButton("Button 5"));
        paneltop.add(new JButton("Button 6"));

        JPanel panelbut = new JPanel();
        panelbut.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelbut.add(new JButton("Button 1"));
        panelbut.add(new JButton("Button 2"));
        panelbut.add(new JButton("Button 3"));

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(paneltop,BorderLayout.CENTER);
        mainPanel.add(panelbut,BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
