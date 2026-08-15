public class Point {

    private double x;
    private double y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
     public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point obj){
        this.x = obj.x;
        this.y = obj.y;
    } 
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public void show(){
        System.out.println(" X = " + getx());
        System.out.println(" Y = " + gety());
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public Point add(Point obj){
        double newX = this.x + obj.x;
        double newY = this.y + obj.y;
        Point temp = new Point(newX, newY);
        return temp;
    }
     public Point subtract(Point obj){
        double newX = obj.x - this.x;
        double newY = obj.y - this.y;
        Point temp = new Point(newX, newY);
        return temp;
    }
}