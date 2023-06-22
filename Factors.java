import java.util.*;

public class Factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find factors of it");
    int n = sc.nextInt();
    int i = 1;
    while (i <= n / 2) {
      if (n % i == 0)
        System.out.println("The one of the factor of " + n + " is " + i);
      i++;
    }
    sc.close();
  }
}