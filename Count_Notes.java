import java.util.*;
class Count_Notes
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n%100==0)
      {
        int n500=n/500;
        n=n%500;
        int n200=n/200;
        n=n/100;
        int n100=n/100;
        System.out.println("The five hundered notes: "+n500+"\nThe Two Hundered Notes: "+n200+"\nThe one hundered Notes: "+n100);
      }
      else 
      {
        System.out.println("Enter amount in crt format");
      }
      sc.close();
    }
  }