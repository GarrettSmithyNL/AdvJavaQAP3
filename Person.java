/**
 * The Person class represents a person with a name, age, and gender.
 * By: Garrett Smith
 * Date: 12/06/2024
 */
class Person {

  protected String myName; // name of the person
  protected int myAge; // person’s age
  protected String myGender; // “M” for male, “F” for female

  /**
   * Constructs a Person object with the specified name, age, and gender.
   *
   * @param name   the name of the person
   * @param age    the age of the person
   * @param gender the gender of the person ("M" for male, "F" for female)
   */
  public Person(String name, int age, String gender) {
    myName = name;
    myAge = age;
    myGender = gender;
  }

  // Getters

  /**
   * Returns the name of the person.
   *
   * @return the name of the person
   */
  public String getName() {
    return myName;
  }

  /**
   * Returns the age of the person.
   *
   * @return the age of the person
   */
  public int getAge() {
    return myAge;
  }

  /**
   * Returns the gender of the person.
   *
   * @return the gender of the person ("M" for male, "F" for female)
   */
  public String getGender() {
    return myGender;
  }

  // Setters

  /**
   * Sets the name of the person.
   *
   * @param myName the new name of the person
   */
  public void setName(String myName) {
    this.myName = myName;
  }

  /**
   * Sets the age of the person.
   *
   * @param myAge the new age of the person
   */
  public void setAge(int myAge) {
    this.myAge = myAge;
  }

  /**
   * Sets the gender of the person.
   *
   * @param myGender the new gender of the person ("M" for male, "F" for female)
   */
  public void setGender(String myGender) {
    this.myGender = myGender;
  }

  /**
   * Returns a string representation of the person.
   *
   * @return a string representation of the person
   */
  public String toString() {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}