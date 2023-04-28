package ru.ibs.task_5;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double a;
        double b;
        char c;
        double result;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = reader.nextDouble();

        System.out.print("Введите второе число: ");
        b = reader.nextDouble();

        System.out.print("Введите знак операции: ");
        c = reader.next().charAt(0);

        switch (c) {
            case '+': result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
                break;
            default:  System.out.println("Введен неверный знак");
                return;
        }
        System.out.println(result);
    }
}
