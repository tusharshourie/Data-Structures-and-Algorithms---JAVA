//Given a sorted array and a sum, find if there is a triplet with given sum

  public class twopointerapproach2 {
    static boolean isTriplet(int arr[], int n, int x) {
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == x)
                    return true;
                else if (sum < x)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 8, 9, 20, 40};
        int n = arr.length;
        int x = 32;
        System.out.println(isTriplet(arr, n, x));
    }
}

//time = O(n^2)