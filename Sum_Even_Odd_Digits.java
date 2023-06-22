import java.util.*;
class Sum_Even_Odd_Digits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int num=n;
      int e_sum=0,e_count=0;
      int o_sum=0,o_count=0;
      while(n!=0)
        {
          int n1=n%10;
          if(n1%2==0)
          {
            e_sum+=n1;
            e_count++;
          }
          else   
          {
            o_sum+=n1;
            o_count++;
          }
          n=n/10;
        }
      System.out.println("The no of even digits and odd digits in a number "+num+" is: "+e_count+" and "+o_count+" and their sum is "+e_sum+" and "+o_sum);
      sc.close();
    }
  }