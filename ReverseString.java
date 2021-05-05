/*
* This program gets some string input,
* reverse the string using recursion and shows reversed string.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-05
*/
// package ca.mths.unit3.unit01.java.main;

import java.util.Scanner;

public final class ReverseString {
    private ReverseString() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method uses recursion to reverse the string.
    * @param someString - array of random numbers
    * @return reversedString
    */
    public static String reverse(final String someString) {
        if (someString.length() == 1) {
            return someString;
        } else {
            return reverse(someString.substring(1)) + someString.charAt(0);
        }
    }

    /**
    * This method gets some string input and shows reversed string.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Input
        System.out.print("The original string is : ");
        String inputString = myObj.nextLine();

        // Output
        System.out.print("The reversed string (using recursion) is : "
                         + reverse(inputString));
        System.out.println("\nDone.");
    }
}
