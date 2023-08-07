public class equilibriumpoint {
    
    static boolean isEqpoint(int arr[], int n){
        int sum=0;
        for(int i =0; i<n; i++){
            sum += arr[i];
        }
        int l_sum=0;
        for(int i=0; i<n; i++){
            if(l_sum==sum-arr[i])
                return true;
            l_sum +=arr[i];
            sum-=arr[i];
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println(isEqpoint(arr, n));
            }
    
}
//TIME = O(n)
//Auxiliary space = O(1)