package convertCharToString60;

public class ConvertCharToString {
    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);

        System.out.println(st);

        char[] chMilad = {'m','i','l','a','d'};
        String stMilad = String.valueOf(chMilad);

        System.out.println(stMilad);
    }
}
