import java.util.*;

class student {
  String name;
  int age, id;

  student(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  student() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

public class student_obj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    student[] arr = new student[n];
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.println("Enter student name");
      String name = sc.nextLine();
      System.out.println("Enter student id");
      int id = sc.nextInt();
      System.out.println("Enter student age");
      int age = sc.nextInt();
      student obj = new student(name, age, id);
      arr[i] = obj;
    }
    for (int i = 0; i < n; i++) {
      System.out.print("\nName : " + arr[i].getName() + " age " + arr[i].getAge() + " id " + arr[i].getId());
    }
    sc.close();
  }
}