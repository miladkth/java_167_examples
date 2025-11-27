package countDigitInANumber21;

public class CountDigit {
    public static void main(String[] args) {
         //int number = 00002234; // 4
       int number = 123456;

        System.out.println(countDigRec(number));
    }

    private static int countDigRec(int num) {
        if (num == 0) return 0;
        return 1 + countDigRec(num / 10);
    }
}
