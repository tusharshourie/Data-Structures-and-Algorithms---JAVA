import java.util.Arrays;

public class minimumdifferenceinanarray {
    static int getMinDiff(int arr[], int n){
      Arrays.sort(arr);
      int res = Integer.MAX_VALUE;
      for(int i =1; i<n;i++){
        res = Math.min(res, arr[i]-arr[i-1]);
      }  
      return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,8,1,4};
        int n = arr.length;
        System.out.println(getMinDiff(arr, n));
    }
}
//Time = O(nlogn)