package gcdOftwoNumbersUsingRec36;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcdRec(366, 60));
    }
    private static int gcdRec(int n1, int n2) {
        if (n2 == 0) return n1;
        return gcdRec(n2, n1 % n2);
    }
}
