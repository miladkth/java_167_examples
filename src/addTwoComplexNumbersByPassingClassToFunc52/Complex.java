package addTwoComplexNumbersByPassingClassToFunc52;

public class Complex {
    double real;
    double img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0);

            Complex sum = add(n1,n2);
        System.out.println(sum);
    }

    private static Complex add(Complex n1, Complex n2) {
        return new Complex(
                n1.real + n2.real,
                n1.img + n2.img
        );
    }

    @Override
    public String toString() {
        return String.format("%.1f + %.1fi", real, img);
    }

}
