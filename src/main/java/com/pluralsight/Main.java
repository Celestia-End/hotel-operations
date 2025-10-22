package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 124.00, false, false);
        System.out.println(room1);
        System.out.println("Is available? " + room1.isAvailable());

        Reservation r1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + r1.getReservationTotal());

        Reservation r2 = new Reservation("double", 2, false);
        System.out.println("Reservation total: $" + r2.getReservationTotal());
    }
}
