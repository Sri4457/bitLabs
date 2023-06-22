import java.util.*;
class Greater_num
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers to find greatest number ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
        System.out.println("The greatest number is "+a);
      else  
        System.out.println("The greatest number is "+b);
      sc.close();
    }
  }