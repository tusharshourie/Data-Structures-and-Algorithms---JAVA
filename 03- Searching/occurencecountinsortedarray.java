public class occurencecountinsortedarray {
    static int countocc(int arr[], int n, int x){
        int first = firstoccurence(arr, n, x);
        if(first == -1)
        return 0;
        else 
        return (lastoccurence(arr, n, x) - first +1);  //last index - first index +1 = total no of occurences
    }

    static int firstoccurence(int arr[], int n, int x){
        int low=0, high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else{
                if(mid==0|| arr[mid-1]!=arr[mid])
                    return mid;
                else 
                high = mid-1;
            }
        }
            return -1;
    }

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
        int arr[] = {5,10,20,20,20,30,30};
        int n = arr.length;
        int x = 20;
        System.out.println(countocc(arr, n, x));
    }
}
// time = O(log(n))