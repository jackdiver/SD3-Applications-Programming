package org.example;

public class Employee extends StaffMember{
    private String socialSecurityNumber;
    private double payRate;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "[Employee]\n" + super.toString() +
                "\nsocialSecurityNumber: " + socialSecurityNumber;
    }

    @Override
    public double pay() {
        return this.payRate;
    }

    public Employee() {
    }

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }


}
