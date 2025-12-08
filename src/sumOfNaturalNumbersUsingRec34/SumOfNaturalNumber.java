package sumOfNaturalNumbersUsingRec34;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("Sum = " + sumOfNaturalNumberRec(number));
    }

    private static int sumOfNaturalNumberRec(int n) {
        if (n == 0) return 0;
        return n + sumOfNaturalNumberRec(n - 1);
    }
}
