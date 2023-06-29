import java.util.*;

class Validate_Student {
  public boolean validate_studentId(String stud_id) {
    char ch = stud_id.charAt(stud_id.length() - 1);
    if (stud_id.length() >= 6 && stud_id.length() <= 10) {
      if (stud_id.startsWith("std")) {
        if (ch >= '0' && ch <= '9') {
          System.out.println("Student id is valid");
          return true;
        } else {
          System.out.println("Student id is not ending with digit");
          return false;
        }
      } else {
        System.out.println("Student id is not starting with std");
        return false;
      }
    } else {
      System.out.println("student id length is incorrect");
      return false;
    }
  }

  public boolean validate_studentName(String stud_name) {
    if (stud_name.length() >= 5 && stud_name.length() <= 15) {
      if (stud_name.charAt(0) >= 'A' && stud_name.charAt(0) <= 'Z') {
        for (int i = 1; i < stud_name.length(); i++) {
          int a = (int) stud_name.charAt(i);
          if (a >= 97 && a <= 128)
            continue;
          else {
            System.out.println("The characters other than first in student name is not a lower case alphabet");
            return false;
          }
        }
        System.out.println("Student name is valid");
        return true;
      } else {
        System.out.println("Student name starting character is not a Capital letter");
        return false;
      }
    } else {
      System.out.println("Student name is not in a correct length");
      return false;
    }
  }

  public boolean validate_studentEmail(String stud_email) {
    if (stud_email.contains("@") && (stud_email.endsWith(".com") || stud_email.endsWith(".in"))
        && (stud_email.charAt(0) >= 'A' && stud_email.charAt(0) <= 'Z'
            || stud_email.charAt(0) >= 'a' && stud_email.charAt(0) <= 'z')
        && stud_email.length() >= 10 && stud_email.length() <= 25) {
      for (int i = 1; i < stud_email.length(); i++) {
        int a = (int) stud_email.charAt(i);
        if (a >= 65 && a <= 128 || a >= 48 && a <= 57 || stud_email.charAt(i) == '@' || stud_email.charAt(i) == '.'
            || stud_email.charAt(i) == '_')
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
          System.out.println("Student Mobileis not valid has it contains other than digits in it");
          return false;
        }
      }
      System.out.println("Student Mobile is valid");
      return true;
    } else {
      System.out.println("Student Mobile length is not 10");
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
          System.out.println("Student Password is not in a correct format has it has a space init");
          return false;
        } else if (a >= 48 && a <= 57)
          d_count++;
        else
          spe_count++;
      }
      if (u_count >= 1) {
        if (l_count >= 1) {
          if (d_count >= 1) {
            if (spe_count >= 1) {
              System.out.println("Student Password is valid");
              return true;
            } else {
              System.out.println("Student password doesn't had a special character");
              return false;
            }
          } else {
            System.out.println("Student password doesn't had a digit character");
            return false;
          }
        } else {
          System.out.println("Student password doesn't had a lowercase alphabet");
          return false;
        }
      } else {
        System.out.println("Student password doesn't had a uppercase alphabet");
        return false;
      }
    } else {
      System.out.println("Student Password is not in a correct length");
      return false;
    }
  }

  public boolean validate_studentUname(String stud_uname, String stud_pass) {
    int a = stud_uname.charAt(0);
    if (!stud_uname.equals(stud_pass)) {
      if (stud_uname.length() >= 8 && stud_uname.length() <= 15) {
        if (a >= 65 && a <= 128) {
          for (int i = 1; i < stud_uname.length(); i++) {
            if (stud_uname.charAt(i) == ' ') {
              System.out.println("Student UserName is not in correct format it has space in it");
              return false;
            }
          }
          System.out.println("Student Username is valid");
          return true;
        } else {
          System.out.println("Student Username first character is not an alphabet");
          return false;
        }
      } else {
        System.out.println("Student username length is not in a range 8 to 15");
        return false;
      }
    } else {
      System.out.println("The username and password are same but they shouldn't be same");
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