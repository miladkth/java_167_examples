package removeAllWhiteSpaces55;

public class RemoveSpaces {
    public static void main(String[] args) {
        String sentence = "T        his  is b     ett                  er";
        System.out.println("Original sentence: " + sentence);
        sentence = sentence.replaceAll("\\s","");
        //sentence = sentence.replace(" ", "");
        //sentence = sentence.replace("|", " ");
        System.out.println("After replacement -> " + sentence);
    }
}
