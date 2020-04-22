package com.senlainc.shop;

public class Violet extends Flower {

    Violet() {
        this(1, "Violet", "Pretty");
    }

    Violet(double price) {
        this(price, "Violet", "Pretty");
    }

    Violet(double price, String color, String description) {
        setPrice(price);
        setName("Violet");
        setColor(color);
        setDescription(description);
    }

}
