package com.senlainc.hotel;

import java.util.Comparator;

public class GuestNameComparator implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return o1.getGuest().getName().compareTo(o2.getGuest().getName());
    }
}
