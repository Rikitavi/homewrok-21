package ru.mukhametzyanov.task1;

import java.util.Arrays;

public class InsertMassiveValue {

    public static void main(String[] args) {

        int[][] matrixMassive = {{1, 2, 3, 4},
                {7, 5, 6, 9},
                {74, 85, 93, 44},
                {32, 53, 10, 71}};
        for (int i = 0; i < matrixMassive.length; i++) {
            for (int j = 0; j < matrixMassive[i].length; j++) {
                System.out.print(matrixMassive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrixMassive.length; i++) {
            shiftMassive(matrixMassive[i]);
        }
        for (int[] ints : matrixMassive) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void shiftMassive(int[] element) {
        int temp = element[0];
        for (int i = 0; i < element.length - 1; i++) {
            element[i] = element[i + 1];
        }
        element[element.length - 1] = temp;
    }
}

