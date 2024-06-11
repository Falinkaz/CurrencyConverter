package main;

import CurrencyConverter.ConverterAPI;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String fromCurrency = "   ";
        String toCurrency = "   ";
        int option = 0;
        String menu = """
                
                Welcome to Rob's Currency Converter! Please choose a valid option (1-7) from the menu:
                
                1) US Dollar =>> Argentine Peso
                2) Argentine Peso =>> US Dollar
                3) US Dollar =>> Brazilian Real
                4) Brazilian Real =>> US Dollar
                5) US Dollar = Mexican Peso
                6) Mexican Peso = US Dollar
                7) Exit
                          
                ***********************************************************
               """;

        Scanner keyboard = new Scanner(System.in);
        ConverterAPI call = new ConverterAPI();

        while (option != 7) {
            System.out.println(menu);
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "MXN";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 6:
                    fromCurrency = "MXN";
                    toCurrency = "USD";
                    System.out.println("You chose " + fromCurrency + " =>> " + toCurrency+", now, enter the amount to exchange");
                    break;
                case 7:
                    System.out.println("Exiting program. Thanks for using Rob's Currency Converter!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again");
            }
            if (option >= 1 && option <= 6) {
                double amount = keyboard.nextDouble();
                double value = call.getRate(fromCurrency, toCurrency);
                double result = amount * value;
                DecimalFormat formatted = new DecimalFormat("#.00");
                System.out.println("The exchange rate from $"+amount+" "+fromCurrency+" to "+toCurrency+" is: $"+formatted.format(result));
            }


        }


    }

}


