// m = no of children
// array elements = no. of chocolates  
// each child should exactly get 1 choc not more not less
// min diff between the min choc a child gets and max choc another child gets
// return diff between min aand max

import java.util.Arrays;

public class chocolatedistprob {
    public static int minDiff(int arr[], int n, int m) {
        if (m > n) {
            return -1;
        }
        
        Arrays.sort(arr);
        int res = arr[m - 1] - arr[0];
        
        for (int i = 1; (i + m - 1) < n; i++) {
            res = Math.min(res, (arr[i + m - 1] - arr[i]));
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; // Number of students
        int n = arr.length; // Number of packets
        
        int minDifference = minDiff(arr, n, m);
        
        System.out.println("Minimum difference is: " + minDifference);
    }
}


//Time = O(nlogn)
