package Lecture3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorSystem {
    public static void main(String[] args) {
        JFrame calculatorFrame = new JFrame();

        JButton simpleCalculatorSystem = new JButton("SIMPLE CALCULATOR SYSTEM");
        simpleCalculatorSystem.setBounds(10,10,300,30);
        calculatorFrame.add(simpleCalculatorSystem);

        JLabel number1Label = new JLabel("NUMBER 1: ");
        number1Label.setBounds(10,50,90,30);
        calculatorFrame.add(number1Label);

        JTextField number1TextField = new JTextField();
        number1TextField.setBounds(110,50,200,30);
        calculatorFrame.add(number1TextField);

        JLabel number2Label = new JLabel("NUMBER 2: ");
        number2Label.setBounds(10,85,90,30);
        calculatorFrame.add(number2Label);

        JTextField number2TextField = new JTextField();
        number2TextField.setBounds(110,85,200,30);
        calculatorFrame.add(number2TextField);

        JLabel resultLabel = new JLabel("RESULT: ");
        resultLabel.setBounds(10,120,90,30);
        calculatorFrame.add(resultLabel);

        JTextField resultTextField = new JTextField();
        resultTextField.setBounds(110,120,200,30);
        calculatorFrame.add(resultTextField);

        JButton productButton = new JButton("PRODUCT");
        productButton.setBounds(10,155,100,30);
        calculatorFrame.add(productButton);
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value1 = number1TextField.getText();
                String value2 = number2TextField.getText();
                int number1 = Integer.parseInt(value1);
                int number2 = Integer.parseInt(value2);
                int product = number1 *number2;
                String result = String.valueOf(product);

                resultTextField.setText(result);
            }
        });

        JButton divisionButton = new JButton("DIVISION");
        divisionButton.setBounds(115,155,100,30);
        calculatorFrame.add(divisionButton);
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value1 = number1TextField.getText();
                String value2 = number2TextField.getText();
                int number1 = Integer.parseInt(value1);
                int number2 = Integer.parseInt(value2);
                int division = number1 / number2;
                String result = String.valueOf(division);

                resultTextField.setText(result);
            }
        });

        JButton modulusButton = new JButton("MODULUS");
        modulusButton.setBounds(220,155,100,30);
        calculatorFrame.add(modulusButton);
        modulusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value1 = number1TextField.getText();
                String value2 = number2TextField.getText();
                int number1 = Integer.parseInt(value1);
                int number2 = Integer.parseInt(value2);
                int modulus = number1 % number2;
                String result = String.valueOf(modulus);

                resultTextField.setText(result);
            }
        });


        calculatorFrame.setLayout(null);
        calculatorFrame.setSize(400,400);
        calculatorFrame.setVisible(true);
    }
}
