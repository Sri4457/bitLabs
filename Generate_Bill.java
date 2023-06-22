import java.util.*;
class Generate_Bill
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Units");
      int n=sc.nextInt();
      double sum=0;
      if(n<=50)
      {
        sum=sum+(n*3.5);
      }
      else if(n<=150)
      {
        sum=(50*3.5)+(n-50)*4.8;
      }
      else if(n<=250)
      {
        sum=(50*3.5)+(100)*4.8+(n-150)*7.2;
      }
      else 
        sum=(50*3.5)+(100)*4.8+(100)*7.2+(n-250)*9.2;
      System.out.println("The Total Bill generated for "+n+" Units is: "+sum);
      sc.close();
    }
  }