public class selectionsort {
    static final int INF = Integer.MAX_VALUE;

    // //NAIVE APPROACH
    // static void selectSort(int arr[], int n) {
    //     int[] temp = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         int min_ind = i;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] < arr[min_ind])
    //                 min_ind = j;
    //         }
    //         temp[i] = arr[min_ind];
    //         arr[min_ind] = arr[i];
    //         arr[i] = temp[i];
    //     }
    // }
    static void selectSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind])
                    min_ind = j;
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        selectSort(arr, n);

        System.out.println("\nArray after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}