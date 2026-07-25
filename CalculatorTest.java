public class CalculatorTest.{
 public static void main(String[] args){
  Calculator c=new Calculator(10,5);
  System.out.println(c.add());
  System.out.println(c.subtract());
  System.out.println(c.multiply());
  System.out.println(c.divide());
  System.out.println(c.modulus());
  System.out.println(c.power());
  System.out.println(c.average());
  System.out.println(c.maximum());
  try{System.out.println(new Calculator(10,0).divide());}
  catch(ArithmeticException e){System.out.println(e.getMessage());}
 }
}
