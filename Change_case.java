import java.util.*;

public class Change_case {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int j = str.length() - 1;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) == str.charAt(j))
        j--;
      else {
        break;
      }
    }
    if (str.length() % 2 == 0 && j == str.length() / 2 - 1)
      System.out.println("Palindrome");
    else if (str.length() % 2 != 0 && j == str.length() / 2)
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");

    sc.close();

  }
}

/*
 * 
 * import java.util.*;
 * 
 * 
 * 
 * public class Change_case {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String str = sc.nextLine();
 * int u_count = 0, l_count = 0, d_count = 0, s_count = 0, spe_count = 0;
 * for (int i = 0; i < str.length(); i++) {
 * int a = (int) str.charAt(i);
 * if (a < 97 && a >= 65) {
 * u_count++;
 * } else if (a >= 97 && a <= 128)
 * l_count++;
 * else if (str.charAt(i) == ' ')
 * s_count++;
 * else if (a >= 48 && a <= 57)
 * d_count++;
 * else
 * spe_count++;
 * }
 * System.out.println("The no.of Upper letters : " + u_count);
 * System.out.println("The no.of Lower letters : " + l_count);
 * System.out.println("The no.of Digits : " + d_count);
 * System.out.println("The no.of Special letters : " + spe_count);
 * System.out.println("The no.of spaces : " + s_count);
 * }
 * }
 * 
 * 
 */