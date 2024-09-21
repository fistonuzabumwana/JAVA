package Exercise;
import javax.swing.*;
import java.awt.event.*;

public class evening2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("HOME" );
        JButton c = new JButton("PRODUCT" );
        JButton d = new JButton("CONTACT" );
        JButton e = new JButton("HELP" );
        JButton h = new JButton("ONLINE MARKS MANAGEMENT SYSTEM");
        JLabel i0 =  new JLabel("S-NAMES: ");
        JLabel i1 =  new JLabel("QUIZZES: ");
        JLabel i2 =  new JLabel("MID-TERM: ");
        JLabel i3 =  new JLabel("F-EXAM: ");
        JLabel i4 =  new JLabel("COMMENT: ");

        JTextField k0 = new JTextField();
        JTextField k1 = new JTextField();
        JTextField k2 = new JTextField();
        JTextField k3 = new JTextField();
        JTextArea k4 = new JTextArea();




        b.setBounds(10,10,100,30);
        c.setBounds(115,10,100,30);
        d.setBounds(215,10,100,30);
        e.setBounds(320,10,100,30);
        h.setBounds(10,45,410,30);

        i0.setBounds(20,80,150,30);
        k0.setBounds(90,80,325,30);

        i1.setBounds(20,115,150,30);
        k1.setBounds(90,115,325,30);

        i2.setBounds(20,150,150,30);
        k2.setBounds(90,150,325,30);

        i3.setBounds(20,185,150,30);
        k3.setBounds(90,185,325,30);

        i4.setBounds(20,220,150,30);
        k4.setBounds(92,220,320,120);




        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(h);
        f.add(i0);
        f.add(k0);
        f.add(i1);
        f.add(i2);
        f.add(i3);
        f.add(i4);
        f.add(k1);
        f.add(k2);
        f.add(k3);
        f.add(k4);



        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
