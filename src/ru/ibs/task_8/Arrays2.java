package ru.ibs.task_8;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        int n;
        int i;
        int sum = 0;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите целое положительное число n: ");
        n = reader.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка ввода");
            return;
        }

        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до n: " + sum);
    }
}
