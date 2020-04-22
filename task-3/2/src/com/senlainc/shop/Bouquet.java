package com.senlainc.shop;

public class Bouquet {

    private double totalPrice = 0;
    private int count = 0;
    private final Flower[] bouquet;

    Bouquet(int count) {
        bouquet = new Flower[count];
    }

    private void addPrice(int cost) {
        totalPrice += cost;
    }

    void add(Flower[] flowers) {
        int cost = 0;
        for (Flower flower : flowers) {
            if (bouquet.length > count) {
                bouquet[count++] = flower;
                cost += flower.getPrice();
            }
        }
        addPrice(cost);
    }

    void check() {
        System.out.print(String.format("Total Price: %f\nTotal Count: %d\n\n", totalPrice, bouquet.length));
        for (Flower flower : bouquet) {
            System.out.println(flower.toString());
        }
        System.out.print("\nThank you for your purchase.\n");
    }

}
