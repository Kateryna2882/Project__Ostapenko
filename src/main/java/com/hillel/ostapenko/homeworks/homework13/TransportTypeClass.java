package com.hillel.ostapenko.homeworks.homework13;

public class TransportTypeClass {
    private String title;
    public static final TransportTypeClass MOTORCYCLE = new TransportTypeClass("Мотоцикл");
    public static final TransportTypeClass CAR = new TransportTypeClass("Машина");
    public static final TransportTypeClass BUS = new TransportTypeClass("Автобус");
    public static final TransportTypeClass TRUCK = new TransportTypeClass("Грузовик");

    public String getTitle() {
        return title;
    }

    private TransportTypeClass(String title) {
        this.title = title;
    }
}
