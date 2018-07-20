package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // Get user's name
        String userName;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        userName = user_input.next();

        // User greeting using the time of the day
        Calendar c = Calendar.getInstance();
        int hours = c.get(Calendar.HOUR_OF_DAY);

        if (hours >= 1 && hours <= 12) {
            System.out.println("Good morning " + userName);
        } else if (hours >= 12 && hours <= 16) {
            System.out.println("Good afternoon " + userName);
        } else if (hours >= 16 && hours <= 24) {
            System.out.println("Good evening " + userName);

        }

        // Get user's age
        int userAge;
        do {
            System.out.println("Please enter your age: ");
            while (!user_input.hasNextInt()) {
                String input = user_input.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            userAge = user_input.nextInt();
        } while (userAge < 0);


        // Gets App's age
        Random appAge = new Random();
        int max = 90;
        int min = 18;

        int randomNum = appAge.nextInt((max - min) + 1) + min;
        int diffAge;

        if (randomNum == userAge) {
            System.out.println("I am " + randomNum + " which is the same age as you");
        } else if (randomNum > userAge) {
            diffAge = randomNum - userAge;
            System.out.println("I am " + randomNum + " which is " + diffAge + " years older than you");
        } else if (randomNum < userAge) {
            diffAge = userAge - randomNum;
            System.out.println("I am " + randomNum + " which is " + diffAge + " years younger than you");

        }

        // Multiplies Apps age by 2
        System.out.println("Twice my age would be " + randomNum * 2);

        //Checks if Apps age is even or odd
        if (randomNum % 2 == 0)
        {
            System.out.println("My age is even." );
        }
        else
        {
            System.out.println("My age is odd");
        }
    }

}
