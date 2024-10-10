package Exercise;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f2 = new JFrame("Button Example");

        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);

        JButton b = new JButton("Click Here");
        b.setBounds(50,100,95,30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    tf.setText("Display This After Clicking on the Button");
            }
        });

        f2.add(b);
        f2.add(tf);

        f2.setVisible(true);
        f2.setLayout(null);
        f2.setSize(400,400);
    }
}
