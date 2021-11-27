import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
    Write a program that calculates and prints the monthly paycheck for an
    employee. The net pay is calculated after taking the following deductions:

        Federal Income Tax: 		15%
        State Tax: 			        3.5%
        Social Security Tax: 		5.75%
        Medicare/Medicaid Tax: 		2.75%
        Pension Plan: 			    5%
        Health Insurance: 		    $75.00

    Your program should prompt the user to input the gross amount and the
    employee name. The output will be stored in a file (MonthlyPaycheck.txt). 
    Format your output to have two decimal places. A sample output follows:

    Bill Robinson
    Gross Amount: 		    $ 3575.00
    Federal Tax: 		    $ 536.25
    State Tax: 		        $ 125.13
    Social Security Tax: 	$ 205.56
    Medicare/Medicaid Tax: 	$ 98.31
    Pension Plan: 		    $ 178.75
    Health Insurance: 	    $ 75.00
    Net Pay: 		        $ 2356.00
 */
class Version2 {
    public static void main(String[] args) throws IOException {
        MonthlyPaycheck();
    }

    private static final double FederalIncomeTax = 0.15;
    private static final double StateTax = 0.035;
    private static final double SocialSecurityTax = 0.0575;
    private static final double MedicareMedicaidTax = 0.0275;
    private static final double PensionPlan = 0.05;
    private static final double HealthInsurance = 75.00;

    private static String PrintFormatedFloat(String item, double value) {
        return String.format("%-30s$ %.2f%n", item, value);
    }

    private static void MonthlyPaycheck() throws IOException {
        System.out.println("ICA-4-3 Version 2.");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your gross amount: ");
        double gross = input.nextDouble();
        System.out.print("Please enter your name: ");
        String name = input.next();
        input.close();

        PrintWriter output = new PrintWriter(new File("MonthlyPaycheck.txt"));
        output.println(name);
        output.printf(PrintFormatedFloat("Gross Amount:", gross));
        output.printf(PrintFormatedFloat("Federal Tax:", gross * FederalIncomeTax));
        output.printf(PrintFormatedFloat("State Tax:", gross * StateTax));
        output.printf(PrintFormatedFloat("Social Security Tax:", gross * SocialSecurityTax));
        output.printf(PrintFormatedFloat("Medicare/Medicaid Tax:", gross * MedicareMedicaidTax));
        output.printf(PrintFormatedFloat("Pension Plan:", gross * PensionPlan));
        output.printf(PrintFormatedFloat("Health Insurance:", HealthInsurance));
        output.printf(PrintFormatedFloat("Net Pay:", gross * (1 - FederalIncomeTax - StateTax - SocialSecurityTax - MedicareMedicaidTax - PensionPlan) - 75));
        output.close();
    }
}