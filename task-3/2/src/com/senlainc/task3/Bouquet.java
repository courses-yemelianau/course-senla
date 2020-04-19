package com.senlainc.task3;

public class Bouquet {

    private double totalPrice = 0;
    private int count = 0;
    private final Flower[] bouquet;

    Bouquet(int count) {
        bouquet = new Flower[count];
    }

    void countPrice() {
        totalPrice = 0;
        for (int i = 0; i < count; ++i) {
            totalPrice += bouquet[i].getPrice();
        }
    }

    void add(Flower[] flowers) {
        for (Flower flower : flowers) {
            if (bouquet.length > count) {
                bouquet[count++] = flower;
            }
        }
        countPrice();
    }

    void check() {
        System.out.print(String.format("Total Price: %f\nTotal Count: %d\n\n", totalPrice, bouquet.length));
        for (Flower flower : bouquet) {
            System.out.print(flower.toString());
        }
        System.out.print("\nThank you for your purchase.\n");
    }

}
