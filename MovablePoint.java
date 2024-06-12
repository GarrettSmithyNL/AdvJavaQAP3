/**
 * The MovablePoint class represents a point in a two-dimensional space that can be moved.
 * It extends the Point class and adds functionality for speed and movement.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class MovablePoint extends Point {
  private float xSpeed;
  private float ySpeed;

  /**
   * Constructs a MovablePoint object with the specified coordinates and speeds.
   * 
   * @param x the x-coordinate of the point
   * @param y the y-coordinate of the point
   * @param xSpeed the speed in the x-direction
   * @param ySpeed the speed in the y-direction
   */
  public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  
  /**
   * Constructs a MovablePoint object with the specified speeds and default coordinates (0, 0).
   * 
   * @param xSpeed the speed in the x-direction
   * @param ySpeed the speed in the y-direction
   */
  public MovablePoint(float xSpeed, float ySpeed) {
    super();
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  /**
   * Constructs a MovablePoint object with default coordinates (0, 0) and speeds (0, 0).
   */
  public MovablePoint() {
    super();
    this.xSpeed = 0.0f;
    this.ySpeed = 0.0f;
  }

  /**
   * Returns the speed in the x-direction.
   * 
   * @return the speed in the x-direction
   */
  public float getXSpeed() {
    return xSpeed;
  }

  /**
   * Sets the speed in the x-direction.
   * 
   * @param xSpeed the speed in the x-direction
   */
  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  /**
   * Returns the speed in the y-direction.
   * 
   * @return the speed in the y-direction
   */
  public float getYSpeed() {
    return ySpeed;
  }

  /**
   * Sets the speed in the y-direction.
   * 
   * @param ySpeed the speed in the y-direction
   */
  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  /**
   * Sets the speeds in both x and y directions.
   * 
   * @param xSpeed the speed in the x-direction
   * @param ySpeed the speed in the y-direction
   */
  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  /**
   * Returns an array containing the speeds in both x and y directions.
   * 
   * @return an array containing the speeds in both x and y directions
   */
  public float[] getSpeed() {
    return new float[]{this.xSpeed, this.ySpeed};
  }

  /**
   * @override
   * Returns a string representation of the MovablePoint object.
   * 
   * @return a string representation of the MovablePoint object
   */
  public String toString() {
    return super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
  }

  /**
   * Moves the MovablePoint object by updating its coordinates based on the current speeds.
   * 
   * @return the updated MovablePoint object
   */
  public MovablePoint move() {
    super.setX(super.getX() + this.xSpeed);
    super.setY(super.getY() + this.ySpeed);
    return this;
  }
}
