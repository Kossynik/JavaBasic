package ru.ibs.task_9;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        int a;
        int i;
        double sum = 0;
        double avg;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        a = reader.nextInt();

        if (a <= 0) {
            System.out.println("Пустой массив");
            return;
        }

        double [] array = new double [a];
        System.out.println("Данные элементов массива: ");
        for (i = 0; i < a; i++) {
            array[i] = reader.nextDouble();
        }

        for (i = 0; i < a; i++) {
            sum += array[i];
        }

        avg = sum / a;

        System.out.print ("Полученный массив чисел:");
        for (i = 0; i < a; i++) {
            array[i] = array[i] * avg;
            System.out.print (" " + array[i]);
        }
    }
}
