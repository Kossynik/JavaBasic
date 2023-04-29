package ru.ibs.task_12;

import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите строку (I like Java!!!): ");
        String str = reader.nextLine();

        boolean result1 = str.contains("Java");

        boolean result2 = str.startsWith("I like");

        boolean result3 = str.endsWith("!!!");

        if (result1 && result2 && result3) {
            String str1 = str.toUpperCase();
            System.out.println(str1);
        }

        String str2 = str.replace('a', 'o');
        String str3 = str2.substring(7, 11);
        System.out.println(str3);
    }
}
