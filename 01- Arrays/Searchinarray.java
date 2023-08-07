public class Searchinarray {
    static int search(int arr[], int n, int x)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {14, 20, 5, 78, 4};
        int x = 78;
        System.out.println(search(arr, arr.length, x));
    }
    
}
//TIME COMPLEXITY: O(n) for unsorted
// O(log n) for sorted