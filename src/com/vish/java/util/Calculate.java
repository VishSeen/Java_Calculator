package com.vish.java.util;


import com.sun.xml.internal.bind.v2.TODO;

/**
 * Simple calculate object that have the calculation methods and variables.
 */
public class Calculate {
    private double total, firstNum, secNum;

    /** Constructors */
    public Calculate(){
    }


    /** Methods */
    public double sum(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public double average(double a, double b){
        return sum(a, b) / 2;
    }

    // to recode
    public double factorial(double num){
        if(num <= 0){
            num = 1;
        } else {
            num = (num - 1) * factorial(num);
        }

        return num;
    }
}

