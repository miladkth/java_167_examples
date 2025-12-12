package standardDeviation44;

public class StandardDeviation {
    public static void main(String[] args) {
        double[] numArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.format("standard deviation = %.6f" , calculateStandardDeviation(numArray));
    }
    private static double calculateStandardDeviation(double []a) {
        double sum = 0.0, standardDeviation = 0.0;

        for (double n : a) {
            sum += n;
        }

        double mean = sum/a.length;

        for (double n : a) {
            standardDeviation += Math.pow(n-mean,2);
        }
        return Math.sqrt(standardDeviation/a.length);
    }
}
