 public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    // 1) Default (null) constructor
    public Triangle(){
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    // 2) Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // 3) Copy constructor
    public Triangle(Triangle t){
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
    }

    
    public void set(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Point getp1(){ return p1; }
    public Point getp2(){ return p2; }
    public Point getp3(){ return p3; }

    public Line sideA(){
        return new Line(p1, p2);
    }

    public Line sideB(){
        return new Line(p2, p3);
    }

    public Line sideC(){
        return new Line(p3, p1);
    }

    public double perimeter(){
double sideX = sideA().length() + sideB().length();
double sideY = sideX + sideC().length();
        return sideY;
    }

   
    public void show(){
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("Side A = " + sideA());
        System.out.println("Side B = " + sideB());
        System.out.println("Side C = " + sideC());
        System.out.println("Perimeter = " + perimeter());
    }

    // 6) toString
    public String toString(){
        return "Triangle[" + p1 + ", " + p2 + ", " + p3 + "]";
    }
}
