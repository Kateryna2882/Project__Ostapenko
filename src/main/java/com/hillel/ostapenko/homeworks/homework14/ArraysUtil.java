package com.hillel.ostapenko.homeworks.homework14;

public class ArraysUtil {

    public static int getElementIndex(int[][] array) {
        int average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                average = sum / array.length;
            }
        }
        return average;
    }

    public static boolean getMatrix(int matrix[][]) {
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
            if (matrix.length == matrix[i].length) {
                return true;
            } else {

            }
        }
        return false;
    }
}
