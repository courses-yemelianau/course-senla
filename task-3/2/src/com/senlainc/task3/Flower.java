package com.senlainc.task3;

public class Flower {

    private double price;
    private String name;
    private String color;
    private String description;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Flower() {
        this(1, "Flower", "Colorful", "Wonderful");
    }

    Flower(double price) {
        this();
        this.price = price;
    }

    Flower(String name) {
        this();
        this.name = name;
    }

    Flower(double price, String name, String color, String description) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Price: %f, Name: %s, Color: %s, Description: %s\n",
                price,
                name,
                color,
                description
        );
    }

}
