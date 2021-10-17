package com.the.Frontend;

import com.the.Backend.claculateForGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lengthPanel extends JPanel implements ActionListener {
    JFormattedTextField metreInchesField;
    JFormattedTextField inchesMetreField;
    JLabel metreInchesScore;
    JLabel inchesMetreScore;

    public lengthPanel(){
        JPanel lengthinsidePanel = new JPanel();

        JLabel title = new JLabel("Converter of length");//metre->inches

        JLabel metreInchesLabelSet = new JLabel("metre->inches");//Enter value in kilos you'll get value in pounds
        metreInchesField = new JFormattedTextField();
        JLabel metreInchesLabelGet = new JLabel("It is: ");
        metreInchesScore = new JLabel("score in inches");

        JLabel inchesMetre = new JLabel("inches->metre");//Enter value in pounds you'll get value in kilos
        inchesMetreField  = new JFormattedTextField();
        JLabel inchesMetreLabelGet = new JLabel("It is: ");
        inchesMetreScore = new JLabel("score in meters");

        JButton calculatelength = new JButton("Calculate len");
        calculatelength.addActionListener(this);

        add(title);
        lengthinsidePanel.add(metreInchesLabelSet);
        lengthinsidePanel.add(metreInchesField);
        lengthinsidePanel.add(metreInchesLabelGet);
        lengthinsidePanel.add(metreInchesScore);
        lengthinsidePanel.add(inchesMetre);
        lengthinsidePanel.add(inchesMetreField);
        lengthinsidePanel.add(inchesMetreLabelGet);
        lengthinsidePanel.add(inchesMetreScore);
        lengthinsidePanel.setLayout(new GridLayout(4,4));
        add(lengthinsidePanel);
        add(calculatelength);

        setLayout(new GridLayout(3,1));
    }
    @Override
    public void actionPerformed(ActionEvent e){
        float[] scoreLength = new float[2];
        scoreLength = claculateForGUI.length(Float.valueOf(metreInchesField.getText()),Float.valueOf(inchesMetreField.getText()));
        //Problem: JTextField methods getText() returns String
        //Solutin: downcasting Float.valueOf(String data)
        metreInchesScore.setText(String.valueOf(scoreLength[0]));
        inchesMetreScore.setText(String.valueOf(scoreLength[1]));
    }
}
