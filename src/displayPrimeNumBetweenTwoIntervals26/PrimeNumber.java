package displayPrimeNumBetweenTwoIntervals26;

public class PrimeNumber {
    public static void main(String[] args) {
        printPrimesInRange(20,50);
    }

    private static void printPrimesInRange(int start, int end) {
        if (start > end) return;
        if (isPrimeRec(start)) {
            System.out.print(start + " ");
        }
        printPrimesInRange(start+1,end);
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
