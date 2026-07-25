public class Calculator {
    private double num1, num2;
    public Calculator(double num1,double num2){this.num1=num1;this.num2=num2;}
    public double add(){return num1+num2;}
    public double subtract(){return num1-num2;}
    public double multiply(){return num1*num2;}
    public double divide(){if(num2==0) throw new ArithmeticException("Division by zero is not allowed."); return num1/num2;}
    public double modulus(){if(num2==0) throw new ArithmeticException("Modulus by zero is not allowed."); return num1%num2;}
    public double power(){return Math.pow(num1,num2);}
    public double average(){return (num1+num2)/2;}
    public double maximum(){return Math.max(num1,num2);}
}
