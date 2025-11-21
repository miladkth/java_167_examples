package genrateMultiplicatationTable16;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 9;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", i,num,i*num);
            System.out.println();
        }
    }
}
