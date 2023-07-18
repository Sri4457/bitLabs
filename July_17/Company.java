import java.util.*;

class InvalidSalaryException extends Exception {
  public InvalidSalaryException(String e) {
    super(e);
  }
}

public class Company {

  ArrayList<EmployeePj> emp = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void addEmployee() throws InvalidSalaryException {
    System.out.println("Enter the Employee Id");
    int id = sc.nextInt();
    boolean flag = true;
    for (int i = 0; i < emp.size(); i++) {
      if (emp.get(i).getEmp_id() == id) {
        System.out.println("Employee Id Alreadt exists");
        System.out.println();
        flag = false;
        break;
      }
    }
    if (flag) {
      sc.nextLine();
      System.out.println("Enter the Employee Name");
      String name = sc.nextLine();
      System.out.println("Enter the City");
      String city = sc.nextLine();
      System.out.println("Enter the Employee Salary");
      double sal = sc.nextDouble();
      if (sal <= 15000) {
        throw new InvalidSalaryException("Salary of Employee should greater than the $15,000");
      } else {
        EmployeePj e = new EmployeePj();
        e.setEmp_id(id);
        e.setEmp_city(city);
        e.setEmp_salary(sal);
        e.setEmp_name(name);
        if (emp.add(e)) {
          System.out.println("Successfully inserted ");

        } else {
          System.out.println("Something went Wrong");
        }
        System.out.println();
      }
    }

  }

  public void deleteEmployee() {

    System.out.println("Enter the Employee Id");
    int id = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i < emp.size(); i++) {
      if (emp.get(i).getEmp_id() == id) {
        emp.remove(i);
        System.out.println("Deleted Successfully");
        System.out.println();
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("Please Enter Valid Employee Id");
      System.out.println();
    }
  }

  public void displayEmployee() {
    System.out.println("Enter the Employee Id");
    int id = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i < emp.size(); i++) {
      if (emp.get(i).getEmp_id() == id) {
        System.out.println("Employee Id " + emp.get(i).getEmp_id());
        System.out.println("Employee name " + emp.get(i).getEmp_name());
        System.out.println("Employee City " + emp.get(i).getEmp_city());
        System.out.println("Employee Salary " + emp.get(i).getEmp_salary());
        System.out.println();
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("Please Enter Valid Employee Id");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Company c = new Company();
    int option = 0;
    do {
      System.out.println("1. Add Employee");
      System.out.println("2. Remove Employee");
      System.out.println("3. Display Employee");
      System.out.println("4. Exit");
      option = c.sc.nextInt();
      switch (option) {
        case 1:
          try {
            c.addEmployee();
          } catch (InvalidSalaryException e) {
            System.out.println(e);
          }
          break;
        case 2:
          c.deleteEmployee();
          break;
        case 3:
          c.displayEmployee();
          break;
        case 4:
          System.out.println("*** ThankYou ***");
          break;
      }
    } while (option != 4);
  }
}
