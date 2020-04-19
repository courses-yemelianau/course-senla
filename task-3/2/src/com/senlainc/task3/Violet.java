package com.senlainc.task3;

public class Violet extends Flower {

    Violet() {
        this(1, "Violet", "Pretty");
    }

    Violet(double price) {
        this();
        setPrice(price);
    }

    Violet(double price, String color, String description) {
        setPrice(price);
        setName("Violet");
        setColor(color);
        setDescription(description);
    }

}
