package findASCIIValueOfCharacter04;

public class FindASCIIValueOfCharacter {
    public static void main(String[] args) {
        char ch = 'a';
        int ascii = ch;

        //you can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is " + ascii);
        System.out.println("The ASCII value of " + ch + " is " + castAscii);
        //call a function
        System.out.println("The ASCII value of " + ch + " is " + asciiSolution(ch));
    }

    private static int asciiSolution(char ch) {
        int ascii = ch;
        return ascii;
    }
}

