package com.the.Frontend;

import javax.swing.*;
import com.the.Backend.handleDB;

import java.util.List;

public class mainPanel extends JPanel {

    //Old working version 18.09.2021

    mainPanel(){
        JPanel centeredPanel = new JPanel();
        JPanel weightPanel = new weightPanel();
        JPanel lengthPanel = new lengthPanel();
        centeredPanel.add(weightPanel);
        centeredPanel.add(lengthPanel);

        //JLabel ocochodzi = new JLabel("ocochodzi");
        //centeredPanel.add(ocochodzi);

        add(centeredPanel);
    }

    /*
    public mainPanel(){
        handleDB DB = new handleDB();
        List table = DB.selectAllRowConstant();
        JLabel title = new JLabel("Main Menu");
        add(title);
        System.out.print(DB.getKind(2));
        for (int i=0; i < table.size(); i=i+2) {
            //JButton butt = new JButton("Cos tam");
            //butt.setText(DB.getKind(i));
            //add(butt);
        }
    }
     */
}
