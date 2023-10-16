package org.Learnig;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args){
        final byte PERCENT = 100;
        final byte MONTH_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annual_rate = scanner.nextFloat();
        float month =(annual_rate/PERCENT)/MONTH_YEAR;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        period *= MONTH_YEAR;


        Double mortgage = principal
                * ((month * Math.pow((1+month), period)
                / (Math.pow((1+month), period) - 1)));

        String mort_form = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mort_form);

    }
}