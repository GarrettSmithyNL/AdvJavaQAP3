/**
 * The Rectangle class represents a rectangle shape.
 * It extends the Shape class and inherits its properties and methods.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Rectangle extends Shape {
  private double width;
  private double length;

  /**
   * Constructs a default Rectangle object with width and length set to 1.0.
   * It calls the default constructor of the superclass (Shape) using the super() keyword.
   */
  public Rectangle() {
    super();
    this.width = 1.0;
    this.length = 1.0;
  }

  /**
   * Constructs a Rectangle object with the specified width and length.
   * It calls the default constructor of the superclass (Shape) using the super() keyword.
   * @param width the width of the rectangle
   * @param length the length of the rectangle
   */
  public Rectangle(double width, double length) {
    super();
    this.width = width;
    this.length = length;
  }

  /**
   * Constructs a Rectangle object with the specified width, length, color, and filled status.
   * It calls the constructor of the superclass (Shape) using the super() keyword.
   * @param width the width of the rectangle
   * @param length the length of the rectangle
   * @param color the color of the rectangle
   * @param filled the filled status of the rectangle
   */
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  /**
   * Returns the width of the rectangle.
   * @return the width of the rectangle
   */
  public double getWidth() {
    return width;
  }

  /**
   * Returns the length of the rectangle.
   * @return the length of the rectangle
   */
  public double getLength() {
    return length;
  }

  /**
   * Sets the width of the rectangle to the specified value.
   * @param width the new width of the rectangle
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Sets the length of the rectangle to the specified value.
   * @param length the new length of the rectangle
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * Calculates and returns the area of the rectangle.
   * @return the area of the rectangle
   */
  public double getArea() {
    return this.width * this.length;
  }

  /**
   * Calculates and returns the perimeter of the rectangle.
   * @return the perimeter of the rectangle
   */
  public double getPerimeter() {
    return 2 * (width + length); 
  }

  /**
   * Returns a string representation of the rectangle.
   * The string includes the superclass's toString() method and the width and length of the rectangle.
   * @return a string representation of the rectangle
   */
  public String toString() {
    return super.toString() + ", width=" + this.width + ", length=" + this.length + "]";
  }
}
