import java.util.*;
public class longestsubarraywithgivensum {
    static int maxlen(int arr[], int n, int sum) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int pre_sum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            pre_sum += arr[i];
            if (pre_sum == sum) {
                res = i + 1;
            }

            if (!m.containsKey(pre_sum))
                m.put(pre_sum, i);

            if (m.containsKey(pre_sum - sum))
                res = Math.max(res, i - m.get(pre_sum - sum));
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 5, -6, 6, 2, 2 };
        int n = arr.length;
        int sum = 4;
        System.out.println(maxlen(arr, n, sum));
    }
}
//TIME= O(n)
//SPACE=O(n)