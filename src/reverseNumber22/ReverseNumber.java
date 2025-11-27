package reverseNumber22;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Before reverse: " + num);
        //Using rec
        System.out.println("After reverse: " + reverse(num));
    }

    private static int reverse(int num) {
        return reverseHelper(num, 0);
    }

    private static int reverseHelper(int num, int result) {
        if (num == 0) return result;
        int lastDigit = num % 10;
        return reverseHelper(num / 10, result * 10 + lastDigit);
    }
}
