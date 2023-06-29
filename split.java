import java.util.*;
class split{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] arr=str.split(" ");
    int max=0;
    String f_str="";
    for(int i=0;i<arr.length;i++)
      {
        if(max<arr[i].length())
        {
          max=arr[i].length();
          f_str=arr[i];
        }
      }
    System.out.println("The first word with highest length is : "+f_str+" with length : "+max);
    sc.close();
  }
}