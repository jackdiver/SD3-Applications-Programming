package app_prog.ui;

import java.sql.Array;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        

        // displayLine a welcome message
        Console.displayLine("Welcome to the Future Value Calculator");
        Console.displayLine();
        String choice = "y";

        Investment[] investments;
        investments = new Investment[5];

        int count = 0;

        while (choice.equalsIgnoreCase("y") && count < 5) {

            // get input from user
            double monthlyInvestment
                    = Console.getDouble("Enter monthly investment:   ");
            double yearlyInterestRate
                    = Console.getDouble("Enter yearly interest rate: ");
            int years
                    = Console.getInt("Enter number of years:      ");

            Investment investment = new Investment(monthlyInvestment, yearlyInterestRate, years);
            investments[count] = investment;
            investments[count].toString();
            count++;

            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }

        Console.displayLine("Future Value Calculations");
        Console.displayLine("Inv/Mo.    Rate        Years   Future Value");

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IE"));

        for (int i = 0; i < count; i++) {
            double futurevalue = investments[i].calculateFutureValue();
            Console.displayLine(investments[i].toString() + "\t\t" + nf.format(futurevalue));
        }

        Console.displayLine("Future Value Calculations If Rate Increased by 2%");
        Console.displayLine("Inv/Mo.    Rate        Years   Future Value");

        Investment[] potential;
        potential = new Investment[count];

        for (int i = 0; i < count; i++) {
            potential[i] = new Investment(investments[i].getMonthlyInvestment(), investments[i].getYearlyInterestRate() * 1.02, investments[i].getYears());
        }

        for (int i = 0; i < count; i++) {
            double futurevalue = potential[i].calculateFutureValue();
            Console.displayLine(potential[i].toString() + "\t\t" + nf.format(futurevalue));
        }

        Console.displayLine("Future Value Calculations If Rate Increased by 2%");
        Console.displayLine("Inv/Mo.    Rate        Years   Future Value");

        for (int i = 0; i < count; i++) {
            double futurevalue = potential[i].calculateFutureValue();
            if (futurevalue > 25000)
                Console.displayLine(potential[i].toString() + "\t\t" + nf.format(futurevalue));
        }

        Console.displayLine("Bye!");
    }

}