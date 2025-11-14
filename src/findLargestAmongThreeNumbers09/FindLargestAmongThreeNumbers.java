package findLargestAmongThreeNumbers09;

public class FindLargestAmongThreeNumbers {
    public static void main(String[] args) {
        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        // find the largest number using if.else

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is largest");
        } else {
            System.out.println(n3 + " is largest");
        }
    }
}
