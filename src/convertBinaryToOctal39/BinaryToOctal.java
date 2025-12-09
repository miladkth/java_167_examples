package convertBinaryToOctal39;

public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "101001";
        printConvert(binary);

    }

    private static int convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary,2);
        return decimal;
    }

    private static String convertDecimalToOctal(int decimal) {
        if (decimal == 0) return "";
        return convertDecimalToOctal(decimal / 8) + (decimal % 8);
    }

    private static void printConvert(String binary) {
        int decimal = convertBinaryToDecimal(binary);
        String octalString = convertDecimalToOctal(decimal);
        if (octalString.isEmpty()) octalString = "0";
        int octal = Integer.parseInt(octalString);
        System.out.println(octal);
    }
}
