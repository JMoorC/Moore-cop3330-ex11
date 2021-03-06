/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ex11 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = parseDouble(inScan.nextLine());
        System.out.print("What is the exchange rate? ");
        double rate = parseDouble(inScan.nextLine());

        double dollars = euros * rate;
        int hold = (int) (dollars * 1000000);
        dollars = Math.ceil( (hold / 10000.0) ) / 100.0;

        System.out.printf("%.2f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, rate, dollars);
    }
}
