package com.senlainc.hotel;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println(hotel.toString());
        System.out.println();

        hotel.getRooms()[0].setBusy(true);
        hotel.getRooms()[1].setBusy(true);
        hotel.getRooms()[1].setBusy(false);

        hotel.getRooms()[2].setRepair(true);
        hotel.getRooms()[3].setServe(true);

        hotel.getRooms()[4].setPrice(199);
        hotel.getServices()[0].setPrice(199);

        hotel.addRoom();
        hotel.addService();

        System.out.println();
        System.out.println(hotel.toString());
    }
}
