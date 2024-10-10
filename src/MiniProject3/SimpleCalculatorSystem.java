package MiniProject3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorSystem {
    private static JTextField focusedTextField;
    public static void main(String[] args) {
        JFrame calculatorFrame = new JFrame();
        calculatorFrame.setLayout(new GridLayout(7,3));

        calculatorFrame.add(new JLabel("  SIMPLE"));
        calculatorFrame.add(new JLabel("CALCULATOR"));
        calculatorFrame.add(new JLabel("  SYSTEM"));
        calculatorFrame.add(new JLabel("  Number1:"));
        calculatorFrame.add(new JLabel("  Number2:"));
        calculatorFrame.add(new JLabel("    Answers"));

        JTextField num1TextField = new JTextField();
        num1TextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                focusedTextField = num1TextField;
            }
        });
        calculatorFrame.add(num1TextField);

        JTextField num2TextField = new JTextField();
        num2TextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                focusedTextField = num2TextField;
            }
        });
        calculatorFrame.add(num2TextField);


        JTextField answersTextField = new JTextField();
        calculatorFrame.add(answersTextField);



        JButton one = new JButton("1");
        calculatorFrame.add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "1");
                }
            }
        });


        JButton two = new JButton("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "2");
                }
            }
        });
        calculatorFrame.add(two);


        JButton product = new JButton("X");
        product.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String product = String.valueOf(((Double.parseDouble(num1TextField.getText()))*(Double.parseDouble(num2TextField.getText()))));

                answersTextField.setText(product);
            }
        });
        calculatorFrame.add(product);

        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "3");
                }
            }
        });
        calculatorFrame.add(three);


        JButton four = new JButton("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "4");
                }
            }
        });
        calculatorFrame.add(four);


        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String divide = String.valueOf(((Double.parseDouble(num1TextField.getText()))/(Double.parseDouble(num2TextField.getText()))));

                answersTextField.setText(divide);
            }
        });
        calculatorFrame.add(divide);


        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "5");
                }
            }
        });
        calculatorFrame.add(five);


        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "6");
                }
            }
        });
        calculatorFrame.add(six);


        JButton subtract = new JButton("-");
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subtract = String.valueOf(((Double.parseDouble(num1TextField.getText()))-(Double.parseDouble(num2TextField.getText()))));

                answersTextField.setText(subtract);
            }
        });
        calculatorFrame.add(subtract);


        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "7");
                }
            }
        });
        calculatorFrame.add(seven);


        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(focusedTextField != null){
                    focusedTextField.setText(focusedTextField.getText() + "8");
                }
            }
        });
        calculatorFrame.add(eight);


        JButton modulus = new JButton("%");
        modulus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String modulus = String.valueOf(((Double.parseDouble(num1TextField.getText()))%(Double.parseDouble(num2TextField.getText()))));

                answersTextField.setText(modulus);
            }
        });
        calculatorFrame.add(modulus);


        calculatorFrame.pack();
        calculatorFrame.setVisible(true);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setSize(300,300);

    }
}
