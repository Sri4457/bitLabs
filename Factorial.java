import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number ");
    int n = sc.nextInt();
    int prod = 1;
    for (int i = n; i >= 1; i--)
      prod = prod * i;
    System.out.println("Factorial of number " + n + " is: " + prod);
    sc.close();
  }

}