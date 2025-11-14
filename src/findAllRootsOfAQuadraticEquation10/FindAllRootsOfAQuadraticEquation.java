package findAllRootsOfAQuadraticEquation10;

public class FindAllRootsOfAQuadraticEquation {
    public static void main(String[] args) {
        //The standard form of a quadratic equation
        //ax^2+bx+c=0
        //a, b and c are real numbers
        //a cant be equal to 0

        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        //calculate the discriminant (b^2-4ac)
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            //two real and distinct root
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("root1 = %.2f and roo2 = %.2f", root1, root2);
        } else if (discriminant == 0) {
            // two real and equal root
            // discriminant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1);
        } else {
            // discriminant is less than zero
            //roots are complex and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (a * 2);
            System.out.format("root1 = %.2f+%.2fi",real,imaginary);
            System.out.format("\nroot2 = %.2f+%.2fi",real,imaginary);
        }
    }
}
