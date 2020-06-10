package com.senlainc.hotel;

import java.util.Arrays;

public class Hotel {
    private int roomsCount = 0;
    private Room[] rooms = new Room[roomsCount];
    private int servicesCount = 0;
    private Service[] services = new Service[servicesCount];

    public Room addRoom() {
        Room[] rooms = new Room[++roomsCount];
        System.arraycopy(this.rooms, 0, rooms, 0, this.rooms.length);
        rooms[this.rooms.length] = new Room();
        this.rooms = rooms;
        return this.rooms[this.rooms.length - 1];
    }

    public Service addService() {
        Service[] services = new Service[++servicesCount];
        System.arraycopy(this.services, 0, services, 0, this.services.length);
        services[this.services.length] = new Service();
        this.services = services;
        return this.services[this.services.length - 1];
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Service[] getServices() {
        return services;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomsCount=" + roomsCount +
                ", rooms=" + Arrays.toString(rooms) +
                ", servicesCount=" + servicesCount +
                ", services=" + Arrays.toString(services) +
                '}';
    }
}
