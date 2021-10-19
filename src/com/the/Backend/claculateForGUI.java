package com.the.Backend;

public class claculateForGUI{
    //public claculateForGUI() {}
    public static float[] length(float metreInches, float inchesMetre) {
        float[] score = new float[2];//Ind 0 = metreInches;Ind 1 = inchesMetre
        handleDB gettingConst = new handleDB();
        score[0] = (float) (metreInches*gettingConst.getConstant("metreInches"));
        score[1] = (float) (inchesMetre*gettingConst.getConstant("inchesMetre"));
        //score[0] = (float) (metreInches*39.37);
        //score[1] = (float) (inchesMetre*0.02);
        gettingConst.closeConnection();
        return score;
    }

    public static float[] weight(float kilosPounds, float poundsKilos) {
        float[] score = new float[2];//Ind 0 = kilosPounds;Ind 1 = poundsKilos
        handleDB gettingConst = new handleDB();
        score[0] = (float) (kilosPounds*gettingConst.getConstant("kilosPounds"));
        score[1] = (float) (poundsKilos*gettingConst.getConstant("poundsKilos"));
        //score[0] = (float) (kilosPounds*2.2);
        //score[1] = (float) (poundsKilos*0.45);c
        gettingConst.closeConnection();
        return score;
    }
}
