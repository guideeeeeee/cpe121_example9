import javax.swing.*;
import java.awt.*;
public class ex9_4 {
   public static void main(String[] args) {
    //not done
        JFrame frame = new JFrame("Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,50,50)); //(�ǹ͹,�ǵ��)
        
        ImageIcon icon1 = new ImageIcon("E:\\/javachoorat/example9/image/albedo.jpg");
        JLabel label1 = new JLabel("Nagi1", icon1, SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.CENTER);
        label1.setHorizontalTextPosition(SwingConstants.LEFT);


        ImageIcon icon2 = new ImageIcon("E:\\/javachoorat/example9/image/albeheart.jpg");
        JLabel label2 = new JLabel("Nagi2", icon2,SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);
        label2.setHorizontalTextPosition(SwingConstants.CENTER);

        ImageIcon icon3 = new ImageIcon("E:\\/javachoorat/example9/image/kazuhuh.png");
        JLabel label3 = new JLabel("Nagi3", icon3,SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.TOP);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);

        ImageIcon icon4 = new ImageIcon("E:\\/javachoorat/example9/image/childebruh.jpg");
        JLabel label4 = new JLabel("Nagi4", icon4, SwingConstants.CENTER);
        label4.setVerticalTextPosition(SwingConstants.CENTER);
        label4.setHorizontalTextPosition(SwingConstants.RIGHT);
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setVisible(true);
    }
}
