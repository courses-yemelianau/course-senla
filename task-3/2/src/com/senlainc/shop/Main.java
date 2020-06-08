package com.senlainc.shop;

public class Main {
    public static void main(String[] args) {
        int length = 3;
        int lastFlowersCode = length - 1;
        Flower[] rouses = new Rouse[length];
        Flower[] violets = new Violet[length];
        Flower[] tulips = new Tulip[length];

        for (int i = 0; i < lastFlowersCode; ++i) {
            rouses[i] = new Rouse(4.99);
            violets[i] = new Violet(0.99);
            tulips[i] = new Tulip(3.99);
        }
        rouses[lastFlowersCode] = new Rouse(5, "White", "Odorous");
        violets[lastFlowersCode] = new Violet(1, "Purple", "Looks beautiful");
        tulips[lastFlowersCode] = new Tulip(4, "Yellow", "Sunny");

        Bouquet bouquet = new Bouquet(rouses.length + violets.length + tulips.length);
        bouquet.add(rouses);
        bouquet.add(violets);
        bouquet.add(tulips);
        bouquet.check();
    }
}
