//no of elements which are continuous
// import java.util.Arrays;
import java.util.HashMap;

public class longestconsecutivesubsequence {
    
    // static int findLongest(int arr[], int n){
    //     Arrays.sort(arr);
    //     int res=1;
    //     int curr=1;
    //     for(int i=1;i<n;i++){
    //         if(arr[i]==arr[i-1]+1)
    //             curr++;
    //         else{
    //             res=Math.max(curr, res);
    //             curr=1;
    //         }
    //     }
    //     res=Math.max(res, curr);
    //     return res;
    // }

    static int findLongest(int arr[], int n) {
        HashMap<Integer, Boolean> numSet = new HashMap<>();
        for (int num : arr) {
            numSet.put(num, true);
        }

        int res = 0;
        for (int num : arr) {
            if (!numSet.containsKey(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (numSet.containsKey(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                res = Math.max(res, currStreak);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,9,3,4,2,20,21};
        int n=arr.length;
        System.out.println(findLongest(arr, n));
    }
}
