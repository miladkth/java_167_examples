package displayPrimeNumbersUsingFunc29;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        printPrimeInRange(20,50);
    }

    private static boolean primeNumbersRec(int n) {
        if (n <= 1) return false;
        return primeNumbersRec(n, 2);
    }

    private static boolean primeNumbersRec(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return primeNumbersRec(n, d + 1);
    }

    private static void printPrimeInRange (int start, int end) {
        if (start > end) return;
        if (primeNumbersRec(start)) {
            System.out.print(start + " ");
        }
            printPrimeInRange(start + 1, end);
    }
}
