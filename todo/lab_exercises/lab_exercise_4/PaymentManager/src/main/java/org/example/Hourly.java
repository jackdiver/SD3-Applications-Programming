package org.example;

public class Hourly extends Employee{
    private double hoursWorked;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void addHours(double hours){
        this.hoursWorked += hours;
    }

    public void subtractHours(double hours){
        this.hoursWorked -= hours;
    }

    public Hourly() {
    }

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate, double hoursWorked) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "[Hourly]\n" + super.toString() +
                "\nHours Worked: " + hoursWorked;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public double pay() {
        return this.getPayRate() * this.hoursWorked;
    }
}
