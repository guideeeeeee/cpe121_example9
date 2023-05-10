import javax.swing.*;
import java.awt.*;
public class ex9_4 {
   public static void main(String[] args) {
    //not done
        JFrame frame = new JFrame("Example");
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        
        ImageIcon icon1 = new ImageIcon("E:\\/javachoorat/example9/image/resize/albedo.jpg");
        //JLabel label1 = new JLabel("albedo", icon1, SwingConstants.CENTER);
        //label1.setVerticalTextPosition(SwingConstants.CENTER);
        //label1.setHorizontalTextPosition(SwingConstants.LEFT);

        JButton bicon1 = new JButton("click me", icon1);
        bicon1.setHorizontalAlignment(AbstractButton.LEFT);
        mainpanel.add(bicon1);

        ImageIcon icon2 = new ImageIcon("E:\\/javachoorat/example9/image/resize/albeheart.jpg");
        //JLabel label2 = new JLabel("albeheart", icon2,SwingConstants.CENTER);
        //label2.setVerticalTextPosition(SwingConstants.BOTTOM);
        //label2.setHorizontalTextPosition(SwingConstants.CENTER);
        JButton bicon2 = new JButton("click me", icon2);
        bicon2.setHorizontalAlignment(AbstractButton.LEFT);
        mainpanel.add(bicon2);


        ImageIcon icon3 = new ImageIcon("E:\\/javachoorat/example9/image/resize/kazuhuh.png");
        //JLabel label3 = new JLabel("kazuhuh", icon3,SwingConstants.CENTER);
        //label3.setVerticalTextPosition(SwingConstants.TOP);
        //label3.setHorizontalTextPosition(SwingConstants.CENTER);
        JButton bicon3 = new JButton("click me", icon3);
        bicon3.setHorizontalAlignment(AbstractButton.LEFT);
        mainpanel.add(bicon3);
        ImageIcon icon4 = new ImageIcon("E:\\/javachoorat/example9/image/resize/childebruh.jpg");
        //JLabel label4 = new JLabel("childebruh", icon4, SwingConstants.CENTER);
        //label4.setVerticalTextPosition(SwingConstants.CENTER);
        //label4.setHorizontalTextPosition(SwingConstants.RIGHT);
        JButton bicon4 = new JButton("click me", icon4);
        bicon4.setHorizontalAlignment(AbstractButton.LEFT);
        mainpanel.add(bicon4);
        //mainpanel.add(label1);
        //mainpanel.add(label2);
        //mainpanel.add(label3);
        //mainpanel.add(label4);

        frame.add(mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setVisible(true);
    }
}
