import java.util.*;

class june30_array {
  public static void main(String[] args) {
    int[][] arr1 = { { 1, 2 }, { 4, 5 } };
    int[][] arr2 = { { 6, 7 }, { 8, 9 } };
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print((arr1[i][j] + arr2[i][j]) + " ");
      }
      System.out.println();
    }
    String str = Arrays.toString(arr1[0]);
    System.out.println(str);
  }
}