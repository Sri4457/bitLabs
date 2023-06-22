import java.util.*;
class Count_Of_Digits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int num=n;
      int count=0;
      while(n!=0)
        {
          count++;
          n=n/10;
        }
      System.out.println("The No. of digits in a number "+num+" is: "+count);
      sc.close();
    }
  }