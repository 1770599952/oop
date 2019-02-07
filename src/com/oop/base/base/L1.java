package com.oop.base.base;

import java.io.PrintStream;

public class L1 {

    private static PrintStream printStream = System.out;

    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                printStream.print(row + " * " + col + " = " + row * col + " ");
            }
            printStream.println();
        }
    }
}
