/**
 * The CollegeStudent class represents a college student and extends the Student class.
 * It includes additional attributes for the student's major and year.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class CollegeStudent extends Student {
  protected String myMajor;
  protected int myYear;

  /**
   * Constructs a CollegeStudent object with the specified parameters.
   *
   * @param myName    the name of the college student
   * @param myAge     the age of the college student
   * @param myGender  the gender of the college student
   * @param myIDNum   the ID number of the college student
   * @param myGPA     the GPA of the college student
   * @param myMajor   the major of the college student
   * @param myYear    the year of the college student
   */
  public CollegeStudent (String myName, int myAge, String myGender, String myIDNum, double myGPA, String myMajor, int myYear) {
    super(myName, myAge, myGender, myIDNum, myGPA);
    this.myMajor = myMajor;
    this.myYear = myYear;
  }

  // Getters
  /**
   * Returns the major of the college student.
   *
   * @return the major of the college student
   */
  public String getMajor() {
    return myMajor;
  }

  /**
   * Returns the year of the college student.
   *
   * @return the year of the college student
   */
  public int getYear() {
    return myYear;
  }

  // Setters
  /**
   * Sets the major of the college student.
   *
   * @param myMajor the major of the college student
   */
  public void setMajor(String myMajor) {
    this.myMajor = myMajor;
  }

  /**
   * Sets the year of the college student.
   *
   * @param myYear the year of the college student
   */
  public void setYear(int myYear) {
    this.myYear = myYear;
  }

  // toString
  /**
   * Returns a string representation of the college student.
   *
   * @return a string representation of the college student
   */
  public String toString() {
    return super.toString() + ", ID num: " + super.getIdNum() + ", GPA: " + super.getGPA() + ", major: " + this.myMajor + ", year: " + this.myYear;
  }
}
