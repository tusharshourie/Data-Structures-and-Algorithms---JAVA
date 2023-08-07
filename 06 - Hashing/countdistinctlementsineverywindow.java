//count the no of dicstinct elements present in a given window in an array

import java.util.HashMap;
 
class CountDistinctWindow {
    static void countDistinct(int arr[], int K)
    {
        
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
        for (int i = 0; i < K; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

        System.out.println(hM.size());
        for (int i = K; i < arr.length; i++) {
            if (hM.get(arr[i - K]) == 1) {
                hM.remove(arr[i - K]);
            }
 
            else
                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
 
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
            System.out.println(hM.size());
        }
    }
 
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40,10};
        int k=4;
        countDistinct(arr, k);
    }
}
