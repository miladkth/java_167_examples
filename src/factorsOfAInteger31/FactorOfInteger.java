package factorsOfAInteger31;

public class FactorOfInteger {
    public static void main(String[] args) {
        int number = 60;
        System.out.print("The factor of " + number + " is: ");
        printFactor(number,1);
    }

    private static void printFactor(int n, int divisor) {
        if (divisor > n) return;
        if (n % divisor == 0) System.out.print(divisor + " ");
        printFactor(n, divisor+1);
    }
}
