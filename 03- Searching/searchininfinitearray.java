// the infinite array is sorted
public class searchininfinitearray {

    static int search(int arr[], int x) {
        if (arr[0] == x) return 0;
        
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
        }
        
        if (arr[i] == x) return i;
        
        return bSearch(arr, i / 2 + 1, i - 1, x);
    }

    static int bSearch(int arr[], int low, int high, int x) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return bSearch(arr, low, mid - 1, x);
        else return bSearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 1000 };
        int x = 100;
        System.out.println(search(arr, x));
    }
}

// time = O(log(position))