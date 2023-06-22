import java.util.Scanner;
public class Consecutive_Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number ");
    int a = sc.nextInt();
    System.out.print("Enter the second number ");
    int b = sc.nextInt();
   // int count=0;
    boolean flag1=true;
    for (int i = a; i <= b; i++)
    {
      boolean flag = false;
      for (int j = 2; j <=i/2; j++) 
      {
        if (i % j == 0) 
        {
          flag = true;
          break;
        }
      }
      if (flag==false && i!=1)
      {
        // count++;
        if(flag1) //count%2!=0
        {
          System.out.println(i); 
          flag1=false; 
        }
        else 
        {
          flag1=true;
        }
      }
    }
    sc.close();
  }

}