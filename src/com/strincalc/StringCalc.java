package com.strincalc;

public class StringCalc {

    private static final String DEFAULT_DELIMITER = ",";

    //public block

    //get sum of digest from string between separator
    public int add(String str) {
        return add(str, DEFAULT_DELIMITER);
    }

     //get sum of digest from string between separator
    public int add(String inputs, String delim) {
        if (delim == null || delim.equals("")) {
            delim = DEFAULT_DELIMITER;
        }

        String[] arrayWithNumbers = inputs.split(delim);
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
            String buff = "";
            int digit = 0;
            for (int i = 0; i < input.length();i++) {
                if (Character.isDigit(input.charAt(i)))
                {
                    buff += Character.getNumericValue(input.charAt(i));
                    digit = toIntOrZero(buff);
                }
            }
            return digit;
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

    public static String getDEFAULT_DELIMITER() {
        return DEFAULT_DELIMITER;
    }

    //private block
    private int toIntOrZero(String str) {
        int num;
        try {
            num = Integer.parseInt(str);
            if (num < 0) {
               throw new NegativeIntException(str);
            }
            else if (num >= 1000) {
               while (num >= 1000) {
                   num -= 1000;
               }
               return num;
            }
            else {
                return  num;
            }
        } catch (NegativeIntException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
