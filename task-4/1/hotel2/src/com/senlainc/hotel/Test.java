package com.senlainc.hotel;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println(hotel);
        System.out.println();

        hotel
                .addRoom(1, 4)
                .addRoom(1, 3)
                .addRoom(1, 2)
                .addRoom(2, 4)
                .addRoom(2, 3)
                .addRoom(2, 2)
                .addRoom(3, 4)
                .addRoom(3, 3)
                .addRoom(3, 2)
                .addRoom(1, 5)
                .addService(39.)
                .addService(29.)
                .addService(49.)
                .addService(59.)
                .addService(19.)
                .addGuest("Ivan")
                .addGuest("Zendaya")
                .addGuest("Tom")
                .addGuest("Sergey")
                .addGuest("Meeseeks");

        System.out.println(hotel);
        System.out.println();

        System.out.println(Arrays.toString(hotel.getRooms()));
        System.out.println(Arrays.toString(hotel.getServices()));
        System.out.println(Arrays.toString(hotel.getGuests()));
        System.out.println();

        System.out.println(hotel.emptyRoomsCount());
        System.out.println(hotel.getGuestsCount());
        System.out.println();

        System.out.println(Arrays.toString(hotel.getRoomsBy(Room.PRICE)));
        System.out.println(Arrays.toString(hotel.getRoomsBy(Room.CAPACITY)));
        System.out.println(Arrays.toString(hotel.getRoomsBy(Room.STARS)));
        System.out.println();

        System.out.println(Arrays.toString(hotel.getEmptyRoomsBy(Room.PRICE)));
        System.out.println(Arrays.toString(hotel.getEmptyRoomsBy(Room.CAPACITY)));
        System.out.println(Arrays.toString(hotel.getEmptyRoomsBy(Room.STARS)));
        System.out.println();

        hotel.getRooms()[9].settle(hotel.getGuests()[1], 1);
        hotel.getRooms()[2].settle(hotel.getGuests()[3], 3);
        hotel.getRooms()[0].settle(hotel.getGuests()[4], 2);

        System.out.println(Arrays.toString(hotel.getGuestsBy(Guest.NAME)));
        System.out.println(Arrays.toString(hotel.getGuestsBy(Guest.DATE)));
        System.out.println();

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, 1);
        System.out.println(Arrays.toString(hotel.evictBy(c.getTime())));
        System.out.println();

        System.out.println(hotel.getRooms()[2].check());
        System.out.println();

        System.out.println(Arrays.toString(hotel.getRooms()[0].getGuestsPool()));
        hotel.getRooms()[0].evict();
        System.out.println(Arrays.toString(hotel.getRooms()[0].getGuestsPool()));
        System.out.println();

        hotel.getGuests()[1].addService(hotel.getServices()[0]);
        hotel.getGuests()[1].addService(hotel.getServices()[1]);
        hotel.getGuests()[1].addService(hotel.getServices()[2]);
        System.out.println(Arrays.toString(hotel.getGuests()[1].getServicesBy(Service.PRICE)));
        System.out.println(Arrays.toString(hotel.getGuests()[1].getServicesBy(Service.DATE)));
        System.out.println();

        System.out.println(Arrays.toString(hotel.roomsPrices()));
        System.out.println(Arrays.toString(hotel.servicesPrices()));
        System.out.println();

        System.out.println(hotel.getRooms()[0].details());
        System.out.println();

        hotel.getRooms()[8].repair();
        hotel.getRooms()[7].serve();
        System.out.println(hotel.getRooms()[8].isRepair());
        System.out.println(hotel.getRooms()[7].isServe());
        System.out.println();

        hotel.getRooms()[8].endRepair();
        hotel.getRooms()[7].endServe();
        hotel.getRooms()[8].setPrice(hotel.getRooms()[8].getPrice() + 30);
        hotel.getServices()[0].setPrice(49.99);
        System.out.println(hotel.getRooms()[8].isRepair());
        System.out.println(hotel.getRooms()[7].isServe());
        System.out.println(hotel.getRooms()[7].isBusy());
        System.out.println(hotel.getRooms()[8].getPrice());
        System.out.println(hotel.getServices()[0].getPrice());
        System.out.println();

        hotel.getRooms()[2].evict();
        System.out.println(hotel.getRooms()[2]);
        System.out.println();

        System.out.println(hotel);
        System.out.println();
    }
}
