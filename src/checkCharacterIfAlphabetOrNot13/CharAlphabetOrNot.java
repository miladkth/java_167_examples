package checkCharacterIfAlphabetOrNot13;

public class CharAlphabetOrNot {
    public static void main(String[] args) {
        char c = '*';

        String result = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) ? "is an alphabet" : "is not an alphabet";
        System.out.println(c + " " + result);
    }
}

