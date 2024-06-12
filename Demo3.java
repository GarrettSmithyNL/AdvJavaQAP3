

public class Demo3 {
  public static void main(String[] args) {
    // Test Constructors
    Point P1 = new Point(1.0f, 2.0f);
    System.out.println(P1);
    Point P2 = new Point();
    System.out.println(P2);

    // Test Setters
    P1.setX(3.0f);
    P1.setY(4.0f);
    System.out.println(P1);

    // Test Getters
    System.out.println("x is: " + P1.getX());
    System.out.println("y is: " + P1.getY());

    // Test setXY()
    P1.setXY(5.0f, 6.0f);
    System.out.println(P1);

    // Test getXY()
    float[] XY = P1.getXY();
    System.out.println("x is: " + XY[0]);
    System.out.println("y is: " + XY[1]);

    // Test MovablePoint Constructor
    MovablePoint MP1 = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
    System.out.println(MP1);
    MovablePoint MP2 = new MovablePoint();
    System.out.println(MP2);
    MovablePoint MP3 = new MovablePoint(5.0f, 6.0f);
    System.out.println(MP3);

    // Test MovablePoint Setters
    MP1.setX(7.0f);
    MP1.setY(8.0f);
    MP1.setXSpeed(9.0f);
    MP1.setYSpeed(10.0f);
    System.out.println(MP1);

    // Test MovablePoint Getters
    System.out.println("x is: " + MP1.getX());
    System.out.println("y is: " + MP1.getY());
    System.out.println("xSpeed is: " + MP1.getXSpeed());
    System.out.println("ySpeed is: " + MP1.getYSpeed());

    // Test MovablePoint setSpeed()
    MP1.setSpeed(11.0f, 12.0f);
    System.out.println(MP1);

    // Test MovablePoint getSpeed()
    float[] Speed = MP1.getSpeed();
    System.out.println("xSpeed is: " + Speed[0]);
    System.out.println("ySpeed is: " + Speed[1]);

    // Test MovablePoint move()
    MP1.move();
    System.out.println(MP1);
  }
}