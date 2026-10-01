package org.example;

public class Executive extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void awardBonus(double bonus){
        this.bonus = bonus;
    }

    public void resetBonus(){
        this.bonus = 0;
    }

    public Executive() {
    }

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate, double bonus) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "[Executive]\n" + super.toString();
    }

    @Override
    public double pay() {
        return this.getPayRate() + this.bonus;
    }
}
