package com.math.base;

public class Base1 {
    public static void main(String[] args) {

    }

    public boolean Find(int target, int[][] array) {

        int rows = array.length;
        int cols = array[0].length;

        for (int i = rows - 1, j = 0; i >= 0 && j < cols; i--, j++) {
            if (target == array[i][j]) {
                return true;
            } else if (target > array[i][j]) {
                i--;
                continue;
            } else if (target < array[i][j]) {
                j++;
                continue;
            }
        }
        return false;
    }
}

