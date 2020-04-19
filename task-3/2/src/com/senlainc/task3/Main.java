package com.senlainc.task3;

public class Main {
    public static void main(String[] args) {
        Flower[] rouses = new Rouse[5];
        Flower[] violets = new Violet[5];
        Flower[] tulips = new Tulip[5];

        for (int i = 0; i < rouses.length; ++i) {
            rouses[i] = new Rouse(4.99);
        }
        for (int i = 0; i < violets.length; ++i) {
            violets[i] = new Violet(0.99);
        }
        for (int i = 0; i < tulips.length; ++i) {
            tulips[i] = new Tulip(3.99);
        }

        Bouquet bouquet = new Bouquet(rouses.length + violets.length + tulips.length);
        bouquet.add(rouses);
        bouquet.add(violets);
        bouquet.add(tulips);
        bouquet.check();
    }
}
