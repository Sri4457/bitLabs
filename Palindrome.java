import java.util.*;
class Palindrome
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number ");
      int n=sc.nextInt();
      int temp=n;
      int rev=0;
      while(n!=0)
        {
          rev=rev*10+(n%10);
          n=n/10;
        }
      if(rev==temp)
      {
        System.out.println("The number "+temp+" is a Palindrome");
      }
      else  
      {
        System.out.println("The number "+temp+" is not a Palindrome");
      }
      sc.close();
    }
  }