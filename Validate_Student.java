import java.util.*;

class Validate_Student {
  public boolean validate_studentId(String stud_id) {
    char ch = stud_id.charAt(stud_id.length() - 1);
    if (stud_id.length() >= 6 && stud_id.length() <= 10 && stud_id.startsWith("std") && ch >= '0' && ch <= '9') {
      return true;
    } else {
      System.out.println("Student Id is not in correct format");
      return false;
    }
  }

  public boolean validate_studentName(String stud_name) {
    if (stud_name.length() >= 5 && stud_name.length() <= 15 && stud_name.charAt(0) >= 'A'
        && stud_name.charAt(0) <= 'Z') {
      for (int i = 1; i < stud_name.length(); i++) {
        int a = (int) stud_name.charAt(i);
        if (a >= 97 && a <= 128)
          continue;
        else {
          System.out.println("Student name is not in correct format");
          return false;
        }
      }
      return true;
    } else {
      System.out.println("Student name is not in correct format");
      return false;
    }
  }

  public boolean validate_studentEmail(String stud_email) {
    if (stud_email.contains("@") && (stud_email.endsWith(".com") || stud_email.endsWith(".in"))
        && (stud_email.charAt(0) >= 'A' || stud_email.charAt(0) <= 'Z'
            || stud_email.charAt(0) >= 'a' && stud_email.charAt(0) <= 'z')
        && stud_email.length() >= 10 && stud_email.length() <= 25) {
      for (int i = 1; i < stud_email.length(); i++) {
        int a = (int) stud_email.charAt(i);
        if (a >= 65 && a <= 128 || a >= 48 && a <= 57 || stud_email.charAt(i) == '@' || stud_email.charAt(i) == '.')
          continue;
        else {
          System.out.println("Student email is not in correct format");
          return false;
        }
      }
      return true;
    } else {
      System.out.println("Student email is not in correct format");
      return false;
    }
  }

  public boolean validate_studentMobile(String stud_mobile) {
    if (stud_mobile.length() == 10) {
      for (int i = 0; i < stud_mobile.length(); i++) {
        int a = (int) stud_mobile.charAt(i);
        if (a >= 48 && a <= 57)
          continue;
        else {
          System.out.println("Student Mobile is not in correct format");
          return false;
        }
      }
      return true;
    } else {
      System.out.println("Student Mobile is not in a correct format");
      return false;
    }
  }

  public boolean validate_studentPass(String stud_pass) {
    if (stud_pass.length() >= 8 && stud_pass.length() <= 15) {
      int u_count = 0, l_count = 0, d_count = 0, spe_count = 0;
      for (int i = 0; i < stud_pass.length(); i++) {
        int a = (int) stud_pass.charAt(i);
        if (a < 97 && a >= 65) {
          u_count++;
        } else if (a >= 97 && a <= 128)
          l_count++;
        else if (stud_pass.charAt(i) == ' ') {
          System.out.println("Student Password is not in a correct format");
          return false;
        } else if (a >= 48 && a <= 57)
          d_count++;
        else
          spe_count++;
      }
      if (u_count >= 1 && l_count >= 1 && d_count >= 1 && spe_count >= 1)
        return true;
      else {
        System.out.println("Student Password is not in correct format");
        return false;
      }
    } else {
      System.out.println("Student Password is not in a correct format");
      return false;
    }
  }

  public boolean validate_studentUname(String stud_uname, String stud_pass) {
    int a = stud_uname.charAt(0);
    if (!stud_uname.equals(stud_pass) && stud_uname.length() >= 8 && stud_uname.length() <= 15 && a >= 65 && a <= 128) {
      for (int i = 1; i < stud_uname.length(); i++) {
        if (stud_uname.charAt(i) == ' ') {
          System.out.println("Student UserName is not in correct format");
          return false;
        }
      }
      return true;
    } else {
      System.out.println("Student UserName is not in correct format");
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Id");
    String stud_id = sc.nextLine();
    System.out.println("Enter Student name");
    String stud_name = sc.nextLine();
    System.out.println("Enter Student Email");
    String stud_email = sc.nextLine();
    System.out.println("Enter Student Mobile");
    String stud_mobile = sc.nextLine();
    System.out.println("Enter Student password");
    String stud_pass = sc.nextLine();
    System.out.println("Enter Student UserName");
    String stud_uname = sc.nextLine();
    Validate_Student obj = new Validate_Student();
    boolean f1 = obj.validate_studentId(stud_id);
    boolean f2 = obj.validate_studentName(stud_name);
    boolean f3 = obj.validate_studentEmail(stud_email);
    boolean f4 = obj.validate_studentMobile(stud_mobile);
    boolean f5 = obj.validate_studentPass(stud_pass);
    boolean f6 = obj.validate_studentUname(stud_uname, stud_pass);
    if (f1 && f2 && f3 && f4 && f5 && f6) {
      System.out.println("Student Validation is successfull");
    }
    sc.close();
  }
}