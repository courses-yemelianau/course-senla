package com.senlainc.hotel;

public class Room {
    private static int id = 0;
    private int room;
    private int floor;
    private boolean busy;
    private boolean repair;
    private boolean serve;
    private double price;

    public Room() {
        this.room = id++;
        this.floor = 1;
        this.busy = false;
        this.repair = false;
        this.serve = false;
        this.price = 99;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public boolean isServe() {
        return serve;
    }

    public void setServe(boolean serve) {
        this.serve = serve;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "room=" + room +
                ", floor=" + floor +
                ", busy=" + busy +
                ", repair=" + repair +
                ", serve=" + serve +
                ", price=" + price +
                '}';
    }
}
