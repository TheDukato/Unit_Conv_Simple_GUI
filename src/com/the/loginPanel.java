package com.the;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPanel extends JPanel implements ActionListener {
    String NAME = "The";
    String PASSWORD = "Dukato";

    JFrame frame;

    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField(NAME);
    JLabel passwordLabel = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField(PASSWORD);
    JButton logButton = new JButton("Login in");
    JPanel surveyPanel = new JPanel();
    JPanel surveyPanelCentered = new JPanel();

    public loginPanel(JFrame frame){
        this.frame = frame;


        logButton.addActionListener(this);
        surveyPanel.add(nameLabel);
        surveyPanel.add(nameField);
        surveyPanel.add(passwordLabel);
        surveyPanel.add(passwordField);
        surveyPanel.setLayout(new GridLayout(2,2));

        surveyPanelCentered.add(surveyPanel);
        surveyPanelCentered.add(logButton);
        surveyPanelCentered.setLayout(new GridLayout(2,1));

        add(surveyPanelCentered);
    }

    /**
     *
     * @param name
     * @param passwdInChar
     * @return boolean
     */
    private boolean verifyLoginData(String name, char[] passwdInChar){
        StringBuilder passwdInStringBuilder = new StringBuilder();
        for(int i=0; i < passwdInChar.length; i++){
            passwdInStringBuilder.append(passwdInChar[i]);
        }
        if(name.equals(NAME) && passwdInStringBuilder.toString().equals(PASSWORD)){
            return true;
        }
        else {
            return false;
        }

    }
    @Override
    public void actionPerformed(ActionEvent e){

        if(verifyLoginData(nameField.getText(), passwordField.getPassword())){
            frame.getContentPane().removeAll();
            frame.add(new mainPanel());
            frame.validate();
        }
        else {
            //Call of login panel with message of wrong data login
        }
    }
}

