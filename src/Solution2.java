import java.util.Arrays;

public class Solution2 {
    public static int missingNumber(int[] arr) {

        //Calculate the sum of array elements

        int n = arr.length + 1;

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int exSum = (n * (n + 1)) / 2;
        return exSum - sum;
    }
}
