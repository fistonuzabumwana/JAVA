package Lecture4;

import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("CALCULATOR");
        f.setLayout(new GridLayout(5,4));
        f.add(new JButton("C"));
        f.add(new JButton("()"));
        f.add(new JButton("%"));
        f.add(new JButton(":"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("X"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("-"));
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("+"));
        f.add(new JButton("0"));
        f.add(new JButton("00"));
        f.add(new JButton("."));
        f.add(new JButton("="));

        f.pack();
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
