package MiniProject2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGradesCalculation {
    public static void main(String[] args) {
        JFrame simpleGradeCalculationFrame = new JFrame();


        JButton homeButton = new JButton("HOME" );
        homeButton.setBounds(10,25,110,30);
        simpleGradeCalculationFrame.add(homeButton);


        JButton studentButton = new JButton("STUDENTS" );
        studentButton.setBounds(125,25,110,30);
        simpleGradeCalculationFrame.add(studentButton);

        JButton lectureButton = new JButton("LECTURERS" );
        lectureButton.setBounds(240,25,110,30);
        simpleGradeCalculationFrame.add(lectureButton);

        JButton helpButton = new JButton("HELP" );
        helpButton.setBounds(355,25,110,30);
        simpleGradeCalculationFrame.add(helpButton);




        JLabel chemistryLabel =  new JLabel("CHEMISTRY /40: ");
        chemistryLabel.setBounds(20,80,150,30);
        simpleGradeCalculationFrame.add(chemistryLabel);
        JTextField chemistryTextField = new JTextField();
        chemistryTextField.setBounds(170,80,250,30);
        simpleGradeCalculationFrame.add(chemistryTextField);




        JLabel biologyLabel =  new JLabel("BIOLOGY /40: ");
        biologyLabel.setBounds(20,115,150,30);
        simpleGradeCalculationFrame.add(biologyLabel);
        JTextField biologyTextField = new JTextField();
        biologyTextField.setBounds(170,115,250,30);
        simpleGradeCalculationFrame.add(biologyTextField);



        JLabel physicsLabel =  new JLabel("PHYSICS /40: ");
        physicsLabel.setBounds(20,150,150,30);
        simpleGradeCalculationFrame.add(physicsLabel);
        JTextField physicsTextField = new JTextField();
        physicsTextField.setBounds(170,150,250,30);
        simpleGradeCalculationFrame.add(physicsTextField);




        JLabel mathsLabel = new JLabel("MATHS /40: ");
        mathsLabel.setBounds(20, 185, 150, 30);
        simpleGradeCalculationFrame.add(mathsLabel);
        JTextField mathsTextField = new JTextField();
        mathsTextField.setBounds(170, 185, 250, 30);
        simpleGradeCalculationFrame.add(mathsTextField);



        JTextField percentageTextField = new JTextField();
        percentageTextField.setBounds(10,340,115,30);
        simpleGradeCalculationFrame.add(percentageTextField);

        JButton percentageButton = new JButton("PERCENTAGE" );
        percentageButton.setBounds(10,300,115,30);
        simpleGradeCalculationFrame.add(percentageButton);
        percentageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chemistryMarks = Integer.parseInt(chemistryTextField.getText());
                double biologyMarks = Integer.parseInt(biologyTextField.getText());
                double physicsMarks = Integer.parseInt(physicsTextField.getText());
                double mathsMarks = Integer.parseInt(mathsTextField.getText());

                double percentage = (chemistryMarks + biologyMarks + physicsMarks + mathsMarks)*10/16;
                String percentageValue = String.valueOf(percentage);
                percentageTextField.setText(percentageValue);
            }
        });



        JTextField averageTextField = new JTextField();
        averageTextField.setBounds(190,340,115,30);
        simpleGradeCalculationFrame.add(averageTextField);

        JButton averageButton = new JButton("AVERAGE" );
        averageButton.setBounds(190,300,115,30);
        simpleGradeCalculationFrame.add(averageButton);
        averageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chemistryMarks = Integer.parseInt(chemistryTextField.getText());
                double biologyMarks = Integer.parseInt(biologyTextField.getText());
                double physicsMarks = Integer.parseInt(physicsTextField.getText());
                double mathsMarks = Integer.parseInt(mathsTextField.getText());

                double average = ((chemistryMarks + biologyMarks + physicsMarks + mathsMarks)*10/16)/4;
                String averageValue = String.valueOf(average);
                averageTextField.setText(averageValue);
            }
        });


        JTextField gradeTextField = new JTextField();
        gradeTextField.setBounds(355,340,115,30);
        simpleGradeCalculationFrame.add(gradeTextField);

        JButton gradeButton = new JButton("GRADE" );
        gradeButton.setBounds(355,300,115,30);
        simpleGradeCalculationFrame.add(gradeButton);
        gradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chemistryMarks = Integer.parseInt(chemistryTextField.getText());
                double biologyMarks = Integer.parseInt(biologyTextField.getText());
                double physicsMarks = Integer.parseInt(physicsTextField.getText());
                double mathsMarks = Integer.parseInt(mathsTextField.getText());

                double percentage = (chemistryMarks + biologyMarks + physicsMarks + mathsMarks)*10/16;

                if (percentage>=80){
                    gradeTextField.setText("A");
                } else if (percentage>=70) {
                    gradeTextField.setText("B");
                } else if (percentage >=60) {
                    gradeTextField.setText("C");
                } else if (percentage>=50) {
                    gradeTextField.setText("D");
                } else
                    gradeTextField.setText("F");
            }
        });


        JButton allAnswersButton = new JButton("DISPLAY ALL THE ANSWERS DOWN HERE.");
        allAnswersButton.setBounds(10,240,455,30);
        simpleGradeCalculationFrame.add(allAnswersButton);
        allAnswersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chemistryMarks = Integer.parseInt(chemistryTextField.getText());
                double biologyMarks = Integer.parseInt(biologyTextField.getText());
                double physicsMarks = Integer.parseInt(physicsTextField.getText());
                double mathsMarks = Integer.parseInt(mathsTextField.getText());

                double percentage = (chemistryMarks + biologyMarks + physicsMarks + mathsMarks)*10/16;
                double average = percentage /4;
                String percentageValue = String.valueOf(percentage);
                String averageValue = String.valueOf(average);
                percentageTextField.setText(percentageValue);
                averageTextField.setText(averageValue);

                if (percentage>=80){
                    gradeTextField.setText("A");
                } else if (percentage>=70) {
                    gradeTextField.setText("B");
                } else if (percentage >=60) {
                    gradeTextField.setText("C");
                } else if (percentage>=50) {
                    gradeTextField.setText("D");
                } else
                    gradeTextField.setText("F");

            }
        });

        simpleGradeCalculationFrame.setSize(500,500);
        simpleGradeCalculationFrame.setLayout(null);
        simpleGradeCalculationFrame.setVisible(true);
    }
}
