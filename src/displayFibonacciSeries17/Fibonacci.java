package displayFibonacciSeries17;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        printFibonacciSeries(n,0);
    }

    private static int fibonacciRec(int n) {
        if (n <= 1) return n;

        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }

    private static void printFibonacciSeries(int n, int current) {
        if (current > n) return;

        System.out.print(fibonacciRec(current)+ " ");
        printFibonacciSeries(n, current+1);
    }
}
