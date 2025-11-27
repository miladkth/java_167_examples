package checkPalindrome24;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";

        System.out.println(palindromeCheckRec(str));
    }

    private static boolean palindromeCheckRec (String str) {
        return palindromeCheckRec(str,0,str.length()-1);
    }

    private static boolean palindromeCheckRec(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return palindromeCheckRec(str,left+1,right-1);
    }
}
