package com.strincalc;

import java.io.PrintStream;

public class NegativeIntException extends Exception {

    public NegativeIntException(String str) {
        super("Negatives not allowed: " + str);
    }
}
