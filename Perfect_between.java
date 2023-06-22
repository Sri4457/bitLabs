import java.util.*;

class Perfect_between {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the start number");
    int a = sc.nextInt();
    System.out.println("Enter the stop number");
    int b = sc.nextInt();
    for (int j = a; j <= b; j++) {
      int sum = 0;
      for (int i = 1; i <= j / 2; i++) {
        if (j % i == 0)
          sum += i;
      }
      if (sum == j)
        System.out.println(j + " is a perfect number");
    }
    sc.close();
  }
}