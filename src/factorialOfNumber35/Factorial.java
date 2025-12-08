package factorialOfNumber35;

public class Factorial {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Factorial of " + number + " = " + factorialRec(6));
    }

    private static int factorialRec(int n) {
        if (n == 1) return 1;
        return n * factorialRec(n-1);
    }
}
