package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input  {
    private Scanner scanner;

    public static String getString(){
        System.out.println("Enter something");
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.nextLine();
        System.out.println(theString);
        return theString;
    }

    public static boolean yesNo(){
        System.out.println("Do you agree? y/n");
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.next();
        boolean confirmation = theString.contains("y");
        System.out.println(confirmation);
        return confirmation;
    }
    public static int getInt(){
        int number;

        try {
            System.out.println("Give me a number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } catch (InputMismatchException nfe){
            System.out.println("Input is not a number, please put in a number");
            return getInt();
        }

        return number;
    }


    public static double getDouble() {
        try {
            System.out.println("Enter a number with a decimal");
            Scanner scanner = new Scanner(System.in);
            double theDouble = scanner.nextDouble();
            System.out.println("You entered " + theDouble);
            return theDouble;
        } catch (InputMismatchException e){
            System.out.println("You didn't enter a number. Please put in a number");
            return getDouble();
        }
    }

    public static int getInt(int min, int max)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        do {
            int userInput = scanner.nextInt();
            if (userInput < min){
                System.out.println("That's too low ");
                System.out.println("Enter a number between " + min + " and " + max);

            } else if(userInput > max){
                System.out.println("That's too high");
                System.out.println("Enter a number between " + min + " and " + max);

            } else {
                return userInput;
            }
        } while(true);
    }


    public static double getDouble(double min, double max) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        do {
            double userInput = scanner.nextDouble();
            if (userInput < min){
                System.out.println("That's too low ");
                System.out.println("Enter a number between " + min + " and " + max);

            } else if(userInput > max){
                System.out.println("That's too high");
                System.out.println("Enter a number between " + min + " and " + max);

            } else {
                return userInput;
            }
        } while(true);
    }

    public static int getBinary(){
        System.out.println("Enter a number in binary");
        try{
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            int binaryInput = Integer.valueOf(userInput, 2);
            System.out.println("Your number in base 10 is: " + binaryInput);
            return binaryInput;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number in binary.  Only  use '1s' and '0s'");
            return getBinary();
        }
    }
    public static int getHex(){
        System.out.println("Enter a number in Hexadecimal");
        try{
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            int hexInput = Integer.valueOf(userInput, 16);
            System.out.println("Your number in base 10 is: " + hexInput);
            return hexInput;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number in hexadecimal");
            return getHex();
        }
    }

    public static void main(String[] args) {
        getString();
        yesNo();
        getInt();
        getDouble(0.5, 2.5);
        getDouble();
        getInt(1,10);
        getBinary();
        getHex();

    }

}
