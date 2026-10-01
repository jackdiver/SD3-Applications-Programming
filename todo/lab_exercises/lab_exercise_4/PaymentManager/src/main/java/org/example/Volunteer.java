package org.example;

public class Volunteer extends StaffMember{
    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "[Volunteer]\n" + super.toString();
    }

    public Volunteer() {
    }

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }
}
