import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(10) + 2;
        int n = random.nextInt(10) + 2;
        int[][] matrix = new int[m][n];
        int[][] transferMatrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10) + 2;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transferMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(transferMatrix[i]));
        }
    }
}

