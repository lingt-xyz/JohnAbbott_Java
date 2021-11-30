import java.util.Scanner;

public class ICA_6_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a, b;
        boolean found;
        System.out.print("Enter the first integer: ");
        a = console.nextInt();
        System.out.println();
        System.out.print("Enter the second integer: ");
        b = console.nextInt();
        if (a > a * b && 10 < b) {
            found = 2 * a > b;
            System.out.print(found);
        } else {
            found = 2 * a < b;
            System.out.print(found);
        }

        System.out.println();
        if (found == 2 * a > b) {
            a = 3;
            b = 15;
        }
        System.out.print(a + " " + b);
        System.out.println();
        if (b == 15) {
            b = 0;
            a = 1;
        }
        System.out.print(a + " " + b);

        console.close();
    }
}