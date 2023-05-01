package ru.ibs.final_task_3;

import java.util.*;

public class Final3 {
    public static void main(String[] args) {

        int n;
        int i;

        Scanner reader1 = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        n = reader1.nextInt();

        String[] str = new String[n];
        Integer[] str1 = new Integer[n];
        String[][] str2 = new String[n][2];

        Scanner reader2 = new Scanner(System.in);
        for (i = 0; i < str.length; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            str[i] = reader2.nextLine();
        }

        for (i = 0; i < str.length; i++) {
            Set<Character> chars = new TreeSet<>();
            for (char c : str[i].toCharArray()) {
                chars.add(c);
            }
            str1[i] = chars.size();
            String size;
            size = Integer.toString(chars.size());
            str2[i][1] = size;
            str2[i][0] = str[i];
        }

        Arrays.sort(str1, Collections.reverseOrder());

        for (i = 0; i < str.length; i++) {
            int FromStr1 = str1[0];
            int FromStr2 = Integer.parseInt(str2[i][1]);
            if (FromStr2 == FromStr1) {
                System.out.print("Строка с наибольшим количеством уникальных символов:\n" + str2[i][0]);
            }
        }
    }
}
