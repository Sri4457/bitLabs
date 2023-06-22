import java.util.Scanner;
class Max {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many values do you want to enter ?");
    int n = s.nextInt(); // 6
    int min = Integer.MAX_VALUE;
    int min1=Integer.MAX_VALUE;
    int max=0;
    int max1=0;
    int num = 0;
    int sum=0;
    System.out.println("Enter " + n + " values : ");
    for (int i = 1; i <= n; i++) { // 34 12 78 39 76 22
      num = s.nextInt();
      if (max < num) {
        max1=max;
        max = num; // 78
      }
      else if(max1<num)
      {
        max1=num;
      }
      if(min>num)
      {
        min1=min;
        min=num;
      }
      else if(min1>num)
      {
        min1=num;
      }
      sum+=num;
    }
    System.out.println("The Min and second Min value "+min+" "+min1);
    System.out.println("The sum "+sum+ " and The Average is "+(sum/n));
    System.out.println("Max value: " + max+" "+max1);
  }
}