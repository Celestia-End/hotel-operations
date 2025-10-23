package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room not available for check-in.");
        } else {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in successfully.");
        }
    }

    public void checkout() {
        if (!occupied) {
            System.out.println("Room is not currently occupied.");
        } else {
            occupied = false;
            // stays dirty after checkout
            System.out.println("Guest checked out. Room now dirty and vacant.");
        }
    }

    public void cleanRoom() {
        dirty = false;
        System.out.println("Room has been cleaned and is now available.");
    }
}
