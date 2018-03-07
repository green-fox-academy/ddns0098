package cloneable;

public class Student extends Person implements Cloneable{
  private String previousOrganization;
  private int skippedDays;

  public  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  public Student clone() {
    return this;
  }

  public void getGoal() {
    System.out.println("My Goal: Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
