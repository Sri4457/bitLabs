import java.util.Scanner;

public class Prime_Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number ");
    int a = sc.nextInt();
    System.out.print("Enter the second number ");
    int b = sc.nextInt();
    for (int i = a; i <= b; i++) {
      boolean flag = false;
      for (int j = 2; j <=i/2; j++) {
        if (i % j == 0) {
          flag = true;
          break;
        }
      }
      if (!flag && i!=1)
        System.out.println(i);
    }
    sc.close();
  }

}