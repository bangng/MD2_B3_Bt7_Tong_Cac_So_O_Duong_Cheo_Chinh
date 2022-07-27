import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element(" + i +"," + j +")");
                matrix[i][j] = scanner.nextInt();
                if (i == j) sum +=matrix[i][j];

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", matrix[i][j]);

            }
            System.out.println();

        }
        System.out.println("Total of element in main diagonal is" + sum);

    }
}


