package sumOfTwoPrimeNumbers33;

public class RepresentanumbersSumofTwoPrimeNumbers {
    public static void main(String[] args) {
        int number = 34;
        printSumOfTwoPrime(number);
    }

    private static boolean primeNumber(int n) {
        if (n <= 1) return false;
        return primeNumber(n, 2);
    }

    private static boolean primeNumber(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return primeNumber(n, d +1);
    }

    private static void printSumOfTwoPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (primeNumber(i)) {
                if (primeNumber(n - i)) {
                    System.out.printf("%d = %d + %d\n", n, i, n-i);
                }
            }
        }
    }

}
