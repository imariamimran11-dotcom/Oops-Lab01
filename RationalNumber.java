class RationalNumber {

    private int numerator;
    private int denominator;

    // 1. Null / Default Constructor
    RationalNumber() {
        numerator = 0;
        denominator = 1;
    }

    // 2. Parameterized Constructor
    RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // 3. Copy Constructor
    RationalNumber(RationalNumber r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    // 4. Setters
    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // 5. Getters
    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    // 6. Show Method
    void show() {
        System.out.println("Numerator = " + numerator);
        System.out.println("Denominator = " + denominator);
    }

    // 7. Addition
    RationalNumber add(RationalNumber r) {
        int n = (this.numerator * r.denominator)
              + (r.numerator * this.denominator);

        int d = this.denominator * r.denominator;

        return new RationalNumber(n, d);
    }

    // 8. Subtraction
    RationalNumber subtract(RationalNumber r) {
        int n = (this.numerator * r.denominator)
              - (r.numerator * this.denominator);

        int d = this.denominator * r.denominator;

        return new RationalNumber(n, d);
    }

    // 9. Multiplication
    RationalNumber multiply(RationalNumber r) {
        int n = this.numerator * r.numerator;
        int d = this.denominator * r.denominator;

        return new RationalNumber(n, d);
    }

    // 10. Division
    RationalNumber divide(RationalNumber r) {
        int n = this.numerator * r.denominator;
        int d = this.denominator * r.numerator;

        return new RationalNumber(n, d);
    }

    // 11. toString
    public String toString() {
        return numerator + "/" + denominator;
    }
}
