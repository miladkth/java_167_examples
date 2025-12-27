package findFreqOfChar49;

public class Frequency {
    public static void main(String[] args) {
        String str = "this website is awesome.";
        char ch = 'e';
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) freq++;
        }
        System.out.println("Frequency of " + ch + " = " + freq);
    }
}
