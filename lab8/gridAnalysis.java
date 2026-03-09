package lab8;

import java.util.Scanner;

public class gridAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter matrix size n (4 to 8): ");
            n = input.nextInt();
        } while (n < 4 || n > 8);

        int[][] matrix = new int[n][n];

        System.out.print("Enter " + n + " rows and " + n + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("Matrix Analysis Report");
        System.out.println("----------------------");
        System.out.println("Dominant Rows: " + dominant(matrix));
        System.out.println("Primary Diagonal Stable: " + diagonal(matrix));
        System.out.println("Boundary Symmetric: " + boundary(matrix));
        System.out.println("Total Local Peaks: " + peaks(matrix));

        input.close();
    }

    public static String dominant(int[][] matrix) {
        String result = "";
        boolean found = false;

        for (int row = 0; row < matrix.length; row++) {
            int rowNum = 0;
            int colNum = 0;

            for (int col = 0; col < matrix[row].length; col++) {
                rowNum += matrix[row][col];
                colNum += matrix[col][row];
            }

            if (rowNum > colNum) {
                if (found) result += " ";
                result += row;
                found = true;
            }
        }

        if (!found) return "None";
        return result;
    }

    public static boolean diagonal(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        int num= 0;

        for (int col = 0; col < matrix[row].length; col++) {
            num += matrix[row][col];
        }

        double avg = (double) num / matrix[row].length;

        if (!(matrix[row][row]> avg)) {
            return false;
        }
    }

    return true;
    }

    public static boolean boundary(int[][] matrix) {
    int n = matrix.length;
    int[] list = new int[4 * n - 4];
    int sum = 0;

    for (int k = 0; k < matrix[0].length; k++) {
        list[sum] = matrix[0][k];
        sum++;
    }

    for (int i = 1; i < matrix.length - 1; i++) {
        list[sum] = matrix[i][n - 1];
        sum++;
    }

    for (int k = n - 1; k >= 0; k--) {
        list[sum] = matrix[n - 1][k];
        sum++;
    }

    for (int i = n - 2; i >= 1; i--) {
        list[sum] = matrix[i][0];
        sum++;
    }

    for (int i = 0; i < list.length /2; i++) {
        if (list[i] != list[list.length - 1 - i]) {
            return false;
        }
    }

    return true;
    }


    public static int peaks(int[][] matrix) {
    int start= 0;

    for (int row =1; row < matrix.length - 1; row++) {
        for (int col =1; col < matrix[row].length -1; col++) {
            int value = matrix[row][col];

            if(value> matrix[row - 1][col] &&
                value> matrix[row + 1][col] &&
                value> matrix[row][col - 1] &&
                value> matrix[row][col + 1]) {
            start++;
            }
        }
    }

    return start;
    }

}