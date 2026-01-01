package createPyramidAndPattern54;

public class Main {
    public static void main(String[] args) {
        //program to print half pyramid
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //program to print half pyramid using numbers
        for (int i = 0; i <= 5; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j + " ");
             }
            System.out.println();
        }

        System.out.println();

        //program to print half pyramid using alphabets
        for (int i = 0; i <= 'E' - 'A' + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Inverted half pyramid
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //Inverted half pyramid using numbers
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Print full pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
