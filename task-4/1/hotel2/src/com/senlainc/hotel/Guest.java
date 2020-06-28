package com.senlainc.hotel;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Guest {
    public static final String NAME = "NAME";
    public static final String DATE = "DATE";

    private final String name;

    private Date checkInDate;
    private int monthsCount;

    private int servicesCount;
    private Service[] services = new Service[servicesCount];

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        if (checkInDate != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(checkInDate);
            c.add(Calendar.MONTH, monthsCount);
            return c.getTime();
        } else {
            return new Date();
        }
    }

    public int getMonthsCount() {
        return monthsCount;
    }

    public void setMonthsCount(int monthsCount) {
        this.monthsCount = monthsCount;
    }

    public Guest addService(Service service) {
        Service[] services = new Service[++servicesCount];
        System.arraycopy(this.services, 0, services, 0, this.services.length);
        services[this.services.length] = service;
        this.services = services;
        return this;
    }

    public Service[] getServicesBy(String by) {
        Service[] result = new Service[servicesCount];
        System.arraycopy(services, 0, result, 0, servicesCount);
        switch (by) {
            case Service.PRICE:
                Arrays.sort(result, Service.PRICE_COMPARATOR);
                break;
            case Service.DATE:
                Arrays.sort(result, Service.DATE_COMPARATOR);
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", checkInDate=" + checkInDate +
                ", monthsCount=" + monthsCount +
                ", servicesCount=" + servicesCount +
                ", services=" + Arrays.toString(services) +
                '}';
    }
}
