/**
 * The Circle class represents a circle shape.
 * It extends the Shape class and inherits its properties and methods.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Circle extends Shape {
  private double radius;

  /**
   * Constructs a default Circle object with a radius of 1.0.
   * It calls the default constructor of the superclass (Shape).
   */
  public Circle() {
    super();
    this.radius = 1.0;
  }

  /**
   * Constructs a Circle object with the specified radius.
   * It calls the default constructor of the superclass (Shape).
   *
   * @param radius the radius of the circle
   */
  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  /**
   * Constructs a Circle object with the specified radius, color, and filled status.
   * It calls the constructor of the superclass (Shape) with the given color and filled status.
   *
   * @param radius the radius of the circle
   * @param color the color of the circle
   * @param filled the filled status of the circle
   */
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * Returns the radius of the circle.
   *
   * @return the radius of the circle
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the circle to the specified value.
   *
   * @param radius the new radius of the circle
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Calculates and returns the area of the circle.
   *
   * @return the area of the circle
   */
  public double getArea() {
    return Math.PI * radius * radius; 
  }

  /**
   * Calculates and returns the perimeter of the circle.
   *
   * @return the perimeter of the circle
   */
  public double getPerimeter() {
    return Math.PI * 2 * this.radius;
  }

  /**
   * Returns a string representation of the circle.
   * It includes the superclass's toString() method and the radius of the circle.
   *
   * @return a string representation of the circle
   */
  public String toString() {
    return super.toString() + ", radius=" + this.radius + "]";
  }
}
