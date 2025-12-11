package findLargestElementOfAnArray43;

public class LargestElementOfAnArray {
    public static void main(String[] args) {
        double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
        double largest = numArray[0];
        for (double n : numArray) {
            if (largest < n) largest = n;
        }
        System.out.println("Largest element = " + largest);
    }
}
