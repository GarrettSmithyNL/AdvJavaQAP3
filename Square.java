/**
 * The Square class represents a square shape.
 * It is a subclass of the Rectangle class and inherits its properties and methods.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Square extends Rectangle {
  /**
   * Constructs a default Square object with side length of 0.
   * It calls the default constructor of the Rectangle class.
   */
  public Square() {
    super();
  }

  /**
   * Constructs a Square object with the specified side length.
   * It calls the constructor of the Rectangle class with the same side length for both width and length.
   * @param side the side length of the square
   */
  public Square(double side) {
    super(side, side);
  }

  /**
   * Constructs a Square object with the specified side length, color, and filled status.
   * It calls the constructor of the Rectangle class with the same side length for both width and length,
   * and the specified color and filled status.
   * @param side the side length of the square
   * @param color the color of the square
   * @param filled the filled status of the square
   */
  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  /**
   * Returns the side length of the square.
   * It calls the getWidth() method of the Rectangle class, as both width and length are the same for a square.
   * @return the side length of the square
   */
  public double getSide() {
    return super.getWidth();
  }

  /**
   * Sets the side length of the square.
   * It calls the setWidth() and setLength() methods of the Rectangle class, 
   * as both width and length should be set to the same value for a square.
   * @param side the side length of the square
   */
  public void setWidth(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  /**
   * Sets the side length of the square.
   * It calls the setWidth() and setLength() methods of the Rectangle class, 
   * as both width and length should be set to the same value for a square.
   * @param side the side length of the square
   */
  public void setLength(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  /**
   * Returns a string representation of the square.
   * It includes the side length of the square and the string representation of the Rectangle class.
   * @return a string representation of the square
   */
  public String toString() {
    return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
  }
}
