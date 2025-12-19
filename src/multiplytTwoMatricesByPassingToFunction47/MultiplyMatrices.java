package multiplytTwoMatricesByPassingToFunction47;

public class MultiplyMatrices {
    public static void main(String[] args) {

        int[][] firstMatrix = {
                {3, -2, 5},
                {3, 0, 4}
        };
        int[][] secondMatrix = {
                {2, 3},
                {-9, 0},
                {0, 4}
        };

        int rowsA = firstMatrix.length;
        int colsA = firstMatrix[0].length;
        int rowsB = secondMatrix.length;
        int colsB = secondMatrix[0].length;

        int[][] product = multiplyMatrices(firstMatrix,secondMatrix,rowsA,colsA,rowsB,colsB);
        displayProduct(product);

    }

    private static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int rowsA, int colsA, int rowsB, int colsB) {
        int[][] product = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
            return product;
    }

    private static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
