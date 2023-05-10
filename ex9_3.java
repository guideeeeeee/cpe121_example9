import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
public class ex9_3 extends JFrame {
    private ImageIcon stIcon = new ImageIcon("E:\\/javachoorat/example9/image/albedo.jpg");
    private ImageIcon ndIcon = new ImageIcon("E:\\/javachoorat/example9/image/albeheart.jpg");
    private ImageIcon rdIcon = new ImageIcon("E:\\/javachoorat/example9/image/kazuhuh.png");
    private ImageIcon thIcon = new ImageIcon("E:\\/javachoorat/example9/image/childebruh.jpg");
    public ex9_3(){
        setLayout(new GridLayout(2,2));
        JLabel p1 = new JLabel(stIcon);
        JLabel p2 = new JLabel(ndIcon);
        JLabel p3 = new JLabel(rdIcon);
        JLabel p4 = new JLabel(thIcon);

        Border lineBorder = new LineBorder(Color.BLACK, 2);
        p1.setBorder(lineBorder);
        p2.setBorder(lineBorder);
        p3.setBorder(lineBorder);
        p4.setBorder(lineBorder);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
    }
    public static void main(String[] args) {
        ex9_3 frame = new ex9_3();

        frame.setTitle("ex9_3");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
