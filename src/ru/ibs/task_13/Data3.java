package ru.ibs.task_13;

import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = reader.nextLine();

        String [] str1 = str.split(" ");
        int counter = 0;

        for (String words : str1) {
            words = words.replaceAll("[^a-zA-Z]", "");
            if (words.length() > 0) {
                System.out.println(words);
                counter++;
            }
        }
        System.out.println(counter);
    }
}
