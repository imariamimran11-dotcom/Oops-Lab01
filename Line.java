public class Line {
      private Point p1;
      private Point p2;
    
    public Line(){
        p1 = new Point();
        p2 = new Point();
    }
     public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(Line l){
        this.p1 = new Point(l.p1);
        this.p2 = new Point(l.p2);
    } 
    public void set1(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getp1(){
        return p1;
    }
    public Point getp2(){
        return p2;
    }
    public void show(){
        System.out.println(" p1 = " + getp1());
        System.out.println(" p2 = " + getp2());
    }
    public String toString(){
        return "Line[" + p1 + ", " + p2 + "]";
    }
}

