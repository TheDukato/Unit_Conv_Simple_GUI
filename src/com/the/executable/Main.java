package com.the.executable;

import com.the.Frontend.myFrame;
import com.the.Backend.handleDB;

public class Main {
    public static void main(String[] args) {
        //new myFrame();
        handleDB myDataBase = new handleDB();
        /*
        //myDataBase.insertConstant("metreInches", (float)39.37);
        myDataBase.insertConstant("inchesMetre", (float)0.02);
        myDataBase.insertConstant("kilosPounds", (float)2.2);
        myDataBase.insertConstant("poundsKilos", (float)0.45);
         */
        System.out.println(myDataBase.selectAllRowConstant());
        myDataBase.closeConnection();
    }
}
