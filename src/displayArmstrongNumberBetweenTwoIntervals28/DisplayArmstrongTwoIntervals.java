package displayArmstrongNumberBetweenTwoIntervals28;

public class DisplayArmstrongTwoIntervals {
    public static void main(String[] args) {
        printArmstrongBetween(999, 99999);
    }

    private static int countDigit(int n) {
        if (n == 0) return 1;    // specialfall för 0
        return countDigitRec(n);
    }
    private static int countDigitRec(int n) {
        if (n == 0) return 0;
        return 1 + countDigitRec(n / 10);
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

//    private static void printArmstrongBetween(int start, int end) {
//        if (start > end) return;
//        if (isArmstrong(start)) {
//            System.out.print(start + " ");
//        }
//        printArmstrongBetween(start + 1, end);
//    }

    private static void printArmstrongBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }


}
