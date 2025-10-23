package com.pluralsight;

public class HotelMain {
    public static void main(String[] args) {
        Room room1 = new Room(2, 124.00, false, false);
        System.out.println(room1);
        System.out.println("Is available? " + room1.isAvailable());

        System.out.println();

        Reservation r1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + r1.getReservationTotal());

        Reservation r2 = new Reservation("double", 2, false);
        System.out.println("Reservation total: $" + r2.getReservationTotal());


        room1.checkIn();     // guest checks in
        System.out.println("After check-in: " + room1);

        room1.checkout();    // guest checks out
        System.out.println("After checkout: " + room1);

        room1.cleanRoom();   // housekeeping cleans it
        System.out.println("After cleaning: " + room1);

        System.out.println();

        Employee e1 = new Employee(101, "Janus Doeus", "Front Desk Clerk", 18.50,45);
        System.out.println("Initial Employee: " + e1);
        System.out.println("Regular Hours: " + e1.getRegularHours());
        System.out.println("Overtime Hours: " + e1.getOvertimeHours());
        System.out.println("Total Pay: $" + e1.getTotalPay());

        System.out.println();

        e1.punchIn(9.0);    // employee clocks in at 9:00 AM
        e1.punchOut(17.5);  // clocks out at 5:30 PM
        System.out.println("Total hours worked after punching: " + e1.getHoursWorked());
    }
}
