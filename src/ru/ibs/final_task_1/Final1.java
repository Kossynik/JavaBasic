package ru.ibs.final_task_1;

import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        a = reader.nextDouble();

        System.out.print("Введите сумму в рублях: ");
        b = reader.nextDouble();

        c = b / a;

        System.out.printf("Результат конвертации: %.2f", c);
    }
}
