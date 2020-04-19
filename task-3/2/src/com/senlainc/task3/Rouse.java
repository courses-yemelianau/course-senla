package com.senlainc.task3;

public class Rouse extends Flower {

    Rouse() {
        this(1, "Red", "Barbed");
    }

    Rouse(double price) {
        this();
        setPrice(price);
    }

    Rouse(double price, String color, String description) {
        setPrice(price);
        setName("Rouse");
        setColor(color);
        setDescription(description);
    }

}
