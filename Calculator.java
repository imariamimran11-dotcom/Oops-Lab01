import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;

    public Calculator() {
        num1 = 0;
        num2 = 0;
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }

    public void show() {
        System.out.println("First Number  : " + getNum1());
        System.out.println("Second Number : " + getNum2());
        System.out.println("Addition      : " + add());
        System.out.println("Subtraction   : " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division      : " + divide());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double n2 = sc.nextDouble();

        Calculator c1 = new Calculator();
        c1.setNum1(n1);
        c1.setNum2(n2);

        System.out.println("\n----- Output using Null Constructor + Setter -----");
        c1.show();

        Calculator c2 = new Calculator(n1, n2);

        System.out.println("\n----- Output using Parameterized Constructor -----");
        c2.show();

        sc.close();
    }
} 
