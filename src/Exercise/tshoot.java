package Exercise;
import java.awt.event.*;
import javax.swing.*;

public class tshoot {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tf.setText("Display This After Clicking on the Button");
            }
        });

        f.add(b);
        f.add(tf);


        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);


    }
}
