package org.Learnig;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTH_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1K - $1M): ");
        int principal = scanner.nextInt();
        if (principal < 1000 || principal > 1000000) {
            System.out.println("Enter a number between 1,000 and 1,000,000");
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate: ");
        float annual_rate = scanner.nextFloat();
        if (annual_rate <= 0 || annual_rate > 30) {
            System.out.println("Enter a value greater than 0 and less or equal to 30");
            System.out.print("Annual Interest Rate: ");
            annual_rate = scanner.nextFloat();
        }
        float month = (annual_rate / PERCENT) / MONTH_YEAR;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        if (period <= 0 || period > 30){
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
        }
        period *= MONTH_YEAR;


        Double mortgage = principal
                * ((month * Math.pow((1+month), period)
                / (Math.pow((1+month), period) - 1)));

        String mort_form = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mort_form);

    }
}