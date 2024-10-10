package MiniProject1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniProject2 {
    public static void main(String[] args) {

            JFrame aucaFrame = new JFrame();

            JButton aucaAssessmentManagementSystem = new JButton("SIMPLE CALCULATOR SYSTEM");
            aucaAssessmentManagementSystem.setBounds(10,10,300,30);
            aucaFrame.add(aucaAssessmentManagementSystem);

            JLabel assessmentLabel = new JLabel("Assessment: ");
            assessmentLabel.setBounds(10,50,90,30);
            aucaFrame.add(assessmentLabel);

            JTextField assessmentTextField = new JTextField();
            assessmentTextField.setBounds(110,50,200,30);
            aucaFrame.add(assessmentTextField);

            JLabel midSemesterLabel = new JLabel("Mid Semester: ");
            midSemesterLabel.setBounds(10,85,90,30);
            aucaFrame.add(midSemesterLabel);

            JTextField midSemesterTextField = new JTextField();
            midSemesterTextField.setBounds(110,85,200,30);
            aucaFrame.add(midSemesterTextField);

            JLabel finalExamLabel = new JLabel("Final Exam: ");
            finalExamLabel.setBounds(10,120,90,30);
            aucaFrame.add(finalExamLabel);

            JTextField finalExamTextField = new JTextField();
            finalExamTextField.setBounds(110,120,200,30);
            aucaFrame.add(finalExamTextField);


            JLabel displayResultLabel = new JLabel("RESULT: ");
            displayResultLabel.setBounds(10,155,90,30);
            aucaFrame.add(displayResultLabel);

            JTextField displayResultTextField = new JTextField();
            displayResultTextField.setBounds(110,155,200,30);
            displayResultTextField.setEditable(false);
            aucaFrame.add(displayResultTextField);

            JButton totalButton = new JButton("TOTAL");
            totalButton.setBounds(10,190,100,30);
            aucaFrame.add(totalButton);
            totalButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String assessmentFieldValue = assessmentTextField.getText();
                    String midSemesterFieldValue = midSemesterTextField.getText();
                    String finalExamFieldValue = finalExamTextField.getText();
                    int assessmentNumber = Integer.parseInt(assessmentFieldValue);
                    int midExamSemesterNumber = Integer.parseInt(midSemesterFieldValue);
                    int finalExamNumber = Integer.parseInt(finalExamFieldValue);
                    int total = assessmentNumber + midExamSemesterNumber + finalExamNumber;
                    String result = String.valueOf(total);

                    displayResultTextField.setText(result);
                }
            });

            JButton averageButton = new JButton("AVERAGE");
            averageButton.setBounds(215,190,100,30);
            aucaFrame.add(averageButton);
            averageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String assessmentFieldValue = assessmentTextField.getText();
                    String midSemesterFieldValue = midSemesterTextField.getText();
                    String finalExamFieldValue = finalExamTextField.getText();
                    int assessmentNumber = Integer.parseInt(assessmentFieldValue);
                    int midExamSemesterNumber = Integer.parseInt(midSemesterFieldValue);
                    int finalExamNumber = Integer.parseInt(finalExamFieldValue);
                    int total = assessmentNumber + midExamSemesterNumber + finalExamNumber;
                    int average = total/3;
                    String result = String.valueOf(average);

                    displayResultTextField.setText(result);
                }
            });







            aucaFrame.setLayout(null);
            aucaFrame.setSize(400,400);
            aucaFrame.setVisible(true);
        }
}

