package com.the.Frontend;

import javax.swing.*;

public class myFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 300;
    public myFrame(){
        JPanel logPanel = new loginPanel(this);
        add(logPanel);
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setVisible(true);
    }
}
