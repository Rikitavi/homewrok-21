package ru.mukhametzyanov.task2;

public class ReversMassive {
    /**
     * Реверс массива
     * @param args
     */
    public static void main(String[] args) {
        //Заполняем массив данными
        int[] massive = new int[5];
        massive[0] = 13;
        massive[1] = 99;
        massive[2] = 35;
        massive[3] = 45;
        massive[4] = 59;
        System.out.println("Massive before revers: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();

        int temp;
        int start = 0;
        int end = massive.length - 1;
        while (start < end) {
            temp = massive[start];
            massive[start] = massive[end];
            massive[end] = temp;
            start++;
            end--;
        }
        System.out.println("Massive after revers: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}
