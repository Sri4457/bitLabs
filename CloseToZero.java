
import java.util.Arrays;

public class CloseToZero {

  public static void main(String[] args) {
    int[] nums = { 1, 5, -4, -2, 9, -7, 3 };
    int[] result = new int[2];
    result[0] = nums[0];
    result[1] = nums[1];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (Math.abs(nums[i] + nums[j]) < (Math.abs(result[0] + result[1]))) {
          result[0] = nums[i];
          result[1] = nums[j];
        } else if (Math.abs(nums[i] + nums[j]) == (Math.abs(result[0] + result[1]))) {
          int num1 = Math.min(nums[i], nums[j]);
          int num2 = Math.min(result[0], result[1]);
          if (num1 < num2 && num1 >= 0) {
            result[0] = nums[i];
            result[j] = nums[j];
          }
        }
      }
    }
    Arrays.sort(result);
    System.out.println(Arrays.toString(result));
  }
}
