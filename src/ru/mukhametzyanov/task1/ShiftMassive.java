package ru.mukhametzyanov.task1;

import java.util.Arrays;

public class ShiftMassive {
    /**
     * Метод выводит массив на экран
     *
     * @param massive принимает на вход двумерный массив
     */
    public static void displayMassive(int[][] massive) {
        for (int[] elements : massive) {
            System.out.println(Arrays.toString(elements));
        }
        System.out.println();
    }

    /**
     * Метод сдвигает элементы в массиве
     *
     * @param massive принимает на вход массив
     */
    public static void shiftMassive(int[] massive) {
        int temp = massive[0];
        for (int i = 0; i < massive.length - 1; i++) {
            massive[i] = massive[i + 1];
        }
        massive[massive.length - 1] = temp;
    }

    public static void main(String[] args) {

        int[][] massive = {{1, 23, 45},
                {34, 23, 45, 78},
                {3, 5765}};
        displayMassive(massive);
        for (int i = 0; i < massive.length; i++) {
            shiftMassive(massive[i]);
        }
        displayMassive(massive);
    }
}
