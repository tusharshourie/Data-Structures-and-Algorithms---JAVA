public class bubblesort {
    // static void bubbleSort(int arr[], int n) {
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }

    //OPTIMIZED BUBBLE SORT
    static void bubbleSort(int arr[], int n){
        for(int i =0; i<n-1; i++){
            boolean swapped = false;
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                   swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 8, 20, 5};
        int n = arr.length;
        bubbleSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//Time = O(n^2)