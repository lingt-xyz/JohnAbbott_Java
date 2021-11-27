import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
    Three employees in a company are up for a special pay increase. You are
    given a file, say EmployeesSalary.txt, with the following data:

    Miller Andrew 65789.87 5
    Green Sheila 75892.56 6
    Sethi Amit 74900.50 6.1

    Each input line consists of an employee’s last name, first name, current salary,
    and percent pay increase. For example, in the first input line, the last name of
    the employee is Miller, the first name is Andrew, the current salary is
    65789.87, and the pay increase is 5%. Write a program that reads data from
    the specified file and stores the output in the file EmployeesUpdatedSalary.txt.  
    For each employee, the data must be output in the following form: firstName
    lastName updatedSalary. Format the output of decimal numbers to two
    decimal places.
    Save the file as EmployeesUpdatedSalary.java.  
 */

public class Version1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ICA-4-2 Version 1.");

        String inputFile = "EmployeesSalary.txt";
        String outputFile = "EmployeesUpdatedSalary.txt";

        Scanner input = new Scanner(new File(inputFile));
        String lName1 = input.next();
        String fName1 = input.next();
        double salary1 = input.nextDouble();
        double increase1 = input.nextDouble();

        String lName2 = input.next();
        String fName2 = input.next();
        double salary2 = input.nextDouble();
        double increase2 = input.nextDouble();

        String lName3 = input.next();
        String fName3 = input.next();
        double salary3 = input.nextDouble();
        double increase3 = input.nextDouble();

        input.close();

        PrintWriter output = new PrintWriter(new File(outputFile));
        output.printf("%s %s %.2f%n", fName1, lName1, salary1 * (1 + increase1 * 0.01));
        output.printf("%s %s %.2f%n", fName2, lName2, salary2 * (1 + increase2 * 0.01));
        output.printf("%s %s %.2f%n", fName3, lName3, salary3 * (1 + increase3 * 0.01));
        output.close();
    }
}
