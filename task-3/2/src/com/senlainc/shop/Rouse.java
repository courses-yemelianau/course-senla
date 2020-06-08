package com.senlainc.shop;

public class Rouse extends Flower {

    Rouse(double price) {
        this(price, "Red", "Barbed");
    }

    Rouse(double price, String color, String description) {
        setPrice(price);
        setName("Rouse");
        setColor(color);
        setDescription(description);
    }

}
