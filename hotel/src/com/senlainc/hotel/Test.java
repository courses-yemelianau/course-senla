package com.senlainc.hotel;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println(hotel);
        System.out.println();

        hotel.addRoom().setPrice(99);
        hotel.addRoom().setPrice(199);
        hotel.addRoom().setPrice(299);
        hotel.addService().setPrice(49);

        hotel.getRooms()[0].settle();
        hotel.getRooms()[1].repair();
        hotel.getRooms()[2].serve();

        System.out.println(hotel);
        System.out.println();
        System.out.println(hotel.getRooms()[0].isBusy());
        System.out.println(hotel.getRooms()[1].isRepair());
        System.out.println(hotel.getRooms()[2].isServe());
        System.out.println(hotel.getRooms()[0].getPrice());
        System.out.println(hotel.getServices()[0].getPrice());

        hotel.getRooms()[0].evict();
        hotel.getRooms()[1].endRepair();
        hotel.getRooms()[2].endServe();

        System.out.println();
        System.out.println(hotel);
    }
}
