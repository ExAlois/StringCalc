package com.strincalc;

public class Main {

    public static void main(String[] args) {
        StringCalc strCalc = new StringCalc();
        int i=strCalc.add("1,5,3");
        System.out.println(i);
        int f = strCalc.getNumFromString("9dfa1");
     }
}
