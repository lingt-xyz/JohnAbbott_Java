import java.util.Scanner;

/**
 * Input: Input to the program is 
 *  1. the customer’s account number, 
 *  2. customer code, number of premium channels to which the customer subscribesand, 
 *      in the case of business customers, the number of basic service connections.
 * 
 * Output: Customer’s account number and the billing amount.
 */
public class Version1 {
    private static double R_BILL_PROC_FEE = 4.50;
    private static double R_BASIC_SERC_COST = 20.50;
    private static double R_COST_PREM_CHANNEL = 7.50;

    private static double B_BILL_PROC_FEE= 15.00;
    private static double B_BASIC_SERV_COST = 75.00;
    private static double B_BASIC_CONN_COST = 5.00;
    private static double B_COST_PREM_CHANNEL = 50.00;
    public static void main(String[] args) {
        int accountNumber = 0;
        char customerType = ' ';
        int noOfPremChannels = 0;
        int noOfBasicServConn = 0;
        double amountDue = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program computes a cable bill.");
        System.out.print("Enter the account number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter the customer type: R 0r r (Residential), B or b (Business): ");
        customerType = input.next().charAt(0);
        System.out.print("Enter the number of basic service connections: ");
        noOfBasicServConn = input.nextInt();
        System.out.print("Enter the number of premium channels: ");
        noOfPremChannels = input.nextInt();
        input.close();

        switch (customerType) {
            case 'R':
            case 'r':
                amountDue = R_BILL_PROC_FEE + R_BASIC_SERC_COST+ noOfPremChannels * R_COST_PREM_CHANNEL;
                break;
            case 'B':
            case 'b':
                if(noOfBasicServConn <= 10){
                    amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + noOfPremChannels * B_COST_PREM_CHANNEL ;
                }else{
                    amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + B_BASIC_CONN_COST * (noOfBasicServConn - 10) + noOfPremChannels * B_COST_PREM_CHANNEL; 
                }
                break;
            default:
                break;
        }

        System.out.printf("Account number: %d%n", accountNumber);
        System.out.printf("Amount due: $%.2f%n", amountDue);

    }
}
