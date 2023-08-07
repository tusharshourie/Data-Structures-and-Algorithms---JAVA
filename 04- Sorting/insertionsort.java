public class insertionsort {
    static void insertionSort(int arr[], int n){
        for(int i =1; i<n; i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){  // if arr[j]>=key then this wont be stable
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
     public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSort(arr, n);

        System.out.println("\nArray after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}