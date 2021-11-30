import java.util.Scanner;

/**
 * Write a program that takes as input given lengths expressed in feet and
 * inches.
 * The program should then convert and output the lengths in centimeters.
 * Assume that the lengths given in feet and inches are integers.
 * 
 * Input: Length in feet and inches
 * Output: Equivalent length in centimeters
 */

public class Q1 {

    static double CETIMETERS_PER_INCH = 2.54;
    static int INCHES_PER_FOOT = 12;

    public static void main(String[] args) {
        /**
         * You can play with the following three types of control flow:
         *  1. do while
         *  2. while
         *  3. for
         */

        // int[] inputs = GetInput_DO_WHILE();
        // int[] inputs = GetInput_WHILE();
        int[] inputs = GetInput_FOR();
        
        PrintResult(inputs[0], inputs[1]);
    }

    /**
     * Read feet and inches from console
     * 
     * @return
     */
    private static int[] GetInput_DO_WHILE() {
        int feet = 0;
        int inches = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("%nEnter feet (it should be greater or equal than 0): ");
            feet = input.nextInt();
        } while (feet < 0);
        do {
            System.out.printf("%nEnter inches (it should be greater or equal than 0): ");
            inches = input.nextInt();
        } while (inches < 0);
        input.close();

        return new int[]{feet, inches};
    }

    /**
     * Read feet and inches from console
     * 
     * @return
     */
    private static int[] GetInput_WHILE() {
        Scanner input = new Scanner(System.in);

        int feet = -1;
        while (feet < 0) {
            System.out.printf("%nEnter feet (it should be greater or equal than 0): ");
            feet = input.nextInt();
        }

        int inches = -1;
        while (inches < 0) {
            System.out.printf("%nEnter inches (it should be greater or equal than 0): ");
            inches = input.nextInt();
        };
        
        input.close();

        return new int[]{feet, inches};
    }

        /**
     * Read feet and inches from console
     * 
     * @return
     */
    private static int[] GetInput_FOR() {
        Scanner input = new Scanner(System.in);

        int finalFeet =0;
        for (int feet = -1; feet < 0;) {
            System.out.printf("%nEnter feet (it should be greater or equal than 0): ");
            feet = input.nextInt();
            finalFeet = feet;
        }

        int finalInches = 0;
        for (int inches = -1; inches < 0;) {
            System.out.printf("%nEnter inches (it should be greater or equal than 0): ");
            inches = input.nextInt();
            finalInches = inches;
        };
        
        input.close();

        return new int[]{finalFeet, finalInches};
    }

    /**
     * Convert feet and inches to inches
     * 
     * @param feet
     * @param inches
     * @return
     */
    private static int TotalInches(int feet, int inches) {
        return feet * INCHES_PER_FOOT + inches;
    }

    /**
     * Convert inches to centimeters
     * 
     * @param inches
     * @return
     */
    private static double InchToCentimeter(int inches) {
        return inches * CETIMETERS_PER_INCH;
    }

    /**
     * Calculate results and print out to console
     * 
     * @param feet
     * @param inches
     */
    private static void PrintResult(int feet, int inches){
        System.out.printf("%nThe numbers you entered are %d for feet and %d for inches.%n", feet, inches);
        int totalInches = TotalInches(feet, inches);
        System.out.printf("%nThe total number of inches = %d%n", totalInches);
        double centimeters = InchToCentimeter(totalInches);
        System.out.printf("%nThe number of centimeters = %.2f%n", centimeters);
    }
}