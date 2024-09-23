package Exercise;
import javax.swing.*;
import java.awt.event.*;


public class tshoot2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        JLabel l1 = new JLabel("Here:");
        l1.setBounds(50,150,50,30);
        JLabel l2 = new JLabel();
        l2.setBounds(120,150,170,30);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newText = tf.getText();
                l2.setText(newText);
            }
        });

        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
