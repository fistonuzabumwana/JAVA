package Lecture4;

import javax.swing.*;
import java.awt.*;

public class FlowLayout1 {

        public static void main(String[] args) {
            JFrame f = new JFrame("FlowLayout");
            f.setLayout(new FlowLayout());
            f.add(new JButton("HOME"));
            f.add(new JButton("PRODUCT"));
            f.add(new JButton("FINANCE"));
            f.add(new JButton("CONTACTS"));
            f.pack();
            f.setVisible(true);

        }
    }
