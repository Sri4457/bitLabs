import java.util.*;

public class factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find factors of it");
    int n = sc.nextInt();
    for(int i=1;i<=n/2;i++)
    {
      if (n % i == 0)
        System.out.println("The one of the factor of "+n+" is " + i);
    }
    sc.close();
  }
}