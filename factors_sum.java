import java.util.*;

public class factors_sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the sum of the factors of it");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0)
        sum += i;
    }
    System.out.println("The sum of Factors for the number " + n + " other than "+n+" is: " + sum);
    sc.close();
  }
}