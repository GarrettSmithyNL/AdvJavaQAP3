/**
 * The Point class represents a point in a two-dimensional coordinate system.
 * It has methods to get and set the x and y coordinates, as well as methods
 * to get and set both coordinates at once. It also provides a toString method
 * to represent the point as a string in the format (x,y).
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Point {
  private float x;
  private float y;

  /**
   * Constructs a Point object with the specified x and y coordinates.
   *
   * @param x the x coordinate of the point
   * @param y the y coordinate of the point
   */
  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Constructs a Point object with the default coordinates (0,0).
   */
  public Point() {
    this.x = 0.0f;
    this.y = 0.0f;
  }

  /**
   * Returns the x coordinate of the point.
   *
   * @return the x coordinate of the point
   */
  public float getX() {
    return x;
  }

  /**
   * Sets the x coordinate of the point.
   *
   * @param x the new x coordinate of the point
   */
  public void setX(float x) {
    this.x = x;
  }

  /**
   * Returns the y coordinate of the point.
   *
   * @return the y coordinate of the point
   */
  public float getY() {
    return y;
  }
  
  /**
   * Sets the y coordinate of the point.
   *
   * @param y the new y coordinate of the point
   */
  public void setY(float y) {
    this.y = y;
  }

  /**
   * Sets the x and y coordinates of the point.
   *
   * @param x the new x coordinate of the point
   * @param y the new y coordinate of the point
   */
  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns an array containing the x and y coordinates of the point.
   *
   * @return an array containing the x and y coordinates of the point
   */
  public float[] getXY() {
    return new float[]{this.x, this.y};
  }

  /**
   * @override
   * Returns a string representation of the point in the format (x,y).
   *
   * @return a string representation of the point
   */
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }
}
