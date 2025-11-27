package powerOfAnumber23;

public class PowerOfANumber {
    public static void main(String[] args) {
        int base = 3, exponent = 4;
        System.out.println("Result: " + powerRec(base,exponent));
    }

    private static int powerRec(int base, int exponent) {
        return powerRec(base, exponent, 1);
    }

    private static int powerRec(int base, int exponent, int result) {
        if (exponent == 0) return result;
        return powerRec(base,exponent-1,result*base);
    }
}
