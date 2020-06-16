package com.senlainc.hotel;

import java.util.Comparator;
import java.util.Date;

public class Service {
    public static final String PRICE = "PRICE";
    public static final String DATE = "DATE";

    private double price;
    private final Date date = new Date();

    public static final Comparator<Service> PriceComparator = Comparator.comparing(Service::getPrice);
    public static final Comparator<Service> DateComparator = Comparator.comparing(Service::getDate);

    Service(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                ", date=" + date +
                '}';
    }
}
