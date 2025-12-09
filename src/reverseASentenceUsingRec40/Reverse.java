package reverseASentenceUsingRec40;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "Go work";
        System.out.println(reverse(sentence));

    }

    private static String reverse(String sentence) {
        if (sentence.isEmpty()) return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
