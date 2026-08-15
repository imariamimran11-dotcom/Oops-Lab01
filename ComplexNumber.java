class ComplexNumber {
    private double real;
    private double imaginary;

    // 1. Null / Default Constructor
    ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    // 2. Parameterized Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // 3. Copy Constructor
    ComplexNumber(ComplexNumber c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // 4. Setters
    void setReal(double real) {
        this.real = real;
    }

    void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // 5. Getters
    double getReal() {
        return real;
    }

    double getImaginary() {
        return imaginary;
    }

    // 6. Show Method
    void show() {
        System.out.println("Real = " + real);
        System.out.println("Imaginary = " + imaginary);
    }

    // 7. Addition
    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(
            real + c.real,
            imaginary + c.imaginary
        );
    }

    // 8. Subtraction
    ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(
            real - c.real,
            imaginary - c.imaginary
        );
    }

    // 9. Multiplication
    ComplexNumber multiply(ComplexNumber c) {
        double r = (real * c.real) -
                   (imaginary * c.imaginary);

        double i = (real * c.imaginary) +
                   (imaginary * c.real);

        return new ComplexNumber(r, i);
    }

    // 10. toString
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}


