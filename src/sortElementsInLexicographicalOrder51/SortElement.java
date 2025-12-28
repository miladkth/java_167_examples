package sortElementsInLexicographicalOrder51;

public class SortElement {
    public static void main(String[] args) {
        String[] words = { "Ruby", "C", "Python", "Java" };

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
    }
}
