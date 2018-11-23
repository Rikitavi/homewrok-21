package ru.mukhametzyanov.task3;

import java.util.Scanner;

public class MinMaxMassive {

    public static void main(String[] args) {
        //User input data in console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity massive elements: ");
        int nElement = scanner.nextInt();
        int[] massive = new int[nElement];
        System.out.println("Enter value massive elements: ");
        for (int i = 0; i < nElement; i++) {
            massive[i] = scanner.nextInt();
        }

        //Display massive
        System.out.print("You massive: ");
        for (int element : massive) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Find Max Element in massive
        int maxElemant = massive[0];
        for (int i = 0; i < massive.length ; i++) {
            if (massive[i] > maxElemant){
                maxElemant = massive[i];
            }
        }
        System.out.println("Max element in massive: " + maxElemant);

        //Find Min element in massive
        int minElement = massive[0];
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] < minElement){
                minElement = massive[j];
            }
        }
        System.out.println("Min element in massive: " + minElement);

        //Find average value in massive
        double averageElement = 0;
        for (double element : massive) {
            averageElement += element/massive.length;
        }
        System.out.println("Average value in massive: " + averageElement);
    }
}

