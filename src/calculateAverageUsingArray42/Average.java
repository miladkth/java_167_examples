package calculateAverageUsingArray42;

public class Average {
    public static void main(String[] args) {
        double[] array = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double n : array) {
            sum += n;
        }
        double average = sum/ array.length;
        System.out.format("The average is: %.2f", average);
    }

}
