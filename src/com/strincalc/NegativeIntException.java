package com.strincalc;

import java.io.PrintStream;

public class NegativeIntException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Negatives not allowed");
    }
}
