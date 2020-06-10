package com.senlainc.hotel;

public class Room {
    private boolean busy = false;
    private boolean repair = false;
    private boolean serve = false;
    private double price;

    public boolean isBusy() {
        return busy;
    }

    public void settle() {
        this.busy = true;
    }

    public void evict() {
        this.busy = false;
    }

    public boolean isRepair() {
        return repair;
    }

    public void repair() {
        this.repair = true;
    }

    public void endRepair() {
        this.repair = false;
    }

    public boolean isServe() {
        return serve;
    }

    public void serve() {
        this.serve = true;
    }

    public void endServe() {
        this.serve = false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "busy=" + busy +
                ", repair=" + repair +
                ", serve=" + serve +
                ", price=" + price +
                '}';
    }
}
