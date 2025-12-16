package multiplyTwoMatrices46;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
    }

    private static int[][] multiplyRec(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB)
            throw new IllegalArgumentException("Matrices cannot be multiplied");

        int[][] result = new int[rowsA][colsB];
        multiplyRec(A, B, result, 0, 0, 0);
        return result;
    }

    // Recursive version with 3 indexes: i, j, k
    private static void multiplyRec(int[][] A, int[][] B, int[][] R, int i, int j, int k) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Basfall: färdig med alla rader
        if (i == rowsA) return;

        // Om k ännu inte nått slutet, beräkna summatermen
        if (k < colsA) {
            R[i][j] += A[i][k] * B[k][j];
            multiplyRec(A, B, R, i, j, k + 1);   // gå vidare i k
        }
        else {
            // När k är klar: flytta till nästa kolumn
            if (j + 1 < colsB) {
                multiplyRec(A, B, R, i, j + 1, 0);   // reset k
            }
            else {
                // sista kolumnen klar → gå till nästa rad
                multiplyRec(A, B, R, i + 1, 0, 0);
            }
        }
    }

}
