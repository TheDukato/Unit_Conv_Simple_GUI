package com.the;

import java.util.Scanner;

public class claculateForGUI{
    //public claculateForGUI() {}

    public static float[] length(float metreInches, float inchesMetre) {
        float[] score = new float[2];//Ind 0 = metreInches;Ind 1 = inchesMetre
        score[0] = (float) (metreInches*39.37);
        score[1] = (float) (inchesMetre*0.02);
        return score;
    }

    public static float[] weight(float kilosPounds, float poundsKilos) {
        float[] score = new float[2];//Ind 0 = kilosPounds;Ind 1 = poundsKilos
        score[0] = (float) (kilosPounds*2.2);
        score[1] = (float) (poundsKilos*0.45);
        return score;
    }
}
