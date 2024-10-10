package Lecture4;

import javax.swing.*;
import java.awt.*;

public class GridLayout1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout");
        f.setLayout(new GridLayout(3,2));
        f.add(new JButton("HOME"));
        f.add(new JButton("PRODUCT"));
        f.add(new JButton("FINANCE"));
        f.add(new JButton("CONTACTS"));
        f.add(new JButton("HOME"));
        f.add(new JButton("PRODUCT"));

        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
