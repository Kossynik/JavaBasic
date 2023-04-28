package ru.ibs.task_4;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Значение числа x: ");
        double x = in.nextDouble();

        System.out.print("Значение числа y: ");
        double y = in.nextDouble();

        System.out.print("Значение числа z: ");
        double z = in.nextDouble();
        in.close();

        double avg = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое чисел: %f \n", avg);
        avg = avg / 2;
        double result = Math.floor(avg);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
