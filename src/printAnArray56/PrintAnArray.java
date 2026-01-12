package printAnArray56;

import java.util.Arrays;

public class PrintAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] matrix2d = {{1, 2}, {3, 4}, {5, 6, 7}};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(array));

        System.out.println();

        for (int[] row : matrix2d) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(matrix2d));
    }
}
