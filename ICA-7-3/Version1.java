import java.util.Scanner;

/**
 * 
 * Write a program that allows the user to enter the last names of five
 * candidates in a local election and the votes received by each candidate.
 * The program should then output each candidateâ€™s name, the votes received
 * by that candidate, and the percentage of the total votes received by the
 * candidate. Your program should also output the winner of the election.
 * 
 * A sample output is:
 * Candidate Votes Received % of Total Votes
 * Johnson 5000 25.91
 * Miller 4000 20.73
 * Duffy 6000 31.09
 * Robinson 2500 12.95
 * Ashtony 1800 9.33
 * 
 * Total 19300
 * The Winner of the Election is Duffy.
 * 
 */
public class Version1 {
    public static void main(String[] args) {
        int numberOfCandiates = 5;
        String[] candiates = new String[numberOfCandiates];
        int[] votes = new int[numberOfCandiates];
        int totalVotes = 0;
        int winnerIndex = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numberOfCandiates; i++) {
            System.out.print("Please enter the last name of the candidate: ");
            candiates[i] = input.next();
            System.out.printf("Please enter the votes received for %s: ", candiates[i]);
            votes[i] = input.nextInt();
            
            totalVotes += votes[i];
            if (votes[i] > votes[winnerIndex]) {
                winnerIndex = i;
            }
        }
        input.close();

        System.out.printf("%-15s%-20s%-20s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (int i = 0; i < numberOfCandiates; i++) {
            System.out.printf("%-15s%-20s%.2f%n", candiates[i], votes[i], votes[i] / (totalVotes*1.0) * 100);
        }
        System.out.println();
        System.out.printf("%-15s%d%n", "Total", totalVotes);
        System.out.printf("The Winner of the Election is %s.%n", candiates[winnerIndex]);
    }

}
