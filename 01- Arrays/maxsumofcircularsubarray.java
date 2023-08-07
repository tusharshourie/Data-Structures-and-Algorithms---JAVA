public class maxsumofcircularsubarray {
    static int NormalMaxSum(int arr[], int n){
        int res= arr[0];
        int maxEnding = arr[0];
        for(int i=1; i<n; i++)
        {
            maxEnding=Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    static int overallMaxSum(int arr[], int n)
    {
        int max_normal = NormalMaxSum(arr, n);
        if(max_normal<0)
        return max_normal;
        int arr_sum=0;
        for(int i =0; i<n; i++){
            arr_sum += arr[i];
            arr[i]= -arr[i];
        }
        int max_circular= arr_sum+NormalMaxSum(arr, n);
        return Math.max(max_normal, max_circular);
    }
    public static void main(String[] args) {
        int arr[] = {8, -4, 3, -5, 4};
        int n = arr.length;
        int x = overallMaxSum(arr, n);
        System.out.println(x);
    }
    
}
//TIME = Theta(n)