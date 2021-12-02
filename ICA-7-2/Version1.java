import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 
 * A car dealership employs 10 salespeople. Each salesperson keeps track of the
 * number of cars sold each month and reports it to the management at the
 * end of the month. The management keeps the data in a file and assigns a
 * number, 1 to 10, to each salesperson. The following statement declares an
 * array, cars, of 10 components of type int to store the number of cars sold
 * by each salesperson.
 * int[] cars = new int[10];
 * Write the code so that the number of cars sold by each salesperson is stored
 * in the array
 * cars, output the total numbers of cars sold at the end of each month, and
 * output the
 * salesperson number selling the maximum number of cars. (Assume that data is
 * in the
 * file cars.txt and that this file has been opened using the Scanner object
 * inFile.)
 */

public class Version1 {

    private static String FilePath = "cars.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int[] cars = new int[10];

        Scanner input = new Scanner(new FileReader(FilePath));
        // while (input.hasNextLine()) {
        //     String line = input.nextLine();
        //     String[] records = line.split("\\s+");
        //     System.out.printf("%-10s%-10s%n", records[0], records[1]);
        //     int salePersonID = Integer.parseInt(records[0]);
        //     int numberOfCars = Integer.parseInt(records[1]);
        //     cars[salePersonID-1] = numberOfCars;
        // }

        while (input.hasNextLine()) {
            int salePersonID = input.nextInt();
            int numberOfCars = input.nextInt();
            System.out.printf("%-10s%-10s%n", salePersonID, numberOfCars);
            cars[salePersonID-1] = numberOfCars;
        }
        input.close();
        
        int totalNumberOfCars = 0;
        int salesPersonIndex = 0;
        for (int i = 0; i < cars.length; i++) {
            totalNumberOfCars += cars[i];

            if (cars[i] > cars[salesPersonIndex]){
                salesPersonIndex = i;
            }
        }
        System.out.println();
        System.out.printf("Total Number Of Cars: %d%n", totalNumberOfCars);
        System.out.printf("Sales Person number selling the maximum number of cars: %d%n", salesPersonIndex + 1);
    }
}
