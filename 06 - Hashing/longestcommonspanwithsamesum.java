//longest common span with same sum in two binary arrays
// import java.util.*;

import java.util.HashMap;

public class longestcommonspanwithsamesum {
    // static int maxCommon(boolean arr1[], boolean arr2[], int n){
    //       if (arr1.length != arr2.length) {
    //         throw new IllegalArgumentException("Input arrays must have the same length.");
    //     }
        
    //     int res = 0;
    //     for (int i = 0; i < n; i++) {
    //         int sum1 = 0;
    //         int sum2 = 0;
    //         for (int j = i; j < n; j++) {
    //             // Convert boolean values to integers (true -> 1, false -> 0)
    //             int val1 = arr1[j] ? 1 : 0;
    //             int val2 = arr2[j] ? 1 : 0;

    //             sum1 = sum1 + val1;
    //             sum2 = sum2 + val2;
    //             if (sum1 == sum2)
    //                 res = Math.max(res, j - i + 1);
    //         }
    //     }
    //     return res;
    // }

    static int maxCommon(boolean arr1[], boolean arr2[], int n){
          if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Input arrays must have the same length.");
        }

        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val1 = arr1[i] ? 1 : 0;
            int val2 = arr2[i] ? 1 : 0;
            int diff = val1 - val2;
            sum += diff;

            if (sum == 0) {
                res = i + 1; // Common span starts from index 0 to i
            } else if (sumIndexMap.containsKey(sum)) {
                int prevIndex = sumIndexMap.get(sum);
                res = Math.max(res, i - prevIndex);
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        boolean arr1[] = {true, false, true, false, true, true, false};
        boolean arr2[] = {false, true, false, true, true, false, false};
        int n = arr1.length;

        int result = maxCommon(arr1, arr2, n);
        System.out.println("The length of the longest common span with the same sum is: " + result);
    }
}
