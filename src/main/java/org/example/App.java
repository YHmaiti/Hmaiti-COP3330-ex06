/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program determines how many years are left until retirement
// and the year you can retire. It should prompt for the current age
// and the age you want to retire and display the output as shown
// in the assignment prompt.

package org.example;

import java.util.*;

public class App {

    public static void main( String[] args ) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for their current age
        // and store it in a variable called age
        System.out.print("What is your current age? ");
        int age = Integer.valueOf(scanner.nextLine());

        // prompt the user for the age when they would like to retire
        // and store it in a variable called retireAge
        System.out.print("At what age would you like to retire? ");
        int retireAge = Integer.valueOf(scanner.nextLine());

        // check if the retirement age is valid
        // if not prompt the user to enter a valid retirement age
        while (retireAge < age) {

            System.out.println("The retirement age entered is not valid try again!!");
            retireAge = Integer.valueOf(scanner.nextLine());

        }

        // output the years left until retirement as described by te assignment
        System.out.println("You have " + (retireAge - age) + " years left until you can retire.");

        // get the current year and store it in a variable called year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        // output the current year and the year when the user can retire
        // as described by the assignment
        System.out.print("It's " + year + ", so you can retire in " + (year + (retireAge - age)) + ".");

    }
}
