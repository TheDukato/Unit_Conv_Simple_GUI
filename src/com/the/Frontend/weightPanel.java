package com.the.GUI;

import com.the.backend.claculateForGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class weightPanel extends JPanel implements ActionListener {

    JFormattedTextField kilosPoundsField;
    JFormattedTextField poundsKilosField;
    JLabel kilosPoundsScore;
    JLabel poundsKilosScore;

    public weightPanel(){
        JPanel weightinsidePanel = new JPanel();

        JLabel title = new JLabel("Converter of weight");

        JLabel kilosPoundsLabelSet = new JLabel("kilos->pounds");//Enter value in kilos you'll get value in pounds
        kilosPoundsField = new JFormattedTextField();
        JLabel kilosPoundsLabelGet = new JLabel("It is: ");
        kilosPoundsScore = new JLabel("score in pounds");

        JLabel poundsKilos = new JLabel("pounds->kilos");//Enter value in pounds you'll get value in kilos
        poundsKilosField  = new JFormattedTextField();
        JLabel poundsKilosLabelGet = new JLabel("It is: ");
        poundsKilosScore = new JLabel("score in kilos");

        JButton calculateWeight = new JButton("Calculate");
        calculateWeight.addActionListener(this);

        add(title);
        weightinsidePanel.add(kilosPoundsLabelSet);
        weightinsidePanel.add(kilosPoundsField);
        weightinsidePanel.add(kilosPoundsLabelGet);
        weightinsidePanel.add(kilosPoundsScore);
        weightinsidePanel.add(poundsKilos);
        weightinsidePanel.add(poundsKilosField);
        weightinsidePanel.add(poundsKilosLabelGet);
        weightinsidePanel.add(poundsKilosScore);
        weightinsidePanel.setLayout(new GridLayout(4,4));
        add(weightinsidePanel);
        add(calculateWeight);

        setLayout(new GridLayout(3,1));
    }
    @Override
    public void actionPerformed(ActionEvent e){
        float[] scoreWeight = new float[2];
        scoreWeight = claculateForGUI.weight(Float.valueOf(kilosPoundsField.getText()),Float.valueOf(poundsKilosField.getText()));//Problem JTextField methods getText() returns String
        kilosPoundsScore.setText(String.valueOf(scoreWeight[0]));
        poundsKilosScore.setText(String.valueOf(scoreWeight[1]));
    }
}
