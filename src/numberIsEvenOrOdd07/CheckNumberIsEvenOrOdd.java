package numberIsEvenOrOdd07;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        String evenOdd = (num%2==0)? "Even" : "Odd";

        System.out.println(num + " is " + evenOdd);
    }
}
