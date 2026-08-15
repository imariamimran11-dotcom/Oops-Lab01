
public class Main {

    public static void main(String[] args) {

        // Default Constructor
        ComplexNumber c0 = new ComplexNumber();

        // Parameterized Constructor
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(4, 5);

        System.out.println("c0 = " + c0);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // Show
        System.out.println("\nShow c1:");
        c1.show();

        // Getters
        System.out.println("\nReal = " + c1.getReal());
        System.out.println("Imaginary = " + c1.getImaginary());

        // Setters
        c0.setReal(10);
        c0.setImaginary(20);

        System.out.println("\nAfter Setter:");
        System.out.println(c0);

        // Copy Constructor
        ComplexNumber cCopy = new ComplexNumber(c1);

        System.out.println("\nCopy Constructor:");
        System.out.println("cCopy = " + cCopy);

        // Operations
        System.out.println("\nOperations:");

        System.out.println("Addition = " + c1.add(c2));

        System.out.println("Subtraction = " + c1.subtract(c2));

        System.out.println("Multiplication = " + c1.multiply(c2));
    }
}