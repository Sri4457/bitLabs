import java.util.*;

class duplicate_arr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter elements into the array");
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    int[] visited = new int[n];
    System.out.println(visited[0]);
    for (int i = 0; i < n; i++) {
      if (visited[i] == 0) {
        int count = 0;
        for (int j = i; j < n; j++) {
          if (a[i] == a[j]) {
            visited[j] = ++count;
          }
        }
        if (count == 1)
          visited[i] = 0; // non repeated with 0 values
        else
          visited[i] = 1; // repeated element first time occurance value with 1
        System.out.println("The frequency of element " + a[i] + " is " + count);
      }
    }
    System.out.println("The Repeated Elements in array are");
    for (int i = 0; i < n; i++) {
      if (visited[i] == 1) {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println("\nThe Non-repeated Elements in array are");
    for (int i = 0; i < n; i++) {
      if (visited[i] == 0) {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println();
    sc.close();
  }
}