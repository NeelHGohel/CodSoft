/*
 * Aim: This is the Code for Convert The Currency
 * Author: Gohel Neel
 * B.Tech. CSE Student At Darshan University
 * Rajkot, Gujrat, India
 * Date: 04-08-2024
 * 
 */

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Example exchange rates (you can modify these as needed)
        final double USD_TO_EUR = 0.92;
        final double EUR_TO_USD = 1.09;
        final double USD_TO_IND = 83.95;
        final double IND_TO_USD = 0.012;
        final double EUR_TO_IND = 91.73;
        final double IND_TO_EUR = 0.011;

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Currency Converter");
        System.out.println("1: USD to EUR");
        System.out.println("2: EUR to USD");
        System.out.println("3: USD to IND");
        System.out.println("4: IND to USD");
        System.out.println("5: EUR to IND");
        System.out.println("6: IND to EUR");
        System.out.print("Choose conversion type: ");
        int choice = sc.nextInt();

        double exchangeRate = 0;
        String fromCurrency = "";
        String toCurrency = "";

        switch (choice) {
            case 1:
                exchangeRate = USD_TO_EUR;
                fromCurrency = "USD";
                toCurrency = "EUR";
                break;
            case 2:
                exchangeRate = EUR_TO_USD;
                fromCurrency = "EUR";
                toCurrency = "USD";
                break;
            case 3:
                exchangeRate = USD_TO_IND;
                fromCurrency = "USD";
                toCurrency = "IND";
                break;

            case 4:
                exchangeRate = IND_TO_USD;
                fromCurrency = "IND";
                toCurrency = "USD";
                break;
            case 5:
                exchangeRate = EUR_TO_IND;
                fromCurrency = "EUR";
                toCurrency = "IND";
                break;

            case 6:
                exchangeRate = IND_TO_EUR;
                fromCurrency = "IND";
                toCurrency = "EUR";
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.print("Enter amount in " + fromCurrency + ": ");
        double amount = sc.nextDouble();

        double convertedAmount = amount * exchangeRate;

        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, toCurrency);

        sc.close();
    }
}
