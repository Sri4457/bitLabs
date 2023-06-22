import java.util.*;

public class factors_count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the count of the factors of it");
    int n = sc.nextInt();
    int count=0;
   for(int i=1;i<=n/2;i++) {
      if (n % i == 0)
        count++;
    }
    System.out.println("The No.of Factors for the number "+n+ " other than "+n+" is: "+count);
    sc.close();
  }
}