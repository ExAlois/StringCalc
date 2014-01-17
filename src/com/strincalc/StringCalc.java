package com.strincalc;

import java.util.Arrays;

public class StringCalc {
    //private block
    private static final String TERMINATIOR = ",";

    private int isNum(String str) {
       try {
           return  Integer.parseInt(str);
       }
       catch (Exception e) {
           System.out.println(Arrays.toString(e.getStackTrace()));
           return 0;
       }
    }

    public int getNumFromString(String input){

        if (input.isEmpty()) {
            return 0;
        }
        else {
            int num  = 0;
            for (int i = 0; i < input.length();i++) {
                if (Character.isDigit(input.charAt(i)))
                {
                    num += Character.getNumericValue(input.charAt(i));
                }
            }
            return num;
        }
    }

    //public block

    public int getSum(int numA, int numB) {
        return numA + numB;
    }

    public int add(String inputs) {
        String numbers[] = inputs.split(TERMINATIOR);

        if (inputs.isEmpty()) {
            return 0;
        }
        else if (numbers.length == 1) {
            return isNum(numbers[0]);
        } else {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = getSum(sum, isNum(numbers[i]));
            }
            return sum;
        }
    }
}
