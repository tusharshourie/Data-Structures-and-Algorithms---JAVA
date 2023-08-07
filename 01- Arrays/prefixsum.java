public class prefixsum {
    static int[] prefixSum(int arr[], int n) {
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        return preSum;
    }

    static int getSum(int preSum[], int l, int r) {
        if (l != 0)
            return preSum[r] - preSum[l - 1];
        else
            return preSum[r];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] preSum = prefixSum(arr, n);
        int l = 2;
        int r = 4;
        int sum = getSum(preSum, l, r);
        System.out.println("Sum from index " + l + " to " + r + ": " + sum);
    }
}
//TIME = O(1)
