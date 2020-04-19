package com.senlainc.task3;

public class Tulip extends Flower {

    Tulip() {
        this(1, "Red", "Beautiful");
    }

    Tulip(double price) {
        this();
        setPrice(price);
    }

    Tulip(double price, String color, String description) {
        setPrice(price);
        setName("Tulip");
        setColor(color);
        setDescription(description);
    }

}
