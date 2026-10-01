package org.example;

import java.util.ArrayList;

public class Firm {
    static void main() {
        ArrayList<StaffMember> staffMembers = new ArrayList<>();

        Executive ex1 = new Executive("Dave", "Washington St", "345665", "4513-45-89", 15000.45, 0);
        staffMembers.add(ex1);

        Employee emp1 = new Employee("Dom", "William St", "987654", "94-65-41", 1200.15);
        staffMembers.add(emp1);

        Hourly hrl1 = new Hourly("Liam", "Shop St", "986532", "984-474-325", 12.45, 5);
        staffMembers.add(hrl1);

        Volunteer vol1 = new Volunteer("Grace", "O’Connell St", "557282");
        staffMembers.add(vol1);

        ex1.awardBonus(9000);

        hrl1.addHours(40);

        emp1.setPayRate(1000);

        Executive ex2 = new Executive("Tom", "Moylish Park", "784211", "4211-99-0", 1799.45, 500);
        staffMembers.add(ex2);
        ex2.awardBonus(700);

        Employee emp2 = new Employee("Aoife", "Friars Sq", "716234", "99-61-42", 2300);
        staffMembers.add(emp2);

        pay(staffMembers);
    }

    static public void pay(ArrayList<StaffMember> staffMembers){
        for (StaffMember s: staffMembers){
            System.out.println(s);
            if (s.pay() == 0){
                System.out.println("Thanks");
            }

            else {
                System.out.println("Paid: " + s.pay() + "\n");
            }
        }
    }
}
