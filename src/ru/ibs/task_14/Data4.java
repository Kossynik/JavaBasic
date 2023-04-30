package ru.ibs.task_14;

import java.util.Random;

public class Data4 {
    public static void main(String[] args) {

        int i;
        int abs1;
        int abs2;
        Random random = new Random();

        int [] array = new int [15];
        for (i = 0; i < 15; i++) {
            array [i] = random.nextInt(-20, 20);
        }

        System.out.print ("Массив чисел из 15 элементов с рандомными значениями:");
        for (i = 0; i < 15; i++) {
            System.out.print (" " + array[i]);
        }

        int maxNum = array[0];

        for (int j : array) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println("\nМаксимальный элемент массива: " + maxNum);

        int minNum = array[0];

        for (int k : array) {
            if (k < minNum) {
                minNum = k;
            }
        }
        System.out.println("Минимальный элемент массива: " + minNum);

        abs1 = Math.abs(maxNum);
        abs2 = Math.abs(minNum);

        if (abs1 > abs2) {
            System.out.println("Наибольшее значение по модулю: " + abs1);
        }
        else {
            System.out.println("Наибольшее значение по модулю: " + abs2);
        }
    }
}
