package com.senlainc.hotel;

import java.util.Arrays;
import java.util.Date;

public class Hotel {
    private int guestsCount;
    private int roomsCount;
    private int servicesCount;
    private Guest[] guests = new Guest[guestsCount];
    private Room[] rooms = new Room[roomsCount];
    private Service[] services = new Service[servicesCount];

    public Hotel addGuest(String name) {
        Guest[] guests = new Guest[++guestsCount];
        System.arraycopy(this.guests, 0, guests, 0, this.guests.length);
        guests[this.guests.length] = new Guest(name);
        this.guests = guests;
        return this;
    }

    public Hotel addRoom(int capacity, int stars) {
        Room[] rooms = new Room[++roomsCount];
        System.arraycopy(this.rooms, 0, rooms, 0, this.rooms.length);
        rooms[this.rooms.length] = new Room(capacity, stars);
        this.rooms = rooms;
        return this;
    }

    public Hotel addService(Double price) {
        Service[] services = new Service[++servicesCount];
        System.arraycopy(this.services, 0, services, 0, this.services.length);
        services[this.services.length] = new Service(price);
        this.services = services;
        return this;
    }

    public Guest[] getGuests() {
        return guests;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Service[] getServices() {
        return services;
    }

    public int emptyRoomsCount() {
        int count = 0;
        for (Room room : rooms) {
            if (!room.isBusy()) {
                ++count;
            }
        }
        return count;
    }

    private Room[] getRoomsBy(Room[] rooms, String by) {
        Room[] result = new Room[rooms.length];
        System.arraycopy(rooms, 0, result, 0, rooms.length);
        switch (by) {
            case Room.PRICE:
                Arrays.sort(result, Room.PriceComparator);
                break;
            case Room.CAPACITY:
                Arrays.sort(result, Room.CapacityComparator);
                break;
            case Room.STARS:
                Arrays.sort(result, Room.StarsComparator);
                break;
        }
        return result;
    }

    public Room[] getRoomsBy(String by) {
        return getRoomsBy(rooms, by);
    }

    public Room[] getEmptyRoomsBy(String by) {
        Room[] rooms = new Room[emptyRoomsCount()];
        int i = 0;
        for (Room room : this.rooms) {
            if (!room.isBusy()) {
                rooms[i++] = room;
            }
        }
        return getRoomsBy(rooms, by);
    }

    public int getGuestsCount() {
        return guestsCount;
    }

    public Room[] getGuestsBy(String by) {
        Room[] result = new Room[roomsCount - emptyRoomsCount()];
        int i = 0;
        for (Room room : this.rooms) {
            if (room.isBusy()) {
                result[i++] = room;
            }
        }
        switch (by) {
            case Guest.NAME:
                Arrays.sort(result, new GuestNameComparator());
                break;
            case Guest.DATE:
                Arrays.sort(result, new GuestCheckOutDateComparator());
                break;
        }
        return result;
    }

    public Room[] evictBy(Date date) {
        int count = 0;
        for (Room room : rooms) {
            if (room.getCheckOutDate().compareTo(date) < 0) {
                ++count;
            }
        }
        Room[] result = new Room[count];
        count = 0;
        for (Room room : rooms) {
            if (room.getCheckOutDate().compareTo(date) < 0) {
                result[count++] = room;
            }
        }
        return result;
    }

    public double[] roomsPrices() {
        Room[] rooms = getRoomsBy(Room.PRICE);
        double[] prices = new double[roomsCount];
        int i = 0;
        for (Room room : rooms) {
            prices[i++] = room.getPrice();
        }
        return prices;
    }

    public double[] servicesPrices() {
        Service[] services = new Service[servicesCount];
        System.arraycopy(this.services, 0, services, 0, servicesCount);
        Arrays.sort(services, Service.PriceComparator);
        double[] prices = new double[servicesCount];
        int i = 0;
        for (Service service : services) {
            prices[i++] = service.getPrice();
        }
        return prices;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "guestsCount=" + guestsCount +
                ", roomsCount=" + roomsCount +
                ", servicesCount=" + servicesCount +
                ", guests=" + Arrays.toString(guests) +
                ", rooms=" + Arrays.toString(rooms) +
                ", services=" + Arrays.toString(services) +
                '}';
    }
}
