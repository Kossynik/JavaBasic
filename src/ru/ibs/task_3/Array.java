package ru.ibs.task_3;

public class Array {
    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5};
        int first = myArray[0];
        int last = myArray[myArray.length - 1];
        int average = myArray[myArray.length - 3];
        myArray[0] = last;
        myArray[myArray.length - 1] = first;
        int sum = myArray[0] + average;
        System.out.println(sum);
    }
}
