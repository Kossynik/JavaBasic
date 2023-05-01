package ru.ibs.final_task_4;

import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {

        String answer1;
        boolean rightAnswer2;
        String hint = "Подсказка: Нежелательное ПО в обертке";
        int tryCount = 0;

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner reader = new Scanner(System.in);
        System.out.print("Ответ: ");

        while (tryCount < 3) {
            answer1 = reader.nextLine();
            rightAnswer2 = answer1.equalsIgnoreCase("Заархивированный вирус");
            if (answer1.equalsIgnoreCase("Подсказка")) {
                if(tryCount == 0) {
                    System.out.println(hint);
                    tryCount = 2;
                }
                else {
                    System.out.println("Подсказка уже недоступна");
                }
            }
            else if (rightAnswer2) {
                System.out.println("Правильно!");
                break;
            }
            else if (tryCount < 2){
                System.out.println("Подумай еще");
                tryCount++;
            }
            else {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
