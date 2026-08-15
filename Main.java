import java.util.Vector;

public class Main{
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(4, 5);
        Point p3 = new Point(p2);
        Point p4 = new Point(2, 3);
        Point p5 = p4.add(p2);
        Point p6 = p4.subtract(p2);
        p1.set(10, 20);
        p3.show();
        p5.show();
        p6.show();
        System.out.println(" After Set");
        System.out.println(" X = " + p1.getx());
        System.out.println(" Y = " + p1.gety());
         public class Main {
    public static void main(String[] args) {

        Vector v = new Vector(2, 3, 1);
        Vector u = new Vector(1, 2, 2);

        System.out.println("v = " + v);
        System.out.println("u = " + u);

        // Dot Product
        System.out.println("Dot Product (v.u) = " + v.dotProduct(u));

        // Cross Product
        Vector cross = v.crossProduct(u);
        System.out.println("Cross Product (v x u) = " + cross);

        // Magnitude
        System.out.println("Magnitude of v = " + v.magnitude());
        System.out.println("Magnitude of u = " + u.magnitude());

        // Projection
        System.out.println("Projection of v on u = " + v.projection(u));

        // Copy Constructor
        Vector vCopy = new Vector(v);
        System.out.println("vCopy = " + vCopy);

        // Changing copy
        vCopy.a = 99;

        System.out.println("vCopy after change = " + vCopy);
        System.out.println("v (unaffected) = " + v);
    }
    }
        Point a = new Point(2,3);
        Point b = new Point(8,11);
        
        Line l1 = new Line();
        l1.show();
        Line l2 = new Line(a, b);
        l2.show();
        Line l3 = new Line(l2);
        l3.show();
        System.out.println(l2);
    
    
        Point m = new Point(0, 0);
        Point n = new Point(4, 0);
        Point o = new Point(0, 3);

        Triangle t1 = new Triangle(p1, p2, p3);
       
        System.out.println(t1);

        // Triangle ke teeno sides ko Line objects ki tarah alag se nikalo
        Line sideA = t1.sideA();
        Line sideB = t1.sideB();
        Line sideC = t1.sideC();

       
        Triangle t2 = new Triangle(t1);
        t2.show();
        System.out.println(t2);
    }

}