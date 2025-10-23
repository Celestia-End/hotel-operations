package com.pluralsight;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(int id, String name, String position, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public int getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * hourlyRate;
        double overtimePay = getOvertimeHours() * (hourlyRate * 1.5);
        return regularPay + overtimePay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
