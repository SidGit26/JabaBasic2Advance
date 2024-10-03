package Pattern;

public class pattern7 {
    public static void main(String[] args) {
        pattern(5); // Example with n = 5
    } 

    static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            // int totalColsInRow = row > n ? 2 * n - row : row;
            // int noOfSpaces = n - totalColsInRow;

            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
