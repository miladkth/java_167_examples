package checkCharacterIfAlphabetOrNot13;

public class CharAlphabetOrNot {
    public static void main(String[] args) {
        char c = 'a';

        String result = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) ? "is an alphabet" : "is not an alphabet";
        System.out.println(c + " " + result);


        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet");
        } else {
            System.out.println(c + " is not an alphabet");
        }
    }
}

