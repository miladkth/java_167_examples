package alphabetIsVowelOrConsonant08;

public class AlphabetIsVowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'i';
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }

        String resultToReturn = (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch =='i') ? "vowel" : "consonant";
        System.out.println(ch + " is " + resultToReturn);
    }
}
