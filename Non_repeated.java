import java.util.*;
class Non_repeated
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();//string reading
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          int j=i+1;
          for(j=i+1;j<str.length();j++)
            {
              if(ch==str.charAt(j))
                break;
            }
          if(j==str.length())
          {
            System.out.println(ch);
            break;
          }
        }
      sc.close();
    }
  }