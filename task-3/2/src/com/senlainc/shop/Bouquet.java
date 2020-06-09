package com.senlainc.shop;

public class Bouquet {

    private double totalPrice = 0;
    private int count = 0;
    private final Flower[] flowers;

    Bouquet(int count) {
        flowers = new Flower[count];
    }

    private void addCost(int cost) {
        totalPrice += cost;
    }

    void add(Flower[] flowers) {
        int cost = 0;
        for (Flower flower : flowers) {
            if (this.flowers.length > count) {
                this.flowers[count++] = flower;
                cost += flower.getPrice();
            }
        }
        addCost(cost);
    }

    void check() {
        System.out.print(String.format("Total Price: %f\nTotal Count: %d\n\n", totalPrice, flowers.length));
        for (Flower flower : flowers) {
            System.out.println(flower.toString());
        }
        System.out.print("\nThank you for your purchase.\n");
    }

}
