public class binarysearchiterative{
    static int bSearch(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]>x)
            high = mid-1;
            else
            low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int x = 30;
        System.out.println(bSearch(arr, n, x));
    }
}
//time comp = O(logn)
//O(logn) iterations in iterative binary search
//auxiliary space = O(1)

// BETTER THAN RECURSIVE BINARY SEARCH