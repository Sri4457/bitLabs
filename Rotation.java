import java.util.*;
class Rotation{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter s1");
    String s1=sc.next();
    System.out.println("Enter s2");
    String s2=sc.next();
    boolean flag=false;
    for(int i=0;i<s2.length();i++)
      {
        String new_str=s2.substring(i,s2.length())+s2.substring(0,i);
        if(new_str.equals(s1))
        {
          flag=true;
          break;
        }
      }
    System.out.println("Is s2 a rotation of s1? "+flag);
  }
}