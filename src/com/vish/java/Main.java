package com.vish.java;

import com.vish.java.util.Calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int commandNum;
        double firstNum, secNum;
        Scanner scan = new Scanner(System.in);

        //Calculate object
        Calculate calculate = new Calculate();

        // loading the UI
        loadInterface();

        //prompt to enter calculator command
        System.out.print("Enter command number: ");
        commandNum = scan.nextInt();



        /**
         * switch between command to do calculation.
         */
        switch (commandNum){
            case 1:
                System.out.print("Enter First number: ");
                firstNum = scan.nextDouble();
                System.out.print("Enter Second number: ");
                secNum = scan.nextDouble();

                System.out.println("The sum is:" + calculate.sum(firstNum, secNum));

                System.out.println(" ");
                System.out.println(" ");
                break;

            case 2:
                System.out.print("Enter First number: ");
                firstNum = scan.nextDouble();
                System.out.print("Enter Second number: ");
                secNum = scan.nextDouble();

                System.out.println("The subtraction is:" + calculate.subtract(firstNum, secNum));

                System.out.println(" ");
                System.out.println(" ");
                break;

            case 3:
                System.out.print("Enter First number: ");
                firstNum = scan.nextDouble();
                System.out.print("Enter Second number: ");
                secNum = scan.nextDouble();

                System.out.println("The division is:" + calculate.divide(firstNum, secNum));

                System.out.println(" ");
                System.out.println(" ");
                break;

            case 4:
                System.out.print("Enter First number: ");
                firstNum = scan.nextDouble();
                System.out.print("Enter Second number: ");
                secNum = scan.nextDouble();

                System.out.println("The multiplication is:" + calculate.multiply(firstNum, secNum));

                System.out.println(" ");
                System.out.println(" ");
                break;

            case 5:
                System.out.print("Enter First number: ");
                firstNum = scan.nextDouble();
                System.out.print("Enter Second number: ");
                secNum = scan.nextDouble();

                System.out.println("The Average is:" + calculate.average(firstNum, secNum));

                System.out.println(" ");
                System.out.println(" ");
                break;

            default:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Unfortunately this number is unavailable.. Retry..");

                System.out.println("Re Enter command number: ");
                commandNum = scan.nextInt();
                break;
        }
    }



    /** This is loads the Basic UI */
    public static void loadInterface(){
        System.out.println(" ");

        System.out.println("---------------------");
        System.out.println("  SIMPLE CALCULATOR  ");
        System.out.println("---------------------");

        System.out.println(" ");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("5. Average");

        System.out.println(" ");

        System.out.println("0. Quit");

        System.out.println(" ");
    }
}
