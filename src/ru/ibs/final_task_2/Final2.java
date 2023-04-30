package ru.ibs.final_task_2;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {

        char a;
        char b;
        char c;
        char d;
        char e;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String str = reader.nextLine();

        if (str.length() > 5) {
            System.out.println("Ошибка ввода");
            return;
        }

        a = str.charAt(0);
        b = str.charAt(1);
        c = str.charAt(2);
        d = str.charAt(3);
        e = str.charAt(4);

        if (d != '=') {
            System.out.println("Ошибка ввода");
            return;
        }

        if (a == 'x') {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || e == '0' || e == '1' || e == '2' || e == '3' || e == '4' || e == '5' || e == '6' || e == '7' || e == '8' || e == '9') {
                switch (b) {
                    case '+':
                        int c1 = Character.getNumericValue(c);
                        int e1 = Character.getNumericValue(e);
                        int x1 = e1 - c1;
                        System.out.println("Корень уравнения: " + x1);
                        break;
                    case '-':
                        int c2 = Character.getNumericValue(c);
                        int e2 = Character.getNumericValue(e);
                        int x2 = e2 + c2;
                        System.out.println("Корень уравнения: " + x2);
                        break;
                    default:
                        System.out.println("Введен неверный знак");
                        return;
                }
            }
            else {
                System.out.println("Ошибка ввода");
                return;
            }
        }
        if (c == 'x') {
            if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || e == '0' || e == '1' || e == '2' || e == '3' || e == '4' || e == '5' || e == '6' || e == '7' || e == '8' || e == '9') {
                switch (b) {
                    case '+':
                        int a3 = Character.getNumericValue(a);
                        int e3 = Character.getNumericValue(e);
                        int x3 = e3 - a3;
                        System.out.println("Корень уравнения: " + x3);
                        break;
                    case '-':
                        int a4 = Character.getNumericValue(a);
                        int e4 = Character.getNumericValue(e);
                        int x4 = a4 - e4;
                        System.out.println("Корень уравнения: " + x4);
                        break;
                    default:
                        System.out.println("Введен неверный знак");
                        return;
                }
            }
            else {
                System.out.println("Ошибка ввода");
                return;
            }
        }
        if (e == 'x') {
            if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                switch (b) {
                    case '+':
                        int a5 = Character.getNumericValue(a);
                        int c5 = Character.getNumericValue(c);
                        int x5 = a5 + c5;
                        System.out.println("Корень уравнения: " + x5);
                        break;
                    case '-':
                        int a6 = Character.getNumericValue(a);
                        int c6 = Character.getNumericValue(c);
                        int x6 = a6 - c6;
                        System.out.println("Корень уравнения: " + x6);
                        break;
                    default:
                        System.out.println("Введен неверный знак");
                        return;
                }
            }
            else {
                System.out.println("Ошибка ввода");
                return;
            }
        }
    }
}
