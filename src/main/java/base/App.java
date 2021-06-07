/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String choice = myApp.getChoice();

        if (choice.equals("C") || choice.equals("c"))
            myApp.toCelsius();
        else if(choice.equals("F") || choice.equals("f"))
            myApp.toFahren();
    }

    public void toCelsius() {
        System.out.print("Please enter the temperature in Fahrenheit: ");
        double faren = in.nextInt();
        double celsius = (faren - 32) * (5.0/9.0);
        System.out.printf("The temperature in Celsius is %.0f", celsius);
    }

    public void toFahren() {
        System.out.print("Please enter the temperature in Celsius: ");
        double celsius = in.nextDouble();
        double faren = (celsius * (9.0/5.0)) + 32;
        System.out.printf("The temperature in Fahrenheit is %.0f", faren);
    }

    public String getChoice() {
        System.out.print("Press C to convert from Fahrenheit to Celsius. \n" +
                "Press F to convert from Celsius to Fahrenheit. \n" +
                "Your choice: ");
        return in.nextLine();
    }
}
