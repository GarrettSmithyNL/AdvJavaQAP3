/**
 * The Student class represents a student, which is a subclass of the Person class.
 * It contains information about the student's ID number and grade point average (GPA).
 * By: Garrett Smith
 * Date: 12/06/2024
 */
class Student extends Person { 
  protected String myIdNum; // Student Id Number 
  protected double myGPA; // grade point average

  /**
   * Constructs a Student object with the specified name, age, gender, ID number, and GPA.
   * 
   * @param name the name of the student
   * @param age the age of the student
   * @param gender the gender of the student
   * @param idNum the ID number of the student
   * @param gpa the grade point average of the student
   */
  public Student(String name, int age, String gender, String idNum, double gpa) { 
    // use the super class’ constructor 
    super(name, age, gender);
    // initialize what’s new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  // Getters
  /**
   * Returns the ID number of the student.
   * 
   * @return the ID number of the student
   */
  public String getIdNum() {
    return myIdNum;
  }

  /**
   * Returns the grade point average of the student.
   * 
   * @return the grade point average of the student
   */
  public double getGPA() {
    return myGPA;
  }

  // Setters
  /**
   * Sets the ID number of the student.
   * 
   * @param myIdNum the ID number to set
   */
  public void setIdNum(String myIdNum) {
    this.myIdNum = myIdNum;
  }

  /**
   * Sets the grade point average of the student.
   * 
   * @param myGPA the grade point average to set
   */
  public void setGPA(double myGPA) {
    this.myGPA = myGPA;
  }
}