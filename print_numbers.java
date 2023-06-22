import java.util.*;
class print_numbers
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first Number:");
      int n1=sc.nextInt();
      System.out.println("Enter Second Number:");
      int n2=sc.nextInt();
      if(n1<=n2)
      {
        for(int i=n1;i<=n2;i++)
          System.out.println(i);
      }
      else
      {

        for(int i=n1;i>=n2;i--)
          System.out.println(i);
      }
      sc.close();
    }
  }