package com.senlainc.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number = new Random().nextInt(899) + 100;
        int digit = 0;
        int[] numbers = new int[3];
        for (int i = 0, j = 1; i < 3; ++i, j = j * 10) {
            numbers[i] = (number / j) % 10;
            if (digit < numbers[i]) {
                digit = numbers[i];
            }
        }
        System.out.print("Результат:\n" +
                number + ": случайно сгенерированное трёхзначное натуральное число\n" +
                digit + ": его наибольшая цифра\n"
        );
    }
}
