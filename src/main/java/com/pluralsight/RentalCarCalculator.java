package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //created a scanner.

        //asked the user for the pickup date
        System.out.println("What date would you like to pick up your car MM/DD/YYYY");
        String pickupDate = scanner.nextLine();

        //asked the user for how many days they want to rent.
        System.out.println("How many days do you want to rent the car?");
        int days = scanner.nextInt();
        scanner.nextLine();

        //asked the user if they want a toll tag.
        System.out.println("Do you want a electronic toll tag for $3.95/day (yes/no)");
        String tollTag = scanner.nextLine();


        //asked the user if they want gps.
        System.out.println("Do you want a GPS for $2.95/day (yes/no)");
        String gps = scanner.nextLine();

        //asked the user if they want roadside assistance/
        System.out.println("Do you want roadside assistance for $3.95/day (yes/no)");
        String roadSide = scanner.nextLine();

        //asked the user for their name.
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        //calculates the daily price and the optional cost
        double basicRental = days * 29.99;
        double optionalCost = 0;

        // if statements to check if they want any optional stuff
        if (tollTag.equalsIgnoreCase("yes"))
            optionalCost += days * 3.95;

        if (gps.equalsIgnoreCase("yes"))
            optionalCost += days * 2.95;

        if (roadSide.equalsIgnoreCase("yes"))
            optionalCost += days * 3.95;

        //double calculate
        double underageSurcharge = 0;
        if (age < 25)
            underageSurcharge += basicRental * 0.30;

        //Calculate the total cost.
        double totalCost = basicRental + optionalCost + underageSurcharge;

        //sout the total cost
        System.out.println("");
        System.out.printf("Basic car rental: $%.2f%n", basicRental);
        System.out.printf("Options cost: $%.2f%n", optionalCost);
        System.out.printf("Underage driver surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }

}

