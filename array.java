import java.util.*;
class array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
    for(int a:arr)
      {
        max=Math.max(max, a);
        min=Math.min(min, a);
      }
    System.out.println("The Maximum number : "+max);
    System.out.println("The Minimum number : "+min);
    sc.close();
  }
}