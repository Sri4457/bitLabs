import java.util.*;
class Marks
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the project score, external score and internal score marks");
      int ps=sc.nextInt();
      int es=sc.nextInt();
      int is=sc.nextInt();
      if(ps>=50 && es>=50 && is>=50)
      {
        double total=(ps*70)/100 + (es*20)/100 + (is*10)/100;
      	if(total>=90)
      		System.out.println("A grade");
      	else if(total<90 && total>=70)
      		System.out.println("B grade");
      	else 
      		System.out.println("C grade");
      }
      else 
      {
        if(ps<50)
      	{
      		System.out.println("Subject project score has less than 50 marks "+ps);
      	}
      	if(es<50)
      	{
      		System.out.println("Subject external score has less than 50 marks "+es);
      	}
      	if(is<50)
      	{
      		System.out.println("Subject internal score has less than 50 marks "+is);
      	}
      }
      sc.close();
    }
  }