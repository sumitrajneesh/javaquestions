import java.util.ArrayList;

public class Solution1 {


    static ArrayList<Integer> subarraySum(int[] arr, int target){
        ArrayList<Integer> res = new ArrayList<>();
        int beg = 0;
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            while(sum > target){
                sum -= arr[beg];
                beg++;
            }

            if(sum == target || arr[i] == target) {
                res.add(beg+1);
                res.add(i+1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}
