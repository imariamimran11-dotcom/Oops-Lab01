public class Car {
    String brand;
    String color;
    int speed;
    int fuelLevel;
    int gear;

    public void start(){ System.out.println("Car Started"); }
    public void stop(){ System.out.println("Car Stopped"); }
    public void drive(){ System.out.println("Car is Driving"); }
    public void moveFast(){ speed += 20; }
    public void moveSlow(){ speed -= 10; }
    public void moveLeft(){ System.out.println("Left"); }
    public void moveRight(){ System.out.println("Right"); }
    public void horn(){ System.out.println("Beep Beep!"); }

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.moveFast();
        myCar.horn();
        myCar.stop();
    }
}