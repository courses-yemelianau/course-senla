package com.senlainc.hotel;

public class Service {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                '}';
    }
}
