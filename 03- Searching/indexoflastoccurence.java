public class indexoflastoccurence {
    static int lastoccurence(int arr[], int n, int x){
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x)
                low = mid+1;
            else if(arr[mid]>x)
                high = mid-1;
            else{
                if(mid == n-1 || arr[mid+1]!= arr[mid])
                    return mid;
                else
                    return low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,10,10,20,20};
        int n = arr.length;
        int x = 20;
        System.out.println(lastoccurence(arr, n, x));
    }
}

//time = O(log(n)) 