package findLCM19;

public class FindLCM {
    public static void main(String[] args) {
        int n1 = 72 , n2 = 120;

        int gcd = findGCDRec(n1, n2);
        int lcm = (n1 * n2) / gcd;

        System.out.printf("The LCM of %d and %d is %d", n1, n2, lcm);
    }

    private static int findGCDRec (int a, int b) {
        if (b == 0)
            return a;
        return findGCDRec(b, a % b);
    }
}
