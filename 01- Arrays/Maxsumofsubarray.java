public class Maxsumofsubarray {
    static int maxsumsubarr(int arr[], int sum){
        int res= arr[0];
        int maxEnding = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
    public static void main(String[] args) {
     int arr[] = {-3, 8, -2, 4, -5, 6};  
     int x = maxsumsubarr(arr, 0);
     System.out.println(x); 
    }
    
}
//Time = O(n)