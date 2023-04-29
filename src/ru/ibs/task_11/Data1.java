package ru.ibs.task_11;

import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String str = reader.nextLine();

        System.out.print("Введите второе число: ");
        int a = reader.nextInt();

        int b = Integer.parseInt(str);
        int compare1 = Math.max(a, b);
        System.out.println("Большее число: " + compare1);

        int compare2 = Math.min(a, b);
        double c = compare2;
        System.out.println("Меньшее число: " + c);
    }
}
