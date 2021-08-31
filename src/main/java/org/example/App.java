/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{

    public static void compileMessage(double tax, float total, float amount )
    {
        System.out.println(
                "The subtotal is $" + amount + ".\n"
                +"The tax is $" + tax + ".\n"
                +"The total is $" + total + "."
        );
    }

    public static int calculate(float amount, String state)
    {
        boolean taxes = false;
        double tax;
        float total;
        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin"))
        {
            tax = amount * 0.055;
            total = (float) (amount + tax);
            compileMessage(tax, total, amount);
            return 1;
        }
        tax = 0.00;
        total = amount;
        compileMessage(tax, total, amount);
        return 1;
    }

    public static void getUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float amount;
        String state;

        System.out.println("What is the order amount? ");
        amount = Float.parseFloat(reader.readLine());

        System.out.println("What is the state? ");
        state = reader.readLine();

        calculate(amount, state);
    }

    public static void main( String[] args ) throws IOException {
        getUserInput();
    }
}
