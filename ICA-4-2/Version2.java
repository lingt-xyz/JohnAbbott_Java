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

public class Version2 {
    public static void main(String[] args) throws FileNotFoundException {
        updatedSalary();
    }

    private static void updatedSalary() throws FileNotFoundException{
        System.out.println("ICA-4-2 Version 2.");

        String inputFile = "EmployeesSalary.txt";
        String outputFile = "EmployeesUpdatedSalary.txt";

        Scanner input = new Scanner(new File(inputFile));
        PrintWriter output = new PrintWriter(new File(outputFile));

        while (input.hasNextLine()) {
            String lName = input.next();
            String fName = input.next();
            double salary = input.nextDouble();
            double increase = input.nextDouble();
            output.printf("%s %s %.2f%n", fName, lName, salary * (1 + increase * 0.01));
        }
        
        output.close();
        input.close();
    }
}
