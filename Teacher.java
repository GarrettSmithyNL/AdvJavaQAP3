/**
 * The Teacher class represents a teacher, which is a subclass of Person.
 * It contains information about the teacher's subject and salary.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
public class Teacher extends Person {
  protected String mySubject;
  protected double mySalary;

  /**
   * Constructs a Teacher object with the specified name, age, gender, subject, and salary.
   *
   * @param myName the name of the teacher
   * @param myAge the age of the teacher
   * @param myGender the gender of the teacher
   * @param mySubject the subject taught by the teacher
   * @param mySalary the salary of the teacher
   */
  public Teacher (String myName, int myAge, String myGender, String mySubject, double mySalary) {
    super(myName, myAge, myGender);
    this.mySubject = mySubject;
    this.mySalary = mySalary;
  }
  
  // Getters
  /**
   * Returns the salary of the teacher.
   *
   * @return the salary of the teacher
   */
  public double getMySalary() {
    return mySalary;
  }

  /**
   * Returns the subject taught by the teacher.
   *
   * @return the subject taught by the teacher
   */
  public String getMySubject() {
    return mySubject;
  }

  // Setters
  /**
   * Sets the salary of the teacher.
   *
   * @param salary the new salary of the teacher
   */
  public void setMySalary(double salary) {
    this.mySalary = salary;
  }

  /**
   * Sets the subject taught by the teacher.
   *
   * @param subject the new subject taught by the teacher
   */
  public void setMySubject(String subject) {
    this.mySubject = subject;
  }

  // toString 
  /**
   * Returns a string representation of the teacher.
   *
   * @return a string representation of the teacher
   */
  public String toString() {
    return super.toString() + ", salary: $" + mySalary + ", subject: " + mySubject;
  }
}
