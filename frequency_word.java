import java.util.*;

class frequency_word {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] arr = str.split(" ");
    int[] a = new int[arr.length];
    for (int i = 0; i < a.length; i++)
      a[i] = 0;
    int[] freg = new int[a.length];
    for (int i = 0; i < arr.length; i++) {
      if (a[i] == 0) {
        int count = 0;
        for (int j = i; j < arr.length; j++) {
          if (arr[j].equalsIgnoreCase(arr[i])) {
            count++;
            a[j] = 1;
          }
        }
        // System.out.println(arr[i] + " the occurances are : " + count);
        freg[i] = count;
      }
    }
    int max = 0, ind = 0;
    for (int i = 0; i < freg.length; i++) {
      if (max < freg[i]) {
        max = freg[i];
        ind = i;
      }
      if (freg[i] != 0) {
        System.out.println("The string is " + arr[i] + " the density is " + (((float) freg[i] * 100) / arr.length));
      }
    }
    System.out.println("The string with highest density is " + arr[ind] + " the density is "
        + (((float) freg[ind] * 100) / arr.length));
    sc.close();
  }
}