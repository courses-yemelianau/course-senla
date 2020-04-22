package com.senlainc.number;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number = new Random().nextInt(900) + 100;
        int digit = 0, j = 1, d;
        while (j != 1000) {
            d = (number / j) % 10;
            if (digit < d) {
                digit = d;
            }
            j *= 10;
        }
        System.out.print("Результат:\n" +
                number + ": случайно сгенерированное трёхзначное натуральное число\n" +
                digit + ": его наибольшая цифра\n"
        );
    }
}
