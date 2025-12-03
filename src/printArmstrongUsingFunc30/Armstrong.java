package printArmstrongUsingFunc30;

public class Armstrong {
    public static void main(String[] args) {
//        System.out.println(countDigit(543));
//        System.out.println(armstrongSum(532, countDigit(532)));
        printArmstrongTwoIntervals(999, 99999);
    }

    private static int countDigit(int n) {
        if (n == 0) return 0;
        return 1 + countDigit(n / 10);
    }

    private static int armstrongSum(int n, int digits) {
        if (n == 0) return 0;
        int digit = n % 10;
        int power = (int) Math.pow(digit, digits);
        return power + armstrongSum(n / 10, digits);
    }

    private static boolean isArmstrong(int n) {
        int digits = countDigit(n);
        int sum = armstrongSum(n, digits);
        return sum == n;
    }

    private static void printArmstrongTwoIntervals(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
