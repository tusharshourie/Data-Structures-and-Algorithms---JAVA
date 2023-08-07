public class maxdifference {
    static int maxDiff(int arr[], int n){
        int res = arr[1] - arr[0], minval= arr[0];
        for(int j=1; j<n; j++){
            res = Math.max(res, arr[j]-minval);
            minval = Math.min(minval, arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        int n = arr.length;
        
        int maxDifference = maxDiff(arr, n);
        System.out.println("The maximum difference is: " + maxDifference);

    }
    
}
