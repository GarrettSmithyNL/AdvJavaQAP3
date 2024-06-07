public class Teacher extends Person {
  protected String mySubject;
  protected double mySalary;

  public Teacher (String myName, int myAge, String myGender, String mySubject, double mySalary) {
    super(myName, myAge, myGender);
    this.mySubject = mySubject;
    this.mySalary = mySalary;
  }
  
  // Getters
  public double getMySalary() {
    return mySalary;
  }

  public String getMySubject() {
    return mySubject;
  }

  // Setters
  public void setMySalary(double salary) {
    this.mySalary = salary;
  }

  public void setMySubject(String subject) {
    this.mySubject = subject;
  }

  // toString 
  public String toString() {
    return super.toString() + ", salary: $" + mySalary + ", subject: " + mySubject;
  }
}
