package com.strincalc;

public class StringCalc {

    private static final String TERMINATIOR = ",";

    //public block
    public int getSum(int numA, int numB) {
        return numA + numB;
    }

    //get sum of digest from string between separator
    public int add(String inputs) {
        String[] arrayWithNumbers = inputs.split(TERMINATIOR);
        int[] digitFromString = new int[arrayWithNumbers.length];

        for (int i = 0; i < arrayWithNumbers.length; i++) {
            digitFromString[i] = getNumberFromAnyString(arrayWithNumbers[i]);
        }

        if (inputs.isEmpty()) {
            return 0;
        }
        else if (digitFromString.length == 1) {
            return digitFromString[0];
        } else {
            int sum = 0;
            for (int i : digitFromString) {
                sum += i;
            }
            return sum;
        }
    }

    //Get number from of all digits from any string in any places in sequence. exp: "2input2string2" will return 222
    public int getNumberFromAnyString(String input){

        if (input.isEmpty()) {
            return 0;
        }
        else {
            String digest = "";
            for (int i = 0; i < input.length();i++) {
                if (Character.isDigit(input.charAt(i)))
                {
                    digest += Character.getNumericValue(input.charAt(i));
                }
            }
            return toIntOrZero(digest);
        }
    }

    //Get sum of all digits in input string in any places. exp: "2input2string2" will return 6
    public int getSumAllDigitsInAnyString(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        else
        {
            int sumOfDigest = 0;
            for (int i = 0; i < input.length();i++) {
                if (Character.isDigit(input.charAt(i)))
                {
                    sumOfDigest += Character.getNumericValue(input.charAt(i));
                }
            }
            return sumOfDigest;
        }
    }

    //private block
    private int toIntOrZero(String str) {
       try {
           return  Integer.parseInt(str);
       } catch (Exception e) {
           e.printStackTrace();
           return 0;
       }
    }
}
