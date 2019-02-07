package com.oop.base.base;

import java.io.PrintStream;

public class L2 {

    private static PrintStream printStream = System.out;

    public static void main(String[] args) {

        final int rows = 5;

        for (int row = 1; row <= rows; row++) {
            int blank = rows - row;
            while (blank > 0) {
                printStream.print(" ");
                blank--;
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    printStream.print("*");
                } else {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }

        final int reRows = rows - 1;

        for (int row = 1; row <= reRows; row++) {
            int blank = 0;
            while (blank < row) {
                printStream.print(" ");
                blank++;
            }

            for (int col = 1; col <= 2 * (rows - row) - 1; col++) {
                if (col == 1 || col == 2 * (rows - row) - 1) {
                    printStream.print("*");
                } else {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }
    }

}
