package com.senlainc.number;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number = new Random().nextInt(900) + 100;
        int maxDigit = 0, j = 1, digit;
        while (j != 1000) {
            digit = (number / j) % 10;
            if (maxDigit < digit) {
                maxDigit = digit;
            }
            j *= 10;
        }
        System.out.print("Результат:\n" +
                number + ": случайно сгенерированное трёхзначное натуральное число\n" +
                maxDigit + ": его наибольшая цифра\n"
        );
    }
}
