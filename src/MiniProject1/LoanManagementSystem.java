package MiniProject1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanManagementSystem {
    public static void main(String[] args) {
        JFrame loanManagementSystem1 = new JFrame("Loan Management System");
        loanManagementSystem1.setLayout(null);
        loanManagementSystem1.setSize(550,430);
        loanManagementSystem1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loanManagementSystem1.setVisible(true);

        JPanel loanManagementSystem = new JPanel();
        loanManagementSystem.setBackground(new Color(178, 255, 191));
        loanManagementSystem.setBounds(15,15,520,400);
        loanManagementSystem.setLayout(null);
        loanManagementSystem.setBorder(new LineBorder(new Color(6, 117, 29), 2));
        loanManagementSystem1.add(loanManagementSystem);

        JLabel titleLabel = new JLabel("LOAN MANAGEMENT SYSTEM");
        titleLabel.setBounds(10,10,500,50);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        loanManagementSystem.add(titleLabel);

        JLabel loanAmountLabel = new JLabel("LOAN AMOUNT:");
        loanAmountLabel.setBounds(10,70,170,20);
        loanAmountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loanAmountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        loanManagementSystem.add(loanAmountLabel);

        JTextField loanAmountTextField = new JTextField();
        loanAmountTextField.setBounds(200,70,190,20);
        loanManagementSystem.add(loanAmountTextField);

        JLabel loanPeriodLabel = new JLabel("LOAN PERIOD:");
        loanPeriodLabel.setBounds(10,100,170,20);
        loanPeriodLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loanPeriodLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        loanManagementSystem.add(loanPeriodLabel);

        JTextField loanPeriodTextField = new JTextField();
        loanPeriodTextField.setBounds(200,100,190,20);
        loanManagementSystem.add(loanPeriodTextField);

        JLabel loanInterestRateLabel = new JLabel("INTEREST RATE IN %:");
        loanInterestRateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        loanInterestRateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loanInterestRateLabel.setBounds(10,130,170,20);
        loanManagementSystem.add(loanInterestRateLabel);

        JTextField loanInterestRateTextField = new JTextField();
        loanInterestRateTextField.setBounds(200,130,190,20);
        loanManagementSystem.add(loanInterestRateTextField);

        JLabel processingFeeLabel = new JLabel("PROCESSING FEE:");
        processingFeeLabel.setBounds(10,160,170,20);
        processingFeeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        processingFeeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        loanManagementSystem.add(processingFeeLabel);

        JTextField processingFeeTextField = new JTextField();
        processingFeeTextField.setBounds(200,160,190,20);
        loanManagementSystem.add(processingFeeTextField);

        JButton totalAmountButton = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID");
        totalAmountButton.setFont(new Font("Arial", Font.BOLD, 16));
        totalAmountButton.setBounds(10,190,360,20);
        loanManagementSystem.add(totalAmountButton);


        JTextField totalAmountTextField = new JTextField();
        totalAmountTextField.setBounds(390,190, 80,20);
        loanManagementSystem.add(totalAmountTextField);

        JButton amountToBePaidButton = new JButton("CALCULATE AMOUNT TO BE PAID PER MONTH");
        amountToBePaidButton.setBounds(10,220,400,25);
        amountToBePaidButton.setFont(new Font("Arial", Font.BOLD, 16));
        loanManagementSystem.add(amountToBePaidButton);

        JTextField amountToBePaidTextField = new JTextField();
        amountToBePaidTextField.setBounds(420,220, 80,25);
        loanManagementSystem.add(amountToBePaidTextField);

        amountToBePaidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Retrieve the input values
                    double loanAmount = Double.parseDouble(loanAmountTextField.getText());
                    double loanPeriod = Double.parseDouble(loanPeriodTextField.getText());
                    double interestRate = Double.parseDouble(loanInterestRateTextField.getText());
                    double processingFee = Double.parseDouble(processingFeeTextField.getText());

                    double interest = (loanAmount * interestRate * loanPeriod) / 100;
                    double totalAmount = loanAmount + interest + processingFee;
                    double loanPeriodInMonths = loanPeriod * 12;
                    double monthlyPayment = totalAmount / loanPeriodInMonths;
                    amountToBePaidTextField.setText(String.format("%.2f", monthlyPayment));
                } catch (NumberFormatException ex) {

                    amountToBePaidTextField.setText("Error");
                }
            }
        });

        totalAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double loanAmount = Double.parseDouble(loanAmountTextField.getText());
                    double loanPeriod = Double.parseDouble(loanPeriodTextField.getText());
                    double interestRate = Double.parseDouble(loanInterestRateTextField.getText());
                    double processingFee = Double.parseDouble(processingFeeTextField.getText());

                    double interest = (loanAmount * interestRate * loanPeriod) / 100;
                    double totalAmount = loanAmount + interest + processingFee;

                    totalAmountTextField.setText(String.format("%.2f", totalAmount));
                } catch (NumberFormatException ex) {
                    totalAmountTextField.setText("Error");
                }
            }
        });
    }
}
