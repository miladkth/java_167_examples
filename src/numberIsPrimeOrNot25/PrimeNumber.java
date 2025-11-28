package numberIsPrimeOrNot25;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeRec(17));
        System.out.println(isPrimeRec(20));
        System.out.println(isPrimeRec(2));
    }

    private static boolean isPrimeRec(int n) {
        if (n <= 1) return false;
        return isPrimeRec(n, 2);
    }

    private static boolean isPrimeRec(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrimeRec(n, d + 1);
    }
}
