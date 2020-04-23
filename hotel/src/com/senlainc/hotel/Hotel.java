package com.senlainc.hotel;

import java.util.Arrays;

public class Hotel {
    private final String name;
    private int stars;
    private int floors;
    private int roomsCount;
    private Room[] rooms;
    private int servicesCount;
    private Service[] services;

    public Hotel() {
        this.name = "ELEON";
        this.stars = 3;
        this.floors = 1;
        this.roomsCount = 10;
        rooms = new Room[this.roomsCount];
        for (int i = 0; i < this.roomsCount; ++i) {
            rooms[i] = new Room();
        }
        this.servicesCount = 3;
        services = new Service[this.servicesCount];
        for (int i = 0; i < this.servicesCount; ++i) {
            services[i] = new Service();
        }
    }

    public void addRoom() {
        Room[] rooms = new Room[++roomsCount];
        System.arraycopy(this.rooms, 0, rooms, 0, this.rooms.length);
        rooms[this.rooms.length] = new Room();
        this.rooms = rooms;
    }

    public void addService() {
        Service[] services = new Service[++servicesCount];
        System.arraycopy(this.services, 0, services, 0, this.services.length);
        services[this.services.length] = new Service();
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public int getServicesCount() {
        return servicesCount;
    }

    public void setServicesCount(int servicesCount) {
        this.servicesCount = servicesCount;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", floors=" + floors +
                ", roomsCount=" + roomsCount +
                ", servicesCount=" + servicesCount +
                ", rooms=" + Arrays.toString(rooms) +
                ", services=" + Arrays.toString(services) +
                '}';
    }
}
