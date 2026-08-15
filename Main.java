
public class Main {

    public static void main(String[] args) {

        // Default Constructor
        RationalNumber r0 = new RationalNumber();

        // Parameterized Constructor
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(2, 3);

        System.out.println("r0 = " + r0);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // Show
        System.out.println("\nShow r1:");
        r1.show();

        // Getters
        System.out.println("\nNumerator = " + r1.getNumerator());
        System.out.println("Denominator = " + r1.getDenominator());

        // Setters
        r0.setNumerator(5);
        r0.setDenominator(7);

        System.out.println("\nAfter Setter:");
        System.out.println(r0);

        // Copy Constructor
        RationalNumber rCopy = new RationalNumber(r1);

        System.out.println("\nCopy Constructor:");
        System.out.println("rCopy = " + rCopy);

        // Operations
        System.out.println("\nOperations:");

        System.out.println("Addition = " + r1.add(r2));

        System.out.println("Subtraction = " + r1.subtract(r2));

        System.out.println("Multiplication = " + r1.multiply(r2));

        System.out.println("Division = " + r1.divide(r2));
    }
}

