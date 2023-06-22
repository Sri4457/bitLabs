import java.util.*;
class Gross_sal
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the salary ");
      int sal=sc.nextInt();
      double hra=0,da=0,total=0;
      if(sal<=10000)
      {
        hra=(sal*20)/100;
        da=(sal*80)/100;
      }
      else if(sal<=20000)
      {
        hra=(sal*25)/100;
        da=(sal*90)/100;
      }
      else 
      {
        hra=(sal*30)/100;
        da=(sal*95)/100;
      }
      total=sal+hra+da;
      System.out.println("The total gross salary for the salary "+sal+" is : "+total);
      sc.close();
    }
  }