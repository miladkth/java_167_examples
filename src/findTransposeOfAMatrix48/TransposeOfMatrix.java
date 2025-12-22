package findTransposeOfAMatrix48;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        System.out.println("--Matrix before transpose--");
        display(matrix);
        System.out.println();

        System.out.println("--Matrix after transpose--");
        int[][] transpose = transpose(matrix);
        display(transpose);

    }

    private static int[][] transpose(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = m[i][j];
            }
        }
            return transpose;
    }

    private static void display(int[][] transpose) {
        System.out.println("The matrix is: ");
        for (int[] row: transpose) {
            for (int col : row) {
                System.out.print(col + "   ");
            }
            System.out.println();
        }
    }
}
