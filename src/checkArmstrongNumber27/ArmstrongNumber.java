package checkArmstrongNumber27;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));  // true
        System.out.println(isArmstrong(370));  // true
        System.out.println(isArmstrong(371));  // true
        System.out.println(isArmstrong(407));  // true
        System.out.println(isArmstrong(9474)); // true

        System.out.println(isArmstrong(100));  // false
        System.out.println(isArmstrong(200));  // false

    }

    private static int countDigit(int n) {
        if (n == 0) return 0;
        return 1 + countDigit(n / 10);
    }

    private static int armstrongSum(int n, int digits) {
        if (n == 0) return 0;
        int digit = n % 10;
        int power = (int) Math.pow(digit,digits);
        return power + armstrongSum(n / 10, digits);
    }

    private static boolean isArmstrong(int n) {
        int digits = countDigit(n);
        int sum = armstrongSum(n, digits);
        return sum == n;

    }
}
