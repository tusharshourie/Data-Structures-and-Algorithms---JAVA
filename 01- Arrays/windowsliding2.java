/*Given an unsorted array of non negative integers.find if there
is a subarray with given sum*/

public class windowsliding2 {
    static boolean winslidesubarray(int arr[], int n, int sum){
        int curr_sum = arr[0];
        int s =0;
        for(int i=1; i<n; i++)
        {
            //clean the previous window
            while(curr_sum>sum && s<i-1)
            {
                curr_sum -= arr[s]; 
                s++;
            }
            if(curr_sum==sum)
            return true;
            if(i<n)
            curr_sum += arr[i];
        }
        return (curr_sum==sum);
    }
    public static void main(String[] args) {
     int arr[] = {34,4,20,3,10,5};
     int n = arr.length;
     int sum = 33;
     System.out.println(winslidesubarray(arr, n, sum));   
    }
}
//TIME= O(n)