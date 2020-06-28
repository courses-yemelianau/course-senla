package com.senlainc.hotel;

import java.util.Comparator;

public class GuestCheckOutDateComparator implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return o1.getCheckOutDate().compareTo(o2.getCheckOutDate());
    }
}
