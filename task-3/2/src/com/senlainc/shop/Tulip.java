package com.senlainc.shop;

public class Tulip extends Flower {

    Tulip() {
        this(1, "Red", "Beautiful");
    }

    Tulip(double price) {
        this(price, "Red", "Beautiful");
    }

    Tulip(double price, String color, String description) {
        setPrice(price);
        setName("Tulip");
        setColor(color);
        setDescription(description);
    }

}
