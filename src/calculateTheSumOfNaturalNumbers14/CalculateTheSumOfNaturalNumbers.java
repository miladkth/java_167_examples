package calculateTheSumOfNaturalNumbers14;

public class CalculateTheSumOfNaturalNumbers {
    public static void main(String[] args) {
        int num  = 100, sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        int i = 1;
        sum = 0;
        while (i<=num) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
