import java.util.*;

class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0)
        count++;
    }
    if (count == 1)
      System.out.println(n + " it is a prime Number");
    sc.close();
  }
}