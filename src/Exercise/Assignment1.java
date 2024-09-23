package Exercise;

import javax.swing.*;
import java.awt.event.*;

public class Assignment1 {

    public static void main(String[] args) {
        JFrame employeeFlame = new JFrame();


        JButton homeButton = new JButton("HOME" );
        homeButton.setBounds(10,10,110,30);
        employeeFlame.add(homeButton);


        JButton hResourceButton = new JButton("HRESOURCE" );
        hResourceButton.setBounds(125,10,110,30);
        employeeFlame.add(hResourceButton);

        JButton servicesButton = new JButton("SERVICES" );
        servicesButton.setBounds(240,10,110,30);
        employeeFlame.add(servicesButton);

        JButton helpButton = new JButton("HELP" );
        helpButton.setBounds(355,10,110,30);
        employeeFlame.add(helpButton);




            JLabel nameLabel =  new JLabel("EMPLOYEE-NAMES: ");
            nameLabel.setBounds(20,80,150,30);
            employeeFlame.add(nameLabel);
            JTextField nameTextField = new JTextField();
            nameTextField.setBounds(170,80,250,30);
            employeeFlame.add(nameTextField);




            JLabel addressLabel =  new JLabel("EMPLOYEE-ADDRESS: ");
            addressLabel.setBounds(20,115,150,30);
            employeeFlame.add(addressLabel);
            JTextField addressTextField = new JTextField();
            addressTextField.setBounds(170,115,250,30);
            employeeFlame.add(addressTextField);



            JLabel statusLabel =  new JLabel("EMPLOYEE-M-STATUS: ");
            statusLabel.setBounds(20,150,150,30);
            employeeFlame.add(statusLabel);
            JTextField statusTextField = new JTextField();
            statusTextField.setBounds(170,150,250,30);
            employeeFlame.add(statusTextField);




            JLabel telephoneLabel = new JLabel("EMPLOYEE-TELEPHONE: ");
            telephoneLabel.setBounds(20, 185, 150, 30);
            employeeFlame.add(telephoneLabel);
            JTextField telephoneTextField = new JTextField();
            telephoneTextField.setBounds(170, 185, 250, 30);
            employeeFlame.add(telephoneTextField);

            JLabel outputLabel1 = new JLabel("OUTPUT: ");
            outputLabel1.setBounds(20, 300, 150, 30);
            employeeFlame.add(outputLabel1);
            JLabel outputLabel2 = new JLabel();
            outputLabel2.setBounds(170, 300, 250, 30);
            employeeFlame.add(outputLabel2);


        JButton namesButton = new JButton("NAMES" );
        namesButton.setBounds(10,240,110,30);
        employeeFlame.add(namesButton);
        namesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextFromInput = nameTextField.getText();
                outputLabel2.setText(getTextFromInput);
            }
        });


        JButton addressButton = new JButton("ADDRESS" );
        addressButton.setBounds(125,240,110,30);
        employeeFlame.add(addressButton);
        addressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextFromInput = addressTextField.getText();
                outputLabel2.setText(getTextFromInput);
            }
        });

        JButton statusButton = new JButton("STATUS" );
        statusButton.setBounds(240,240,110,30);
        employeeFlame.add(statusButton);
        statusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextFromInput = statusTextField.getText();
                outputLabel2.setText(getTextFromInput);
            }
        });


        JButton telephoneButton = new JButton("TELEPHONE" );
        telephoneButton.setBounds(355,240,110,30);
        employeeFlame.add(telephoneButton);
        telephoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextFromInput = telephoneTextField.getText();
                outputLabel2.setText(getTextFromInput);
            }
        });


        JButton onlineEmployeeManagementSystemButton = new JButton("ONLINE EMPLOYEE MANAGEMENT SYSTEM");
        onlineEmployeeManagementSystemButton.setBounds(10,45,455,30);
        employeeFlame.add(onlineEmployeeManagementSystemButton);

            employeeFlame.setSize(500,500);
            employeeFlame.setLayout(null);
            employeeFlame.setVisible(true);
    }
}
