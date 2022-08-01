package com.patrick;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final  byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = scanner.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = (annualInterestRate/PERCENT)/MONTHS_IN_YEAR;
        System.out.print("Enter period in years: ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;
        String mortgage = NumberFormat.getCurrencyInstance().format(principle * (float) ((annualInterestRate * (Math.pow(1+numberOfPayments, period)))/((Math.pow(1+annualInterestRate, period))-1)));
        System.out.println("Mortgage is : "+mortgage);
    }
}