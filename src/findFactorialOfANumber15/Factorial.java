package findFactorialOfANumber15;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        //int n = 5;

        System.out.println("Factorial of n = " + n + " is " + factorial(n));

    }

    private static int factorial(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int sum = n * factorial(n-1);
        return sum;
    }
}
