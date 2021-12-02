/**
 * Write Java statements that do the following:
 * a. Declare an array alpha of 15 elements of type int.
 * b. Output the value of the tenth element of the array alpha.
 * c. Set the value of the fifth element of the array alpha to 35.
 * d. Set the value of the ninth element of the array alpha to the sum of the
 * sixth and thirteenth elements of the array alpha.
 * e. Set the value of the fourth element of the array alpha to three times the
 * value of the eighth element, minus 57.
 * f. Output alpha so that five elements per line are printed.
 */
public class Version1 {
    public static void main(String[] args) {
        // a. Declare an array alpha of 15 elements of type int.
        int[] alpha = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        // b. Output the value of the tenth element of the array alpha.
        System.out.println(alpha[9]);

        // c. Set the value of the fifth element of the array alpha to 35.
        alpha[4] = 35;

        // d. Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        alpha[8] = alpha[5] + alpha[2];

        // e. Set the value of the fourth element of the array alpha to three times the value of the eighth element, minus 57.
        alpha[3] = 3 * alpha[7] - 57;

        // f. Output alpha so that five elements per line are printed.
        int numberOfLines = alpha.length % 5 == 0 ? alpha.length / 5 : (alpha.length / 5 + 1);
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", alpha[5 * i + j]);
            }
            System.out.println();
        }
    }
}