package com.hillel.ostapenko.homeworks.homework14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraysUtilTest {

    @Test
    public void testGetElementIndex() {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        ArraysUtil.getElementIndex(array);

        assertEquals(5, ArraysUtil.getElementIndex(array));
    }

    @Test
    public void testGetMatrix() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        ArraysUtil.getMatrix(matrix);

        assertTrue(ArraysUtil.getMatrix(matrix) == true);
    }
}
