package com.the;

import javax.swing.*;
import java.awt.*;


public class mainPanel extends JPanel {
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
}
