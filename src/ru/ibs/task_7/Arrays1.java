package ru.ibs.task_7;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        int a;
        int i;

        double x, y, z;
        x = 15;
        y = 5;
        z = 14.21;

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

        System.out.print ("Полученный массив чисел:");
        for (i = 0; i < a; i++) {
            System.out.print (" " + array[i]);
        }

        for (i = 0; i < a; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("\nДанное значение имеется в константах");
            }
        }
    }
}
