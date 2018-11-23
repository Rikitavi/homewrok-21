package ru.mukhametzyanov.task1;

import java.util.Arrays;

public class OneMassive {

    public static void main(String[] args) {
        //Задаем массив
        int[] massive = {34, 45, 1, 323};
        int shift = 1;
        for (int i = 0; i < shift; i++) {
            int temp = massive[0];
            for (int j = 0; j < massive.length - 1; j++) {
                massive[j] = massive[j + 1];
            }
            massive[massive.length - 1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(massive));

    }
}
