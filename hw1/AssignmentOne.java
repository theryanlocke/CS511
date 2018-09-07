/*
 * CS 511 HW 1
 * Dylan DiGeronimo and Ryan Locke
 * I pledge my honor that I have abided by the Stevens Honor System
 */

import java.util.List;
import java.util.ArrayList;

public class AssignmentOne {

    // Create a PrimeFinder -> Probably don't need this, don't delete until sure
    // PrimeFinder pf = new PrimeFinder();

    // Call PrimeFinder methods to generate the list of primes, uses threads
    // public static List<Integer> lprimes(List<Integer[]> intervals) {
    //     // TODO
    // }

    // Main method -> deal with arguments, create list of intervals, pass them to lprimes
    public static void main(String[] args) {
        // Ensure an even amount of numbers are supplied
        if (args.length%2 != 0) {
            System.out.println("You must supply an even amount of numbers.");
            System.exit(0);
        }
        Integer val1;
        Integer val2;
        Integer previousVal2 = 1; // Setting this to 1 ensures that the first num can't be 1
        Integer[] interval = new Integer[2];
        List<Integer[]> listOfIntervals = new ArrayList<Integer[]>();
        // Iterate through args and set them to variables
        for (int i = 0; i < args.length-1; i++) {
            val1 = Integer.parseInt(args[i]);
            val2 = Integer.parseInt(args[i+1]);
            // Check that integers are both in order and greater than 1
            if (val1 >= val2 || previousVal2 > val1) {
                System.out.println("Numbers must be in ascending order and greater than 1.");
                System.exit(0);
            }
            // Set previousVal2 to current val2
            previousVal2 = val2;
            // Add vals to interval array
            interval[0] = val1;
            interval[1] = val2;

            // Test printouts
            // System.out.print("[ ");
            // System.out.print(Integer.toString(interval[0]));
            // System.out.print(", ");
            // System.out.print(Integer.toString(interval[1]));
            // System.out.println(" ]");

            // Add interval array to list
            listOfIntervals.add(interval);
        }
        // Call lprimes
    }
}

