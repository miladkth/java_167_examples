package checkIfNumIsPositiveOrNegative12;

public class PositiveOrNegativeNum {
    public static void main(String[] args) {
        //double number = 12.2;
        //double number = 0;
        double number = -1;

        int check = (number == 0) ? 0 : (number < 0) ? -1 : 1;

        if (check == 0) {
            System.out.println(number + " is 0");
        } else if (check < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is positive");
        }
    }
}
