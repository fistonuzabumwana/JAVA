package Exercise;
import java.awt.event.*;
import javax.swing.*;

public class tshoot {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Button Example");

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tf.setText("Display This After Clicking on the Button");
            }
        });

        f1.add(b);
        f1.add(tf);


        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);


    }
}
