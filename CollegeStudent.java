public class CollegeStudent extends Student {
  protected String myMajor;
  protected int myYear;

  public CollegeStudent (String myName, int myAge, String myGender, String myIDNum, double myGPA, String myMajor, int myYear) {
    super(myName, myAge, myGender, myIDNum, myGPA);
    this.myMajor = myMajor;
    this.myYear = myYear;
  }

  // Getters
  public String getMajor() {
    return myMajor;
  }

  public int getYear() {
    return myYear;
  }

  // Setters
  public void setMajor(String myMajor) {
    this.myMajor = myMajor;
  }

  public void setYear(int myYear) {
    this.myYear = myYear;
  }

  // toString
  public String toString() {
    return super.toString() + ", ID num: " + super.getIdNum() + ", GPA: " + super.getGPA() + ", major: " + this.myMajor + ", year: " + this.myYear;
  }
}
