public class Circle extends Shape {
  private double radius;

  public Circle() {
    super();
    this.radius = 1.0;
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius; 
  }

  public double getPerimeter() {
    return Math.PI * 2 * this.radius;
  }

  public String toString() {
    return super.toString() + ", radius=" + this.radius + "]";
  }
  
}
