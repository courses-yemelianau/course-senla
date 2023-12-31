package com.senlainc.hotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Room {
    public static final String PRICE = "PRICE";
    public static final String CAPACITY = "CAPACITY";
    public static final String STARS = "STARS";
    public static final Comparator<Room> PRICE_COMPARATOR = Comparator.comparing(Room::getPrice);
    public static final Comparator<Room> CAPACITY_COMPARATOR = Comparator.comparing(Room::getCapacity);
    public static final Comparator<Room> STARS_COMPARATOR = Comparator.comparing(Room::getStars);

    private boolean busy;
    private boolean repair;
    private boolean serve;

    private final int capacity;
    private final int stars;
    private double price;

    private final int guestsHistoryLength = 3;
    private final Guest[] guestsHistory = new Guest[guestsHistoryLength];
    private Guest guest;

    public Room(int capacity, int stars) {
        this.capacity = capacity;
        this.stars = stars;
        this.price = Math.pow(stars, 2) * capacity * 10 + 99;
    }

    public boolean isBusy() {
        return busy;
    }

    public void settle(Guest guest, int monthsCount) {
        if (!isRepair() && !isServe()) {
            this.busy = true;
            this.guest = guest;
            this.guest.setCheckInDate(new Date());
            this.guest.setMonthsCount(monthsCount);
        }
    }

    public void evict() {
        if (isBusy()) {
            this.busy = false;
            System.arraycopy(guestsHistory, 1, guestsHistory, 0, guestsHistory.length - 1);
            guestsHistory[guestsHistory.length - 1] = this.guest;
            this.guest = null;
        }
    }

    public boolean isRepair() {
        return repair;
    }

    public void repair() {
        if (!isBusy() && !isServe()) {
            this.repair = true;
        }
    }

    public void endRepair() {
        this.repair = false;
    }

    public boolean isServe() {
        return serve;
    }

    public void serve() {
        if (!isBusy() && !isRepair()) {
            this.serve = true;
        }
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

    public int getCapacity() {
        return capacity;
    }

    public int getStars() {
        return stars;
    }

    public Date getCheckOutDate() {
        return guest != null ? guest.getCheckOutDate() : new Date();
    }

    public double checkCost() {
        return guest != null ? price * guest.getMonthsCount() : 0;
    }

    public Guest[] getGuestsHistory() {
        return guestsHistory;
    }

    public Guest getGuest() {
        return guest;
    }

    public String details() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Room{" +
                "busy=" + busy +
                ", repair=" + repair +
                ", serve=" + serve +
                ", capacity=" + capacity +
                ", stars=" + stars +
                ", price=" + price +
                ", guestsPoolLength=" + guestsHistoryLength +
                ", guestsPool=" + Arrays.toString(guestsHistory) +
                ", guest=" + guest +
                '}';
    }
}
