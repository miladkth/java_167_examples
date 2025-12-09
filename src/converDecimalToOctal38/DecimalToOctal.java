package converDecimalToOctal38;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 78;
        String octal = convertDecimalToOctalRec(decimal);
        if (octal.isEmpty()) octal = "0";
        System.out.println("Decimal = " + decimal + " in octal = " + octal);
    }

    private static String convertDecimalToOctalRec(int decimal) {
        if (decimal == 0) return "";
        return convertDecimalToOctalRec(decimal / 8) + (decimal % 8);
    }
}
