package addMatrices45;

public class AddMatrices {
    public static void main(String[] args) {
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        int[][] sum = addMatricesRec(firstMatrix, secondMatrix);

        // Display the matrix
        System.out.println("Sum of two matrices is:");
        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + "    ");
            }
            System.out.println();
        }
    }

    // Wrapper method – your idea, now corrected
    private static int[][] addMatricesRec(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];
        addMatricesRec(a, b, sum, 0, 0);
        return sum;
    }

    // The real recursive method
    private static void addMatricesRec(int[][] a, int[][] b, int[][] sum, int i, int j) {
        int rows = a.length;
        int cols = a[0].length;

        // Basfall: når vi sista raden, stoppar vi
        if (i == rows) return;

        // Lägg ihop elementet
        sum[i][j] = a[i][j] + b[i][j];

        // Flytta vidare i kolumnen om möjligt
        if (j + 1 < cols) {
            addMatricesRec(a, b, sum, i, j + 1);
        }
        // Annars: gå till nästa rad och börja på kolumn 0
        else {
            addMatricesRec(a, b, sum, i + 1, 0);
        }
    }
}
