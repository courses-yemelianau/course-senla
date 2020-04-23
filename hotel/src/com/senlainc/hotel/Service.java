package com.senlainc.hotel;

public class Service {
    private static int id = 0;
    private int service;
    private double price;

    public Service() {
        this.service = id++;
        this.price = 99;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nService{" +
                "service=" + service +
                ", price=" + price +
                '}';
    }
}
