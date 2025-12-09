package calculateThePowerUsingRec41;

public class PowerUsingRec {
    public static void main(String[] args) {
        System.out.println(calculateThePower(3, 4));
    }

    private static int calculateThePower(int base, int powerRaised) {
        if (powerRaised == 0) return 1;
        return base * calculateThePower(base, powerRaised - 1);
    }
}
