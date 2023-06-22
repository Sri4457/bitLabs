import java.util.*;
class Leap_Year
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Leap Year ");
      int n=sc.nextInt();
      if(n%400==0)
        System.out.println(n+" It is a Leap Year");
      else if(n%100!=0 && n%4==0)
        System.out.println(n+" It is Leap Year");
      else 
        System.out.println(n+" It is not a Leap Year");
      sc.close();
    }
  }