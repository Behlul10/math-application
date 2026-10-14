package com.pluralsight;

/**
 * Excercise 3 - workbook 1C
 * @Author: Behlul Vardal
 */
public class MathApp {
    public static void main(String[] args) {
        /*
        * Question 1
        * Highest Salary
         */
        System.out.println("------QUESTION 1------");
        System.out.println("----Highest Salary-----");

        //Initilizing and Declaring Variables
        float bobSalary = 450000;
        float garySalary = 120000;
        float highestSalary;

        if (bobSalary > garySalary) { // checking if bob has a higher salary than Gary
            System.out.println("The highest salary is: " + bobSalary + " which is Bob's salary");
        }
        else { //if bobs salary wasn't higher
            System.out.println("The highest salary is: " + garySalary + " which is Gary's Salary");
        }

        /*
         * Question 2
         * Smallest
         */
        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("----QUESTION 2---");
        System.out.println("------Smallest----");

        //Initilizing and Declaring Variables
        float carPrice = 1000;
        float truckPrice = 50000;

        if (truckPrice < carPrice) { //checking which int has a higher value
            System.out.println("The smallest price is the truck going at: $" + truckPrice);
        } else {
            System.out.println("The smallest price is the car going at: $" + carPrice);
        }

        /*
         * Question 3
         * Area of circle
         */
        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 3---");
        System.out.println("---Area of Circle----");

        //Initilizing and declaring circle radius
        double circleRadius = 7.25;
        //printing and operating the Area of a circle PI * radius^2
        System.out.println("The area of the circle is: " + (Math.PI * Math.pow(circleRadius, 2)));

        /*
         * Question 4
         * Square root
         */
        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 4---");
        System.out.println("---Square Root----");

        // Initilizing, Declaring, and operating variables
        float my_num = 5.0f;
        float sqrt_num = (float) Math.sqrt(my_num); //using Math method to square root our variable
        System.out.println("The square root of " + my_num + " is: " + sqrt_num); // printing

        /*
         * Question 5
         * Distance between points
         */
        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 5---");
        System.out.println("---Distance Between Point----");

        //Initilizing and declaring Variables
        //subtracting two points to find the difference and then getting its absolute value to always have a positive number
        int pointOneX = 5;
        int pointOneY = 10;
        int distanceBetweenOne = Math.abs(pointOneX - pointOneY);
        System.out.println("The distance between point " + pointOneX + " and point " + pointOneY + " is: " + distanceBetweenOne);

        int pointTwoX = 85;
        int pointTwoY = 50;
        int distanceBetweenTwo = Math.abs(pointTwoX - pointTwoY);
        System.out.println("The distance between point " + pointTwoX + " and point " + pointTwoY + " is: " + distanceBetweenTwo);


        /*
         * Question 6
         * absolute value
         */
        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 6---");
        System.out.println("---Absolute Value----");

        // Initilizing
        float absoluteValue = (float) Math.abs(-3.8);
        System.out.println("The absolute value of -3.8 is: " + absoluteValue);

        /*
         * Question 7
         * Random Num
         */

        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 7---");
        System.out.println("---Random Num----");

        System.out.println("Random Number: " + Math.random());


        /*
         * Question 8
         * Miliseconds, days, and Minutes
         */

        System.out.println("------------------- ");
        System.out.println("------------------- ");
        System.out.println("---Question 8---");
        System.out.println("---Miliseconds, days, and Minutes----");

        //Initilizing, Declarations, and operations
        int myDays = 24;
        int convertedToMinutes = myDays * 1_440; //days * 1440 is the forumla to convert day to mins
        System.out.println("There are " + convertedToMinutes + " minutes in " + myDays + " days." );

        int covertedTomili = myDays * 86_400_000; //day --> milisecond = number of day * 86,400,000
        System.out.println("There are also " + covertedTomili + " miliseconds " + myDays + " days.");
    }
}
