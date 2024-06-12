/**
 * The Shape class represents a geometric shape.
 * It has properties such as color and filled status.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Shape {
  private String color;
  private boolean filled;

  /**
   * Constructs a Shape object with default color "red" and filled status as true.
   */
  public Shape() {
    this.color = "red";
    this.filled = true;
  }

  /**
   * Constructs a Shape object with the given color and filled status.
   * @param color The color of the shape.
   * @param filled The filled status of the shape.
   */
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**
   * Returns the color of the shape.
   * @return The color of the shape.
   */
  public String getColor() {
    return color;
  }

  /**
   * Returns the filled status of the shape.
   * @return The filled status of the shape.
   */
  public boolean isFilled() {
    return filled;
  }

  /**
   * Sets the color of the shape.
   * @param color The color to set.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Sets the filled status of the shape.
   * @param filled The filled status to set.
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**
   * Returns a string representation of the shape.
   * @return A string representation of the shape.
   */
  public String toString() {
    return "Shape[color=" + this.color + ", filled=" + this.filled + "]";
  }
}
